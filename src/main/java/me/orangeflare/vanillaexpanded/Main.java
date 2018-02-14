package me.orangeflare.vanillaexpanded;

import me.orangeflare.vanillaexpanded.handlers.SmeltingHandler;
import me.orangeflare.vanillaexpanded.proxies.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = INFO.MODID, name = INFO.NAME, version = INFO.VERSION)
public class Main {
    @Mod.Instance
    public static Main instance;

    @SidedProxy(clientSide = INFO.CLIENT, serverSide = INFO.COMMON)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public static void preInit(FMLPreInitializationEvent event) {  }

    @Mod.EventHandler
    public static void preInit(FMLInitializationEvent event) { SmeltingHandler.registerSmeltingRecipes(); }

    @Mod.EventHandler
    public static void preInit(FMLPostInitializationEvent event) {  }
}
