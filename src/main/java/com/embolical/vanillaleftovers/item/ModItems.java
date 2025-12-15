package com.embolical.vanillaleftovers.item;

import com.embolical.vanillaleftovers.VanillaLeftovers;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {
    // INITIAL ITEM DATA
   // public static final Item EMERALD_SWORD = registerItem("emerald_sword");

    // ITEM REGISTRY HELPER
    private static Item registerItem(String name) {
        Identifier id = Identifier.of(VanillaLeftovers.MOD_ID, name);
        RegistryKey<Item> key = RegistryKey.of(RegistryKeys.ITEM, id);
        Item.Settings settings = new Item.Settings().registryKey(key);
        return Registry.register(Registries.ITEM, key, new Item(settings));
    }
    // ITEM REGISTRY LOGGER
    public static void registerModItems() {
        VanillaLeftovers.LOGGER.info("Registering Mod Items for " + VanillaLeftovers.MOD_ID);

        //      --      ITEM GROUPING       --       //
        // COMBAT

//       ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(fabricItemGroupEntries -> {
//            fabricItemGroupEntries.add(EMERALD_SWORD);
//        });

    }
}
