package net.greenbeanz.greenswoods.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.greenbeanz.greenswoods.GreensDyableWoods;
import net.greenbeanz.greenswoods.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup GREENS_DYABLE_WOODS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(GreensDyableWoods.MOD_ID,"greens_dyable_woods"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.BLUE_DYED_OAK_PLANKS))
                    .displayName(Text.translatable("itemgroup.greens-dyable-woods.dyed-items"))
                    .entries((displayContext, entries) -> {
                        //black

                        //brown

                        //gray

                        //light gray

                        //cyan

                        //blue
                        entries.add(ModBlocks.BLUE_DYED_OAK_LOG);
                        entries.add(ModBlocks.BLUE_DYED_OAK_PLANKS);

                        entries.add(ModBlocks.BLUE_DYED_SPRUCE_LOG);
                        entries.add(ModBlocks.BLUE_DYED_SPRUCE_PLANKS);
                        //light blue

                        //lime

                        //green
                        entries.add(ModBlocks.GREEN_DYED_OAK_LOG);
                        entries.add(ModBlocks.GREEN_DYED_OAK_PLANKS);

                        entries.add(ModBlocks.GREEN_DYED_SPRUCE_LOG);
                        entries.add(ModBlocks.GREEN_DYED_SPRUCE_PLANKS);
                        //red
                        entries.add(ModBlocks.RED_DYED_OAK_LOG);
                        entries.add(ModBlocks.RED_DYED_OAK_PLANKS);

                        entries.add(ModBlocks.RED_DYED_SPRUCE_LOG);
                        entries.add(ModBlocks.RED_DYED_SPRUCE_PLANKS);

                        //orange
                        entries.add(ModBlocks.ORANGE_DYED_OAK_PLANKS);
                        //magenta
                        entries.add(ModBlocks.MAGENTA_DYED_OAK_PLANKS);
                        //purple
                        entries.add(ModBlocks.PURPLE_DYED_OAK_PLANKS);
                        //pink
                        entries.add(ModBlocks.PINK_DYED_OAK_PLANKS);
                        //yellow
                        entries.add(ModBlocks.YELLOW_DYED_OAK_PLANKS);
                        //white
                        entries.add(ModBlocks.WHITE_DYED_OAK_PLANKS);


                    }).build());


    public static void registerItemGroups(){
        GreensDyableWoods.LOGGER.info("Registering Item Groups for " + GreensDyableWoods.MOD_ID);
    }
}
