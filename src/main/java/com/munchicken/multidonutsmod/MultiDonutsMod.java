package com.munchicken.multidonutsmod;

import com.munchicken.multidonutsmod.handlers.ModHooks;
import com.munchicken.multidonutsmod.handlers.ModRecipes;
import com.munchicken.multidonutsmod.items.ModItems;
import com.munchicken.multidonutsmod.proxies.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import com.munchicken.multidonutsmod.help.*;

@Mod(modid = Reference.MODID, version = Reference.VERSION)
public class MultiDonutsMod {
    
    @Mod.Instance(value = Reference.MODID)
    public static MultiDonutsMod instance;

    @SidedProxy(clientSide ="com.munchicken.multidonutsmod.proxies.ClientProxy", serverSide = "com.munchicken.multidonutsmod.proxies.ServerProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLInitializationEvent event)
    {
        this.proxy.preInit(event);
        ModItems.loadItems();
        ModRecipes.addRecipes();
        ModHooks.grabHooks();

    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        this.proxy.init(event);


    }

    @EventHandler
    public void postInit(FMLInitializationEvent event)
    {
        this.proxy.postInit(event);

    }
}
