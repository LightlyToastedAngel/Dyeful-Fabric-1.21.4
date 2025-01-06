package net.toast.dyefulmod.block;

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
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.toast.dyefulmod.Dyeful;



public class ModBlocks {
    //Blocks
    public static final Block PASTEL_BLUE_CONCRETE = registerBlock("pastel_blue_concrete",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Dyeful.MOD_ID, "pastel_blue_concrete")))
                    .instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.8F)));
    public static final Block PASTEL_CYAN_CONCRETE = registerBlock("pastel_cyan_concrete",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Dyeful.MOD_ID, "pastel_cyan_concrete")))
                    .instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.8F)));
    public static final Block PASTEL_GREEN_CONCRETE = registerBlock("pastel_green_concrete",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Dyeful.MOD_ID, "pastel_green_concrete")))
                    .instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.8F)));
    public static final Block PASTEL_ORANGE_CONCRETE = registerBlock("pastel_orange_concrete",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Dyeful.MOD_ID, "pastel_orange_concrete")))
                    .instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.8F)));
    public static final Block PASTEL_PINK_CONCRETE = registerBlock("pastel_pink_concrete",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Dyeful.MOD_ID, "pastel_pink_concrete")))
                    .instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.8F)));
    public static final Block PASTEL_RED_CONCRETE = registerBlock("pastel_red_concrete",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Dyeful.MOD_ID, "pastel_red_concrete")))
                    .instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.8F)));
    public static final Block PASTEL_VIOLET_CONCRETE = registerBlock("pastel_violet_concrete",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Dyeful.MOD_ID, "pastel_violet_concrete")))
                    .instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.8F)));
    public static final Block PASTEL_YELLOW_CONCRETE = registerBlock("pastel_yellow_concrete",
            new Block(AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Dyeful.MOD_ID, "pastel_yellow_concrete")))
                    .instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.8F)));

    //Concrete Powder Blocks
    public static final Block PASTEL_BLUE_CONCRETE_POWDER = registerBlock("pastel_blue_concrete_powder",
            new ConcretePowderBlock(PASTEL_BLUE_CONCRETE, AbstractBlock.Settings.create()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Dyeful.MOD_ID, "pastel_blue_concrete_powder")))
            .instrument(NoteBlockInstrument.SNARE).strength(0.5F).sounds(BlockSoundGroup.SAND)
    ));
    public static final Block PASTEL_CYAN_CONCRETE_POWDER = registerBlock("pastel_cyan_concrete_powder",
            new ConcretePowderBlock(PASTEL_CYAN_CONCRETE, AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Dyeful.MOD_ID, "pastel_cyan_concrete_powder")))
                    .instrument(NoteBlockInstrument.SNARE).strength(0.5F).sounds(BlockSoundGroup.SAND)
            ));
    public static final Block PASTEL_GREEN_CONCRETE_POWDER = registerBlock("pastel_green_concrete_powder",
            new ConcretePowderBlock(PASTEL_GREEN_CONCRETE, AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Dyeful.MOD_ID, "pastel_green_concrete_powder")))
                    .instrument(NoteBlockInstrument.SNARE).strength(0.5F).sounds(BlockSoundGroup.SAND)
            ));
    public static final Block PASTEL_ORANGE_CONCRETE_POWDER = registerBlock("pastel_orange_concrete_powder",
            new ConcretePowderBlock(PASTEL_ORANGE_CONCRETE, AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Dyeful.MOD_ID, "pastel_orange_concrete_powder")))
                    .instrument(NoteBlockInstrument.SNARE).strength(0.5F).sounds(BlockSoundGroup.SAND)
            ));
    public static final Block PASTEL_PINK_CONCRETE_POWDER = registerBlock("pastel_pink_concrete_powder",
            new ConcretePowderBlock(PASTEL_PINK_CONCRETE, AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Dyeful.MOD_ID, "pastel_pink_concrete_powder")))
                    .instrument(NoteBlockInstrument.SNARE).strength(0.5F).sounds(BlockSoundGroup.SAND)
            ));
    public static final Block PASTEL_RED_CONCRETE_POWDER = registerBlock("pastel_red_concrete_powder",
            new ConcretePowderBlock(PASTEL_RED_CONCRETE, AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Dyeful.MOD_ID, "pastel_red_concrete_powder")))
                    .instrument(NoteBlockInstrument.SNARE).strength(0.5F).sounds(BlockSoundGroup.SAND)
            ));
    public static final Block PASTEL_VIOLET_CONCRETE_POWDER = registerBlock("pastel_violet_concrete_powder",
            new ConcretePowderBlock(PASTEL_VIOLET_CONCRETE, AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Dyeful.MOD_ID, "pastel_violet_concrete_powder")))
                    .instrument(NoteBlockInstrument.SNARE).strength(0.5F).sounds(BlockSoundGroup.SAND)
            ));
    public static final Block PASTEL_YELLOW_CONCRETE_POWDER = registerBlock("pastel_yellow_concrete_powder",
            new ConcretePowderBlock(PASTEL_YELLOW_CONCRETE, AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Dyeful.MOD_ID, "pastel_yellow_concrete_powder")))
                    .instrument(NoteBlockInstrument.SNARE).strength(0.5F).sounds(BlockSoundGroup.SAND)
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
            fabricItemGroupEntries.add(PASTEL_CYAN_CONCRETE);
            fabricItemGroupEntries.add(PASTEL_GREEN_CONCRETE);
            fabricItemGroupEntries.add(PASTEL_ORANGE_CONCRETE);
            fabricItemGroupEntries.add(PASTEL_PINK_CONCRETE);
            fabricItemGroupEntries.add(PASTEL_RED_CONCRETE);
            fabricItemGroupEntries.add(PASTEL_VIOLET_CONCRETE);
            fabricItemGroupEntries.add(PASTEL_YELLOW_CONCRETE);

            fabricItemGroupEntries.add(PASTEL_BLUE_CONCRETE_POWDER);
            fabricItemGroupEntries.add(PASTEL_CYAN_CONCRETE_POWDER);
            fabricItemGroupEntries.add(PASTEL_GREEN_CONCRETE_POWDER);
            fabricItemGroupEntries.add(PASTEL_ORANGE_CONCRETE_POWDER);
            fabricItemGroupEntries.add(PASTEL_PINK_CONCRETE_POWDER);
            fabricItemGroupEntries.add(PASTEL_RED_CONCRETE_POWDER);
            fabricItemGroupEntries.add(PASTEL_VIOLET_CONCRETE_POWDER);
            fabricItemGroupEntries.add(PASTEL_YELLOW_CONCRETE_POWDER);
        });
    }
}
