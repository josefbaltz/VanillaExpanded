package me.orangeflare.vanillaexpanded.handlers;

import me.orangeflare.vanillaexpanded.init.ItemInit;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SmeltingHandler {
    public static void registerSmeltingRecipes() {
        GameRegistry.addSmelting(ItemInit.REDSTONE_CLAY, new ItemStack(ItemInit.REDSTONE_ALLOY_INGOT), 1.0f);

    }
}
