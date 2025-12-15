package com.embolical.vanillaleftovers.datagen;

import com.embolical.vanillaleftovers.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super (dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.SMOOTH_STONE_STAIRS);
        addDrop(ModBlocks.POLISHED_ANDESITE_WALL);
        addDrop(ModBlocks.POLISHED_DEEPSLATE_BUTTON);
        addDrop(ModBlocks.POLISHED_DEEPSLATE_PRESSURE_PLATE);
        addDrop(ModBlocks.POLISHED_DIORITE_WALL);
        addDrop(ModBlocks.POLISHED_GRANITE_WALL);
        addDrop(ModBlocks.DARK_PRISMARINE_WALL);
        addDrop(ModBlocks.PRISMARINE_BRICK_WALL);
//        addDrop(ModBlocks.RED_NETHER_BRICK_FENCE);
        addDrop(ModBlocks.PURPUR_WALL);
        addDrop(ModBlocks.QUARTZ_BRICK_SLAB, slabDrops(ModBlocks.QUARTZ_BRICK_SLAB));
        addDrop(ModBlocks.QUARTZ_BRICK_STAIRS);

    }
}
