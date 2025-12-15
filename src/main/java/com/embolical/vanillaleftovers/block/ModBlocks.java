package com.embolical.vanillaleftovers.block;

import com.embolical.vanillaleftovers.VanillaLeftovers;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.*;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModBlocks {
    // INITIAL BLOCK DATA
    // STAIRS
    public static final Block SMOOTH_STONE_STAIRS =
            registerBlock("smooth_stone_stairs", settings -> new StairsBlock(
                    Blocks.SMOOTH_STONE.getDefaultState(), settings
                    .strength(2.0F, 6.0F)
                    .requiresTool()));

    public static final Block QUARTZ_BRICK_STAIRS =
            registerBlock("quartz_brick_stairs", settings -> new StairsBlock(
                    Blocks.QUARTZ_BRICKS.getDefaultState(), settings
                    .strength(2.0F, 6.0F)
                    .requiresTool()));

    // SLABS
    public static final Block QUARTZ_BRICK_SLAB =
            registerBlock("quartz_brick_slab", settings -> new SlabBlock(
                    settings.strength(2.0F, 6.0F)
                            .requiresTool()));

    // BUTTONS
    public static final Block POLISHED_DEEPSLATE_BUTTON =
            registerBlock("polished_deepslate_button", settings -> new ButtonBlock(
                    BlockSetType.POLISHED_BLACKSTONE, 2,
                    settings.strength(2.0F, 6.0F)
                            .requiresTool()
                            .noCollision()));

    // PRESSURE PLATES
    public static final Block POLISHED_DEEPSLATE_PRESSURE_PLATE =
            registerBlock("polished_deepslate_pressure_plate", settings -> new PressurePlateBlock(
                    BlockSetType.POLISHED_BLACKSTONE,
                    settings.strength(2.0F, 6.0F)
                            .requiresTool()));

    // WALLS
    public static final Block POLISHED_ANDESITE_WALL =
            registerBlock("polished_andesite_wall", settings -> new WallBlock(
                    settings.strength(2.0F, 6.0F)
                            .requiresTool()));

    public static final Block POLISHED_GRANITE_WALL =
            registerBlock("polished_granite_wall", settings -> new WallBlock(
                    settings.strength(2.0F, 6.0F)
                            .requiresTool()));

    public static final Block POLISHED_DIORITE_WALL =
            registerBlock("polished_diorite_wall", settings -> new WallBlock(
                    settings.strength(2.0F, 6.0F)
                            .requiresTool()));

    public static final Block DARK_PRISMARINE_WALL =
            registerBlock("dark_prismarine_wall", settings -> new WallBlock(
                    settings.strength(2.0F, 6.0F)
                            .requiresTool()));

    public static final Block PRISMARINE_BRICK_WALL =
            registerBlock("prismarine_brick_wall", settings -> new WallBlock(
                    settings.strength(2.0F, 6.0F)
                            .requiresTool()));

    public static final Block PURPUR_WALL =
            registerBlock("purpur_wall", settings -> new WallBlock(
                    settings.strength(2.0F, 6.0F)
                            .requiresTool()));

    // FENCES
//    public static final Block RED_NETHER_BRICK_FENCE =
//            registerBlock("red_nether_brick_fence", settings -> new FenceBlock(
//                    settings.strength(2.0F, 6.0F)
//                            .requiresTool()));

    // BLOCK REGISTRY HELPERS
    private static <T extends Block> T registerBlock(
            String name,
            Function<AbstractBlock.Settings, T> blockFactory
    ) {
        Identifier id = Identifier.of(VanillaLeftovers.MOD_ID, name);

        RegistryKey<Block> blockKey = RegistryKey.of(RegistryKeys.BLOCK, id);
        RegistryKey<Item> itemKey = RegistryKey.of(RegistryKeys.ITEM, id);

        AbstractBlock.Settings blockSettings =
                AbstractBlock.Settings.create().registryKey(blockKey);

        T block = blockFactory.apply(blockSettings);

        BlockItem item = new BlockItem(
                block,
                new Item.Settings().registryKey(itemKey)
        );

        Registry.register(Registries.BLOCK, blockKey, block);
        Registry.register(Registries.ITEM, itemKey, item);

        return block;
    }

//    private static Block registerBlock(String name, AbstractBlock.Settings blockSettings) {
//        RegistryKey<Block>key = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(VanillaLeftovers.MOD_ID, name));
//        Block block = new Block(blockSettings.registryKey(key));
//        registerBlockItem(name, block);
//        return Registry.register(Registries.BLOCK, key, block);
//    }
//    private static void registerBlockItem(String name, Block block) {
//        RegistryKey<Item> key = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(VanillaLeftovers.MOD_ID, name));
//        BlockItem item = new BlockItem(block, new Item.Settings().registryKey(key));
//        Registry.register(Registries.ITEM, key, item);
//    }

    // BLOCK REGISTRY LOGGER
    public static void registerModBlocks() {
        VanillaLeftovers.LOGGER.info("Registering Mod Blocks for " + VanillaLeftovers.MOD_ID);
    }

    // BLOCK GROUPING
    public static void registerItemGroups() {
        // BUILDING BLOCKS
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(SMOOTH_STONE_STAIRS);
            fabricItemGroupEntries.add(QUARTZ_BRICK_SLAB);
            fabricItemGroupEntries.add(QUARTZ_BRICK_STAIRS);
            fabricItemGroupEntries.add(POLISHED_ANDESITE_WALL);
            fabricItemGroupEntries.add(POLISHED_DIORITE_WALL);
            fabricItemGroupEntries.add(POLISHED_GRANITE_WALL);
            fabricItemGroupEntries.add(POLISHED_DEEPSLATE_BUTTON);
            fabricItemGroupEntries.add(POLISHED_DEEPSLATE_PRESSURE_PLATE);
            fabricItemGroupEntries.add(PURPUR_WALL);
            fabricItemGroupEntries.add(PRISMARINE_BRICK_WALL);
            fabricItemGroupEntries.add(DARK_PRISMARINE_WALL);
//            fabricItemGroupEntries.add(RED_NETHER_BRICK_FENCE);

        });
    }
}
