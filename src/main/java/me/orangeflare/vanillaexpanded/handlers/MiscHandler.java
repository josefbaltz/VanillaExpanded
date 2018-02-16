package me.orangeflare.vanillaexpanded.handlers;

import me.orangeflare.vanillaexpanded.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class MiscHandler {
    public static void registerSmeltingRecipes() {
        GameRegistry.addSmelting(ItemInit.REDSTONE_CLAY, new ItemStack(ItemInit.REDSTONE_ALLOY_INGOT), 1.0f);
    }
    public static final CreativeTabs VANILLA_EXPANDED = new CreativeTabs("vanillaExpanded") {
        @Override public ItemStack getTabIconItem() { return new ItemStack(Item.getItemFromBlock(Blocks.GRASS)); }
    };
}