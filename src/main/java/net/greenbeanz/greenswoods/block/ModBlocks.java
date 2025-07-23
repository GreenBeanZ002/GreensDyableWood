package net.greenbeanz.greenswoods.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.greenbeanz.greenswoods.GreensDyableWoods;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.PillarBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    //create blocks with all required blocksettings

    //blue
    public static final Block BLUE_DYED_OAK_LOG = registerBlock("blue_dyed_oak_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block BLUE_DYED_OAK_WOOD = registerBlock("blue_dyed_oak_wood",
            new PillarBlock(AbstractBlock.Settings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block STRIPPED_BLUE_DYED_OAK_LOG = registerBlock("stripped_blue_dyed_oak_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block STRIPPED_BLUE_DYED_OAK_WOOD = registerBlock("stripped_blue_dyed_oak_wood",
            new PillarBlock(AbstractBlock.Settings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));

    public static final Block BLUE_DYED_OAK_PLANKS = registerBlock("blue_dyed_oak_planks",
            new Block(AbstractBlock.Settings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));

    public static final Block BLUE_DYED_SPRUCE_LOG = registerBlock("blue_dyed_spruce_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block BLUE_DYED_SPRUCE_PLANKS = registerBlock("blue_dyed_spruce_planks",
            new PillarBlock(AbstractBlock.Settings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));

    //green
    public static final Block GREEN_DYED_OAK_PLANKS = registerBlock("green_dyed_oak_planks",
            new Block(AbstractBlock.Settings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block GREEN_DYED_OAK_LOG = registerBlock("green_dyed_oak_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));

    public static final Block GREEN_DYED_SPRUCE_LOG = registerBlock("green_dyed_spruce_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block GREEN_DYED_SPRUCE_PLANKS = registerBlock("green_dyed_spruce_planks",
            new PillarBlock(AbstractBlock.Settings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));

   //red
   public static final Block RED_DYED_OAK_LOG = registerBlock("red_dyed_oak_log",
           new PillarBlock(AbstractBlock.Settings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block RED_DYED_OAK_PLANKS = registerBlock("red_dyed_oak_planks",
            new Block(AbstractBlock.Settings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));

    public static final Block RED_DYED_SPRUCE_LOG = registerBlock("red_dyed_spruce_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block RED_DYED_SPRUCE_PLANKS = registerBlock("red_dyed_spruce_planks",
            new PillarBlock(AbstractBlock.Settings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));

    //orange
    public static final Block ORANGE_DYED_OAK_PLANKS = registerBlock("orange_dyed_oak_planks",
            new Block(AbstractBlock.Settings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));

    //pink
    public static final Block PINK_DYED_OAK_PLANKS = registerBlock("pink_dyed_oak_planks",
            new Block(AbstractBlock.Settings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));

    //purple
    public static final Block PURPLE_DYED_OAK_PLANKS = registerBlock("purple_dyed_oak_planks",
            new Block(AbstractBlock.Settings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));

    //white
    public static final Block WHITE_DYED_OAK_PLANKS = registerBlock("white_dyed_oak_planks",
            new Block(AbstractBlock.Settings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    //yellow
    public static final Block YELLOW_DYED_OAK_PLANKS = registerBlock("yellow_dyed_oak_planks",
            new Block(AbstractBlock.Settings.create().strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).burnable()));

    //magenta
    public static final Block MAGENTA_DYED_OAK_PLANKS = registerBlock("magenta_dyed_oak_planks",
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

                }
        );
    }
}
