package me.orangeflare.vanillaexpanded.objects.blocks;

import me.orangeflare.vanillaexpanded.IHasModel;
import me.orangeflare.vanillaexpanded.Main;
import me.orangeflare.vanillaexpanded.handlers.MiscHandler;
import me.orangeflare.vanillaexpanded.init.BlockInit;
import me.orangeflare.vanillaexpanded.init.ItemInit;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class PlantBase extends BlockBush implements IHasModel {
    public PlantBase(String name, Float hardness) {
        super(Material.PLANTS);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(MiscHandler.VANILLA_EXPANDED);
        setHardness(hardness);
        BlockInit.PLANTS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    public Block.EnumOffsetType getOffsetType() { return Block.EnumOffsetType.XZ; }

    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) { return super.getBoundingBox(state, source, pos).offset(state.getOffset(source, pos)); }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }

    @Override
    public net.minecraftforge.common.EnumPlantType getPlantType(net.minecraft.world.IBlockAccess world, BlockPos pos) {
        return net.minecraftforge.common.EnumPlantType.Plains;
    }

    @Override
    public IBlockState getPlant(net.minecraft.world.IBlockAccess world, BlockPos pos) {
        IBlockState state = world.getBlockState(pos);
        if (state.getBlock() != this) return getDefaultState();
        return state;
    }
}
