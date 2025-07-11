package net.greenbeanz.greenswoods.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.greenbeanz.greenswoods.GreensDyableWoods;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModItems {

    public static final  Item STONE_BRICK = registeritem("stone_brick", new Item(new Item.Settings()));

    private static Item registeritem(String name, Item item)
    {
    return Registry.register(Registries.ITEM, Identifier.of(GreensDyableWoods.MOD_ID, name), item);
    }
    public static void registerModItems(){
        GreensDyableWoods.LOGGER.info("Registering Mod Items for" + GreensDyableWoods.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries ->{
            entries.add(STONE_BRICK);
        });
    }
}
