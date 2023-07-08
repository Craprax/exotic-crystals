package net.craprax;

import net.craprax.block.ModBlocks;
import net.craprax.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExoticCrystals implements ModInitializer {
	public static final String MOD_ID = "exotic_crystals";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}