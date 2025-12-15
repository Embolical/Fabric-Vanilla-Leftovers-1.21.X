package com.embolical.vanillaleftovers.datagen;

import com.embolical.vanillaleftovers.block.ModBlocks;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.block.Blocks;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        // TEXTURE REFERENCES
        BlockStateModelGenerator.BlockTexturePool smoothStonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.SMOOTH_STONE);
        BlockStateModelGenerator.BlockTexturePool deepslatePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.POLISHED_DEEPSLATE);
        BlockStateModelGenerator.BlockTexturePool andesitePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.POLISHED_ANDESITE);
        BlockStateModelGenerator.BlockTexturePool granitePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.POLISHED_GRANITE);
        BlockStateModelGenerator.BlockTexturePool dioritePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.POLISHED_DIORITE);
//        BlockStateModelGenerator.BlockTexturePool redNetherPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.RED_NETHER_BRICKS);
        BlockStateModelGenerator.BlockTexturePool quartzBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.QUARTZ_BRICKS);
        BlockStateModelGenerator.BlockTexturePool darkPrismarinePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.DARK_PRISMARINE);
        BlockStateModelGenerator.BlockTexturePool prismarineBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PRISMARINE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool purpurPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PURPUR_BLOCK);


        // REGISTER
        smoothStonePool.stairs(ModBlocks.SMOOTH_STONE_STAIRS);
        deepslatePool.button(ModBlocks.POLISHED_DEEPSLATE_BUTTON);
        deepslatePool.pressurePlate(ModBlocks.POLISHED_DEEPSLATE_PRESSURE_PLATE);
        granitePool.wall(ModBlocks.POLISHED_GRANITE_WALL);
        andesitePool.wall(ModBlocks.POLISHED_ANDESITE_WALL);
        dioritePool.wall(ModBlocks.POLISHED_DIORITE_WALL);
        darkPrismarinePool.wall(ModBlocks.DARK_PRISMARINE_WALL);
        prismarineBrickPool.wall(ModBlocks.PRISMARINE_BRICK_WALL);
//        redNetherPool.wall(ModBlocks.RED_NETHER_BRICK_FENCE);
        purpurPool.wall(ModBlocks.PURPUR_WALL);
        quartzBrickPool.stairs(ModBlocks.QUARTZ_BRICK_STAIRS);
        quartzBrickPool.slab(ModBlocks.QUARTZ_BRICK_SLAB);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
    }
}
