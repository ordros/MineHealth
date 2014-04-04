package com.minehealth;

import com.minehealth.commands.CommandHunger;
import cpw.mods.fml.common.*;
import cpw.mods.fml.common.event.*;
import cpw.mods.fml.common.Mod.*;
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

    }
    @EventHandler
    public void init(FMLInitializationEvent event){

    }
}
