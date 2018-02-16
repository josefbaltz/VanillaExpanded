package me.orangeflare.vanillaexpanded.objects.blocks;

import me.orangeflare.vanillaexpanded.IHasModel;
import me.orangeflare.vanillaexpanded.Main;
import net.minecraft.block.BlockFlower;
import net.minecraft.item.Item;

public class FlowerBase extends BlockFlower implements IHasModel {

    @Override
    public FlowerBase.EnumFlowerColor getBlockType() {
        return EnumFlowerColor.RED;
    }

    @Override
    public void registerModels() { Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory"); }
}
