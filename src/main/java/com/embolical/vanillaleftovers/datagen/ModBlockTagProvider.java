package com.embolical.vanillaleftovers.datagen;

import com.embolical.vanillaleftovers.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagBuilder;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
   public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
       super(output, registriesFuture);
   }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        valueLookupBuilder(BlockTags.FENCES).add(ModBlocks.RED_NETHER_BRICK_FENCE);
        valueLookupBuilder(BlockTags.WALLS).add(ModBlocks.POLISHED_ANDESITE_WALL);
        valueLookupBuilder(BlockTags.WALLS).add(ModBlocks.POLISHED_DIORITE_WALL);
        valueLookupBuilder(BlockTags.WALLS).add(ModBlocks.POLISHED_GRANITE_WALL);
        valueLookupBuilder(BlockTags.WALLS).add(ModBlocks.DARK_PRISMARINE_WALL);
        valueLookupBuilder(BlockTags.WALLS).add(ModBlocks.PRISMARINE_BRICK_WALL);
        valueLookupBuilder(BlockTags.WALLS).add(ModBlocks.QUARTZ_BRICK_WALL);
        valueLookupBuilder(BlockTags.WALLS).add(ModBlocks.PURPUR_WALL);
        valueLookupBuilder(BlockTags.WALLS).add(ModBlocks.SMOOTH_RED_SANDSTONE_WALL);
        valueLookupBuilder(BlockTags.WALLS).add(ModBlocks.STONE_WALL);
        valueLookupBuilder(BlockTags.WALLS).add(ModBlocks.SMOOTH_SANDSTONE_WALL);
        valueLookupBuilder(BlockTags.STAIRS).add(ModBlocks.SMOOTH_STONE_STAIRS);
        valueLookupBuilder(BlockTags.STAIRS).add(ModBlocks.QUARTZ_BRICK_STAIRS);
        valueLookupBuilder(BlockTags.SLABS).add(ModBlocks.QUARTZ_BRICK_SLAB);
        valueLookupBuilder(BlockTags.BUTTONS).add(ModBlocks.POLISHED_DEEPSLATE_BUTTON);
        valueLookupBuilder(BlockTags.PRESSURE_PLATES).add(ModBlocks.POLISHED_DEEPSLATE_PRESSURE_PLATE);

    }
}
