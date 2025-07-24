package net.greenbeanz.greenswoods;

import net.fabricmc.api.ModInitializer;

import net.greenbeanz.greenswoods.block.ModBlocks;
import net.greenbeanz.greenswoods.item.ModItemGroups;
import net.greenbeanz.greenswoods.item.ModItems;
import net.minecraft.item.AxeItem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class GreensDyableWoods implements ModInitializer {
	public static final String MOD_ID = "greens-dyable-woods";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}