package com.embolical.vanillaleftovers;

import com.embolical.vanillaleftovers.block.ModBlocks;
import com.embolical.vanillaleftovers.datagen.ModModelProvider;
import com.embolical.vanillaleftovers.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VanillaLeftovers implements ModInitializer {
	public static final String MOD_ID = "vanilla-leftovers";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		//ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModBlocks.registerItemGroups();
	}
}