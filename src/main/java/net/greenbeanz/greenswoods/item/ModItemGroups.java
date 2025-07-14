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
                        //blue
                        entries.add(ModBlocks.BLUE_DYED_OAK_LOG);
                        entries.add(ModBlocks.BLUE_DYED_OAK_PLANKS);
                        //green
                        entries.add(ModBlocks.GREEN_DYED_OAK_LOG);
                        entries.add(ModBlocks.GREEN_DYED_OAK_PLANKS);
                        //red
                        entries.add(ModBlocks.RED_DYED_OAK_LOG);
                        entries.add(ModBlocks.RED_DYED_OAK_PLANKS);
                    }).build());


    public static void registerItemGroups(){
        GreensDyableWoods.LOGGER.info("Registering Item Groups for " + GreensDyableWoods.MOD_ID);
    }
}
