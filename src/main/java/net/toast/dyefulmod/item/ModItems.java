package net.toast.dyefulmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.toast.dyefulmod.Dyeful;

public class ModItems {
    public static final Item PASTEL_BLUE_DYE = registerItem("pastel_blue_dye", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Dyeful.MOD_ID,"pastel_blue_dye")))));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Dyeful.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Dyeful.LOGGER.info("Registering Mod Items for " + Dyeful.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(PASTEL_BLUE_DYE);
        });
    }
}