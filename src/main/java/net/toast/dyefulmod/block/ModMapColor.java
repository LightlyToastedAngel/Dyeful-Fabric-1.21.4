package net.toast.dyefulmod.block;

import com.google.common.base.Preconditions;
import net.minecraft.util.math.ColorHelper;

/**
 * Represents the surface color of a block when rendered from the {@link net.minecraft.client.render.MapRenderer}.
 * Color names refer to a material or an object which refers to their vanilla Minecraft textures, not their real-world counterparts, eg. "emerald green".
 * Names are in the form of either <i>blockReference_baseColor</i> or <i>color</i>.
 * 
 * <p>When the map is rendered, the {@link Brightness#brightness} value is added to the
 * base color. The "rendered color" is internally represented as a byte; the first six bits
 * indicate the base color, and the last two bits indicate the brightness. This value is returned
 * from {@link ModMapColor#getRenderColorByte} and is passed to {@link ModMapColor#getRenderColor}.
 */
public class ModMapColor {
	private static final ModMapColor[] COLORS = new ModMapColor[64];
	public static final ModMapColor CLEAR = new ModMapColor(0, 0);
	public static final ModMapColor PASTEL_BLUE = new ModMapColor(1, 174213235);
	public final int color;
	public final int id;

	private ModMapColor(int id, int color) {
		if (id >= 0 && id <= 63) {
			this.id = id;
			this.color = color;
			COLORS[id] = this;
		} else {
			throw new IndexOutOfBoundsException("Map colour ID must be between 0 and 63 (inclusive)");
		}
	}

	public int getRenderColor(Brightness brightness) {
		return this == CLEAR ? 0 : ColorHelper.scaleRgb(ColorHelper.fullAlpha(this.color), brightness.brightness);
	}

	public static ModMapColor get(int id) {
		Preconditions.checkPositionIndex(id, COLORS.length, "material id");
		return getUnchecked(id);
	}

	private static ModMapColor getUnchecked(int id) {
		ModMapColor modMapColor = COLORS[id];
		return modMapColor != null ? modMapColor : CLEAR;
	}

	public static int getRenderColor(int colorByte) {
		int i = colorByte & 0xFF;
		return getUnchecked(i >> 2).getRenderColor(Brightness.get(i & 3));
	}

	public byte getRenderColorByte(Brightness brightness) {
		return (byte)(this.id << 2 | brightness.id & 3);
	}

	public static enum Brightness {
		LOW(0, 180),
		NORMAL(1, 220),
		HIGH(2, 255),
		LOWEST(3, 135);

		private static final Brightness[] VALUES = new Brightness[]{LOW, NORMAL, HIGH, LOWEST};
		public final int id;
		public final int brightness;

		private Brightness(final int id, final int brightness) {
			this.id = id;
			this.brightness = brightness;
		}

		public static Brightness validateAndGet(int id) {
			Preconditions.checkPositionIndex(id, VALUES.length, "brightness id");
			return get(id);
		}

		static Brightness get(int id) {
			return VALUES[id];
		}
	}
}
