package com.embolical.vanillaleftovers.block;

import com.embolical.vanillaleftovers.VanillaLeftovers;
import com.embolical.vanillaleftovers.item.ModItems;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.*;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModBlocks {
    // INITIAL BLOCK DATA
    // STAIRS
    public static final Block SMOOTH_STONE_STAIRS =
            registerBlock("smooth_stone_stairs", settings -> new StairsBlock(
                    Blocks.SMOOTH_STONE.getDefaultState(), settings
                    .strength(2.0F, 6.0F)
                    .requiresTool()
            ));

    public static final Block QUARTZ_BRICK_STAIRS =
            registerBlock("quartz_brick_stairs", settings -> new StairsBlock(
                    Blocks.QUARTZ_BRICKS.getDefaultState(), settings
                    .strength(2.0F, 6.0F)
                    .requiresTool()));

    // SLABS
    public static final Block QUARTZ_BRICK_SLAB =
            registerBlock("quartz_brick_slab", settings -> new SlabBlock(
                    settings.strength(2.0F, 6.0F)
                            .requiresTool()
            ));

    // BUTTONS
    public static final Block POLISHED_DEEPSLATE_BUTTON =
            registerBlock("polished_deepslate_button", settings -> new ButtonBlock(
                    BlockSetType.POLISHED_BLACKSTONE, 2,
                    settings.strength(2.0F, 6.0F)
                            .sounds(BlockSoundGroup.POLISHED_DEEPSLATE)
                            .requiresTool()
                            .noCollision()));

    // PRESSURE PLATES
    public static final Block POLISHED_DEEPSLATE_PRESSURE_PLATE =
            registerBlock("polished_deepslate_pressure_plate", settings -> new PressurePlateBlock(
                    BlockSetType.POLISHED_BLACKSTONE,
                    settings.strength(2.0F, 6.0F)
                            .sounds(BlockSoundGroup.POLISHED_DEEPSLATE)
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
    public static final Block SMOOTH_SANDSTONE_WALL =
            registerBlock("smooth_sandstone_wall", settings -> new WallBlock(
                    settings.strength(2.0F, 6.0F)
                            .requiresTool()));
    public static final Block SMOOTH_RED_SANDSTONE_WALL =
            registerBlock("smooth_red_sandstone_wall", settings -> new WallBlock(
                    settings.strength(2.0F, 6.0F)
                            .requiresTool()));
    public static final Block STONE_WALL =
            registerBlock("stone_wall", settings -> new WallBlock(
                    settings.strength(2.0F, 6.0F)
                            .requiresTool()));
    public static final Block QUARTZ_BRICK_WALL =
            registerBlock("quartz_brick_wall", settings -> new WallBlock(
                    settings.strength(2.0F, 6.0F)
                            .requiresTool()));


    // FENCES
    public static final Block RED_NETHER_BRICK_FENCE =
            registerBlock("red_nether_brick_fence", settings -> new FenceBlock(
                    settings.strength(2.0F, 6.0F)
                            .requiresTool().sounds(BlockSoundGroup.NETHER_BRICKS)));

    // BLOCK REGISTRY HELPERS
    private static <T extends Block> T registerBlock(
            String name, Function<AbstractBlock.Settings, T> blockFactory) {
        Identifier id = Identifier.of(VanillaLeftovers.MOD_ID, name);
        RegistryKey<Block> blockKey = RegistryKey.of(RegistryKeys.BLOCK, id);
        RegistryKey<Item> itemKey = RegistryKey.of(RegistryKeys.ITEM, id);
        AbstractBlock.Settings blockSettings =
                AbstractBlock.Settings.create().registryKey(blockKey);
        T block = blockFactory.apply(blockSettings);
        BlockItem item = new BlockItem(block,
                new Item.Settings().registryKey(itemKey));
        Registry.register(Registries.BLOCK, blockKey, block);
        Registry.register(Registries.ITEM, itemKey, item);
        return block;
    }


    // BLOCK REGISTRY LOGGER
    public static void registerModBlocks() {
        VanillaLeftovers.LOGGER.info("Registering Mod Blocks for " + VanillaLeftovers.MOD_ID);
    }

    // BLOCK GROUPING
    public static void registerItemGroups() {
        // BUILDING BLOCKS
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {

            entries.addAfter(Items.SMOOTH_STONE, SMOOTH_STONE_STAIRS);
            entries.addAfter(Items.QUARTZ_BRICKS, QUARTZ_BRICK_STAIRS);
            entries.addAfter(ModBlocks.QUARTZ_BRICK_STAIRS, QUARTZ_BRICK_SLAB);

            entries.addAfter(Items.POLISHED_ANDESITE_SLAB, POLISHED_ANDESITE_WALL);
            entries.addAfter(Items.POLISHED_DIORITE_SLAB, POLISHED_DIORITE_WALL);
            entries.addAfter(Items.POLISHED_GRANITE_SLAB, POLISHED_GRANITE_WALL);

            entries.addAfter(Items.POLISHED_DEEPSLATE_SLAB, POLISHED_DEEPSLATE_PRESSURE_PLATE);
            entries.addAfter(ModBlocks.POLISHED_DEEPSLATE_PRESSURE_PLATE, POLISHED_DEEPSLATE_BUTTON);

            entries.addAfter(Items.PURPUR_SLAB, PURPUR_WALL);

            entries.addAfter(Items.PRISMARINE_BRICK_SLAB, PRISMARINE_BRICK_WALL);
            entries.addAfter(Items.DARK_PRISMARINE_SLAB, DARK_PRISMARINE_WALL);
            entries.addAfter(Items.SMOOTH_SANDSTONE_SLAB, SMOOTH_SANDSTONE_WALL);
            entries.addAfter(Items.SMOOTH_RED_SANDSTONE_SLAB, SMOOTH_RED_SANDSTONE_WALL);
            entries.addAfter(Items.STONE_SLAB, STONE_WALL);
            entries.addAfter(ModBlocks.QUARTZ_BRICK_SLAB, QUARTZ_BRICK_WALL);

            entries.addAfter(Items.RED_NETHER_BRICK_WALL, RED_NETHER_BRICK_FENCE);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.REDSTONE).register(entries -> {
            entries.addAfter(Items.STONE_PRESSURE_PLATE, POLISHED_DEEPSLATE_PRESSURE_PLATE);
            entries.addAfter(Items.STONE_BUTTON, POLISHED_DEEPSLATE_BUTTON);
        });

    }
}
