package me.orangeflare.vanillaexpanded.objects;

import me.orangeflare.vanillaexpanded.IHasModel;
import me.orangeflare.vanillaexpanded.Main;
import me.orangeflare.vanillaexpanded.handlers.MiscHandler;
import me.orangeflare.vanillaexpanded.init.ItemInit;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ArmorBase extends ItemArmor implements IHasModel {
    public ArmorBase(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
        super(materialIn, renderIndexIn, equipmentSlotIn);
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
