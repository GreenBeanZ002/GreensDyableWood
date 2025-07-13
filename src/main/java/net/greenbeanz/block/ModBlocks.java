package net.greenbeanz.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.greenbeanz.greenswoods.GreensDyableWoods;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    //create blocks with all required blocksettings

    //oak planks
    public static final Block BLUE_DYED_OAK_PLANKS = registerBlock("blue_dyed_oak_planks",
            new Block(AbstractBlock.Settings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block GREEN_DYED_OAK_PLANKS = registerBlock("green_dyed_oak_planks",
            new Block(AbstractBlock.Settings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block RED_DYED_OAK_PLANKS = registerBlock("red_dyed_oak_planks",
            new Block(AbstractBlock.Settings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));



    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(GreensDyableWoods.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(GreensDyableWoods.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        GreensDyableWoods.LOGGER.info("Registering Mod Blocks for " + GreensDyableWoods.MOD_ID);

        //add blocks to creative mode inventory
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
                    entries.add(ModBlocks.BLUE_DYED_OAK_PLANKS);
                    entries.add(ModBlocks.GREEN_DYED_OAK_PLANKS);
                    entries.add(ModBlocks.RED_DYED_OAK_PLANKS);
                }
        );
    }
}
