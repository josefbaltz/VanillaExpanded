package me.orangeflare.vanillaexpanded.worldgen;

import me.orangeflare.vanillaexpanded.init.BlockInit;
import net.minecraft.world.gen.feature.WorldGenBush;
import net.minecraft.world.gen.feature.WorldGenerator;

public class CustomPlantGen{
    private WorldGenerator cyan_flower;

    public CustomPlantGen(){
        cyan_flower = new WorldGenBush(BlockInit.CYAN_FLOWER);
    }
}
