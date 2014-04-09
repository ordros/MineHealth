package com.minehealth;

import com.minehealth.commands.CommandHunger;
import com.minehealth.commands.CommandReadLogBook;
import com.minehealth.handler.EatEventHandler;
import com.minehealth.handler.UserLoginHandler;
import com.minehealth.logbook.EatLogBook;
import cpw.mods.fml.common.*;
import cpw.mods.fml.common.event.*;
import cpw.mods.fml.common.Mod.*;
import net.minecraftforge.common.MinecraftForge;

@Mod(modid = MineHealthCore.MODID, name = MineHealthCore.MODID, version = MineHealthCore.VERSION)
public class MineHealthCore {

    public static final String MODID = "MineHealth";
    public static final String VERSION = "1.0";

    public EatLogBook logBook = new EatLogBook();

    @EventHandler
    public void serverLoad(FMLServerStartingEvent event){
        event.registerServerCommand(new CommandHunger());
        event.registerServerCommand(new CommandReadLogBook());
    }
    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
        MinecraftForge.EVENT_BUS.register(new EatEventHandler());
    //    MinecraftForge.EVENT_BUS.register(new UserLoginHandler());
    }
    @EventHandler
    public void init(FMLInitializationEvent event){

    }
    @EventHandler
    public void postInit(FMLPostInitializationEvent event){

    }
}
