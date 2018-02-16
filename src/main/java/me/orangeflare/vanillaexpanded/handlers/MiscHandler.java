package me.orangeflare.vanillaexpanded.handlers;

import me.orangeflare.vanillaexpanded.init.BlockInit;
import me.orangeflare.vanillaexpanded.init.ItemInit;
import me.orangeflare.vanillaexpanded.objects.blocks.BlockBase;
import me.orangeflare.vanillaexpanded.objects.blocks.PlantBase;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.BlockFlower;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.Random;

public class MiscHandler {
    public static void registerSmeltingRecipes() {
        GameRegistry.addSmelting(ItemInit.REDSTONE_CLAY, new ItemStack(ItemInit.REDSTONE_ALLOY_INGOT), 1.0f);
    }
    public static final CreativeTabs VANILLA_EXPANDED = new CreativeTabs("vanillaExpanded") {
        @Override public ItemStack getTabIconItem() { return new ItemStack(Item.getItemFromBlock(Blocks.GRASS)); }
    };
}
