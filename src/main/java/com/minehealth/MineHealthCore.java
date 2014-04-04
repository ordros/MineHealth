package com.minehealth;

import com.minehealth.commands.CommandHunger;
import com.minehealth.handler.EatEventListener;
import cpw.mods.fml.common.*;
import cpw.mods.fml.common.event.*;
import cpw.mods.fml.common.Mod.*;
import net.minecraftforge.common.MinecraftForge;

@Mod(modid = MineHealthCore.MODID, name = MineHealthCore.MODID, version = MineHealthCore.VERSION)
public class MineHealthCore {

    public static final String MODID = "MineHealth";
    public static final String VERSION = "1.0";

    @EventHandler
    public void serverLoad(FMLServerStartingEvent event){
        event.registerServerCommand(new CommandHunger());
    }
    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
        MinecraftForge.EVENT_BUS.register(new EatEventListener());
    }
    @EventHandler
         public void init(FMLInitializationEvent event){
    }
    @EventHandler
    public void postInit(FMLPostInitializationEvent event){

    }
}
