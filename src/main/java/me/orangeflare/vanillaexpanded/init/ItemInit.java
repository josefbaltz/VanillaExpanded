package me.orangeflare.vanillaexpanded.init;

import me.orangeflare.vanillaexpanded.INFO;
import me.orangeflare.vanillaexpanded.objects.ArmorBase;
import me.orangeflare.vanillaexpanded.objects.items.ItemBase;
import me.orangeflare.vanillaexpanded.objects.tools.*;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

import java.util.ArrayList;
import java.util.List;

public class ItemInit {
    public static final List<Item> ITEMS = new ArrayList<Item>();

    //Materials List
    public static final Item.ToolMaterial TOOL_REDSTONE = EnumHelper.addToolMaterial("tool_redstone", 2, 175, 12.0F, 2.5F, 16);
    public static final ItemArmor.ArmorMaterial ARMOR_REDSTONE = EnumHelper.addArmorMaterial("armor_redstone", INFO.MODID+":redstone", 10, new int[]{1, 4, 5, 2}, 15, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.5F);

    //public static final Item ITEM_DEV = new ItemBase("item_dev"); //Test Item Please Ignore
    public static final Item REDSTONE_CLAY = new ItemBase("redstone_clay");
    public static final Item REDSTONE_ALLOY_INGOT = new ItemBase("redstone_alloy_ingot");

    public static final Item REDSTONE_PICKAXE = new ToolPickaxe("redstone_pickaxe", TOOL_REDSTONE);
    public static final Item REDSTONE_SWORD = new ToolSword("redstone_sword", TOOL_REDSTONE);
    public static final Item REDSTONE_AXE = new ToolAxe("redstone_axe", TOOL_REDSTONE);
    public static final Item REDSTONE_SHOVEL = new ToolShovel("redstone_shovel", TOOL_REDSTONE);
    public static final Item REDSTONE_HOE = new ToolHoe("redstone_hoe", TOOL_REDSTONE);

    public static final Item REDSTONE_HELMET = new ArmorBase("redstone_helmet", ARMOR_REDSTONE, 1, EntityEquipmentSlot.HEAD);
    public static final Item REDSTONE_CHESTPLATE = new ArmorBase("redstone_chestplate", ARMOR_REDSTONE, 1, EntityEquipmentSlot.CHEST);
    public static final Item REDSTONE_LEGGINGS = new ArmorBase("redstone_leggings", ARMOR_REDSTONE, 2, EntityEquipmentSlot.LEGS);
    public static final Item REDSTONE_BOOTS = new ArmorBase("redstone_boots", ARMOR_REDSTONE, 1, EntityEquipmentSlot.FEET);
}
