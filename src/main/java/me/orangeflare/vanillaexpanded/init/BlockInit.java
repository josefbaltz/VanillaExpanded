package me.orangeflare.vanillaexpanded.init;

import me.orangeflare.vanillaexpanded.objects.blocks.BlockBase;
import me.orangeflare.vanillaexpanded.objects.blocks.PlantBase;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class BlockInit {
    public static final List<Block> BLOCKS = new ArrayList<Block>();
    public static final List<BlockBush> PLANTS = new ArrayList<BlockBush>();

    //public static final Block BLOCK_DEV = new BlockBase("block_dev", Material.CLOTH, 0.1F); //Test Block Please Ignore
    public static final Block REDSTONE_ALLOY_BLOCK = new BlockBase("redstone_alloy_block", Material.IRON, 4.4F, 2.5F);
    //public static final Block CYAN_FLOWER = new BlockBase("cyan_flower", Material.PLANTS, 0.0F, 0.0F); //Utilize the BlockBush Instead (Proper method used by Minecraft)
    public static final BlockBush CYAN_FLOWER = new PlantBase("cyan_flower", 0.0F);
}
