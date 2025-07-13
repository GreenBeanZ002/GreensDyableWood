package net.greenbeanz.greenswoods;

import net.fabricmc.api.ModInitializer;

import net.greenbeanz.block.ModBlocks;
import net.greenbeanz.greenswoods.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class GreensDyableWoods implements ModInitializer {
	public static final String MOD_ID = "greens-dyable-woods";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}