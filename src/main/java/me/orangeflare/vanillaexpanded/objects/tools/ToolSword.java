package me.orangeflare.vanillaexpanded.objects.tools;

import me.orangeflare.vanillaexpanded.IHasModel;
import me.orangeflare.vanillaexpanded.Main;
import me.orangeflare.vanillaexpanded.handlers.MiscHandler;
import me.orangeflare.vanillaexpanded.init.ItemInit;
import net.minecraft.item.ItemSword;

public class ToolSword extends ItemSword implements IHasModel {
    public ToolSword(String name, ToolMaterial material) {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(MiscHandler.VANILLA_EXPANDED);

        ItemInit.ITEMS.add(this);
    }

    @Override
    public void registerModels(){
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
