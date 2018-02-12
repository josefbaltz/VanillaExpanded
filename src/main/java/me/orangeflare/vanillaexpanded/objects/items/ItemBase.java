package me.orangeflare.vanillaexpanded.objects.items;

import me.orangeflare.vanillaexpanded.IHasModel;
import me.orangeflare.vanillaexpanded.Main;
import me.orangeflare.vanillaexpanded.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel{
    public ItemBase(String name){
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MISC);
        ItemInit.ITEMS.add(this);
    }

    @Override
    public void registerModels(){
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
