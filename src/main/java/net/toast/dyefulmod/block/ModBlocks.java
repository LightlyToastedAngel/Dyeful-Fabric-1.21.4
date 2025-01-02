package net.toast.dyefulmod.block;

import java.util.function.Function;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.toast.dyefulmod.Dyeful;



public class ModBlocks {
    public static final Block PASTEL_BLUE_CONCRETE = registerBlock("pastel_blue_concrete",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Dyeful.MOD_ID, "pastel_blue_concrete")))
                    .instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.8F)));

    public static final Block PASTEL_BLUE_CONCRETE_POWDER = registerBlock("pastel_blue_concrete_powder", new ConcretePowderBlock(PASTEL_BLUE_CONCRETE, AbstractBlock.Settings.create()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Dyeful.MOD_ID, "pastel_blue_concrete_powder")))
            .instrument(NoteBlockInstrument.SNARE).strength(0.4F)
    ));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Dyeful.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Dyeful.MOD_ID, name),
                new BlockItem(block, new Item.Settings()
                        .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Dyeful.MOD_ID, name))).useBlockPrefixedTranslationKey()));
    }



    public static void registerModBlocks() {
        Dyeful.LOGGER.info("Registering Mod Block for " + Dyeful.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(PASTEL_BLUE_CONCRETE);
            fabricItemGroupEntries.add(PASTEL_BLUE_CONCRETE_POWDER);
        });
    }

    public static Block register(RegistryKey<Block> key, Function<AbstractBlock.Settings, Block> factory, AbstractBlock.Settings settings) {
        Block block = (Block)factory.apply(settings.registryKey(key));
        return Registry.register(Registries.BLOCK, key, block);
    }

    private static RegistryKey<Block> keyOf(String id) {
        return RegistryKey.of(RegistryKeys.BLOCK, Identifier.ofVanilla(id));
    }

    private static Block register(String id, Function<AbstractBlock.Settings, Block> factory, AbstractBlock.Settings settings) {
        return register(keyOf(id), factory, settings);
    }

    static {
        for (Block block : Registries.BLOCK) {
            for (BlockState blockState : block.getStateManager().getStates()) {
                Block.STATE_IDS.add(blockState);
                blockState.initShapeCache();
            }
        }
    }
}
