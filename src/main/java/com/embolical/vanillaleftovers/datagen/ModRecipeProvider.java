package com.embolical.vanillaleftovers.datagen;

import com.embolical.vanillaleftovers.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.Recipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
  public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture){
      super (output, registriesFuture);
  }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup wrapperLookup, RecipeExporter recipeExporter) {
        return new RecipeGenerator(wrapperLookup, recipeExporter) {
            @Override
            public void generate() {
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_STAIRS, 4)
                        .pattern("r  ")
                        .pattern("rr ")
                        .pattern("rrr")
                        .input('r', Blocks.SMOOTH_STONE)
                        .criterion(hasItem(Blocks.SMOOTH_STONE), conditionsFromItem(Blocks.SMOOTH_STONE))
                        .offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_BRICK_STAIRS, 4)
                        .pattern("r  ")
                        .pattern("rr ")
                        .pattern("rrr")
                        .input('r', Blocks.QUARTZ_BRICKS)
                        .criterion(hasItem(Blocks.QUARTZ_BRICKS), conditionsFromItem(Blocks.QUARTZ_BRICKS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_BRICK_SLAB, 2)
                        .pattern("   ")
                        .pattern("   ")
                        .pattern("rrr")
                        .input('r', Blocks.QUARTZ_BRICKS)
                        .criterion(hasItem(Blocks.QUARTZ_BRICKS), conditionsFromItem(Blocks.QUARTZ_BRICKS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.REDSTONE, ModBlocks.POLISHED_DEEPSLATE_PRESSURE_PLATE)
                        .pattern("   ")
                        .pattern("   ")
                        .pattern("rr ")
                        .input('r', Blocks.POLISHED_DEEPSLATE)
                        .criterion(hasItem(Blocks.POLISHED_DEEPSLATE), conditionsFromItem(Blocks.POLISHED_DEEPSLATE))
                        .offerTo(exporter);
                createShapeless(RecipeCategory.REDSTONE, ModBlocks.POLISHED_DEEPSLATE_BUTTON)
                        .input(Blocks.POLISHED_DEEPSLATE)
                        .criterion(hasItem(Blocks.POLISHED_DEEPSLATE), conditionsFromItem(Blocks.POLISHED_DEEPSLATE))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_ANDESITE_WALL, 6)
                        .pattern("   ")
                        .pattern("rrr")
                        .pattern("rrr")
                        .input('r', Blocks.POLISHED_ANDESITE)
                        .criterion(hasItem(Blocks.POLISHED_ANDESITE), conditionsFromItem(Blocks.POLISHED_ANDESITE))
                        .offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_RED_SANDSTONE_WALL, 6)
                        .pattern("   ")
                        .pattern("rrr")
                        .pattern("rrr")
                        .input('r', Blocks.SMOOTH_RED_SANDSTONE)
                        .criterion(hasItem(Blocks.SMOOTH_RED_SANDSTONE), conditionsFromItem(Blocks.SMOOTH_RED_SANDSTONE))
                        .offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_WALL, 6)
                        .pattern("   ")
                        .pattern("rrr")
                        .pattern("rrr")
                        .input('r', Blocks.STONE)
                        .criterion(hasItem(Blocks.STONE), conditionsFromItem(Blocks.STONE))
                        .offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DIORITE_WALL, 6)
                        .pattern("   ")
                        .pattern("rrr")
                        .pattern("rrr")
                        .input('r', Blocks.POLISHED_DIORITE)
                        .criterion(hasItem(Blocks.POLISHED_DIORITE), conditionsFromItem(Blocks.POLISHED_DIORITE))
                        .offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_GRANITE_WALL, 6)
                        .pattern("   ")
                        .pattern("rrr")
                        .pattern("rrr")
                        .input('r', Blocks.POLISHED_GRANITE)
                        .criterion(hasItem(Blocks.POLISHED_GRANITE), conditionsFromItem(Blocks.POLISHED_GRANITE))
                        .offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_PRISMARINE_WALL, 6)
                        .pattern("   ")
                        .pattern("rrr")
                        .pattern("rrr")
                        .input('r', Blocks.DARK_PRISMARINE)
                        .criterion(hasItem(Blocks.DARK_PRISMARINE), conditionsFromItem(Blocks.DARK_PRISMARINE))
                        .offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PRISMARINE_BRICK_WALL, 6)
                        .pattern("   ")
                        .pattern("rrr")
                        .pattern("rrr")
                        .input('r', Blocks.PRISMARINE_BRICKS)
                        .criterion(hasItem(Blocks.PRISMARINE_BRICKS), conditionsFromItem(Blocks.PRISMARINE_BRICKS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPUR_WALL, 6)
                        .pattern("   ")
                        .pattern("rrr")
                        .pattern("rrr")
                        .input('r', Blocks.PURPUR_BLOCK)
                        .criterion(hasItem(Blocks.PURPUR_BLOCK), conditionsFromItem(Blocks.PURPUR_BLOCK))
                        .offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_SANDSTONE_WALL, 6)
                        .pattern("   ")
                        .pattern("rrr")
                        .pattern("rrr")
                        .input('r', Blocks.SMOOTH_SANDSTONE)
                        .criterion(hasItem(Blocks.SMOOTH_SANDSTONE), conditionsFromItem(Blocks.SMOOTH_SANDSTONE))
                        .offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.QUARTZ_BRICK_WALL, 6)
                        .pattern("   ")
                        .pattern("rrr")
                        .pattern("rrr")
                        .input('r', Blocks.QUARTZ_BRICKS)
                        .criterion(hasItem(Blocks.QUARTZ_BRICKS), conditionsFromItem(Blocks.QUARTZ_BRICKS))
                        .offerTo(exporter);
                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_NETHER_BRICK_FENCE, 6)
                        .pattern("   ")
                        .pattern("XrX")
                        .pattern("XrX")
                        .input('r', Items.NETHER_BRICK)
                        .input('X', Blocks.RED_NETHER_BRICKS)
                        .criterion(hasItem(Blocks.RED_NETHER_BRICKS), conditionsFromItem(Blocks.RED_NETHER_BRICKS))
                        .offerTo(exporter);

                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS,
                        ModBlocks.SMOOTH_STONE_STAIRS,
                        Blocks.SMOOTH_STONE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS,
                        ModBlocks.QUARTZ_BRICK_SLAB,
                        Blocks.QUARTZ_BRICKS);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS,
                        ModBlocks.QUARTZ_BRICK_STAIRS,
                        Blocks.QUARTZ_BRICKS);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS,
                        ModBlocks.QUARTZ_BRICK_SLAB,
                        Blocks.QUARTZ_BLOCK);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS,
                        ModBlocks.QUARTZ_BRICK_STAIRS,
                        Blocks.QUARTZ_BLOCK);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS,
                        ModBlocks.POLISHED_GRANITE_WALL,
                        Blocks.POLISHED_GRANITE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS,
                        ModBlocks.POLISHED_ANDESITE_WALL,
                        Blocks.POLISHED_ANDESITE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS,
                        ModBlocks.POLISHED_DIORITE_WALL,
                        Blocks.POLISHED_DIORITE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS,
                        ModBlocks.PRISMARINE_BRICK_WALL,
                        Blocks.PRISMARINE_BRICKS);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS,
                        ModBlocks.DARK_PRISMARINE_WALL,
                        Blocks.DARK_PRISMARINE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS,
                        ModBlocks.PURPUR_WALL,
                        Blocks.PURPUR_BLOCK);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS,
                        ModBlocks.SMOOTH_SANDSTONE_WALL,
                        Blocks.SMOOTH_SANDSTONE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS,
                        ModBlocks.QUARTZ_BRICK_WALL,
                        Blocks.QUARTZ_BRICKS);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS,
                        ModBlocks.QUARTZ_BRICK_WALL,
                        Blocks.QUARTZ_BLOCK);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS,
                        ModBlocks.SMOOTH_RED_SANDSTONE_WALL,
                        Blocks.SMOOTH_RED_SANDSTONE);
                offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS,
                        ModBlocks.STONE_WALL,
                        Blocks.STONE);

            }
        };
    }

    @Override
    public String getName() {
        return "Vanilla Leftovers Recipies";
    }
}
