package me.orangeflare.vanillaexpanded.init;

import me.orangeflare.vanillaexpanded.objects.blocks.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class BlockInit {
    public static final List<Block> BLOCKS = new ArrayList<Block>();

    //public static final Block BLOCK_DEV = new BlockBase("block_dev", Material.CLOTH, 0.1F);
    public static final Block REDSTONE_ALLOY_BLOCK = new BlockBase("redstone_alloy_block", Material.IRON, 3.5F);
}
