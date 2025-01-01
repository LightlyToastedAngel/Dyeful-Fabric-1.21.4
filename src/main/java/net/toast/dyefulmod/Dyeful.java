package net.toast.dyefulmod;

import net.fabricmc.api.ModInitializer;

import net.toast.dyefulmod.block.ModBlocks;
import net.toast.dyefulmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Dyeful implements ModInitializer {
	public static final String MOD_ID = "dyefulmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}