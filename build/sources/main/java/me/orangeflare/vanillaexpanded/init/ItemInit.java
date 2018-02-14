package me.orangeflare.vanillaexpanded.init;

import me.orangeflare.vanillaexpanded.objects.items.ItemBase;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemInit {
    public static final List<Item> ITEMS = new ArrayList<Item>();

    //public static final Item ITEM_DEV = new ItemBase("item_dev"); //Test Item Please Ignore
    public static final Item REDSTONE_CLAY = new ItemBase("redstone_clay");
    public static final Item REDSTONE_ALLOY_INGOT = new ItemBase("redstone_alloy_ingot");
}
