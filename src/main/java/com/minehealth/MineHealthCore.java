package com.minehealth;

import com.minehealth.commands.CommandEatLogBook;
import com.minehealth.commands.CommandHunger;
import com.minehealth.commands.CommandShowNutrients;
import com.minehealth.handler.AttackEventHandler;
import com.minehealth.handler.EatEventHandler;
import com.minehealth.handler.UserLoginHandler;
import cpw.mods.fml.common.*;
import cpw.mods.fml.common.event.*;
import cpw.mods.fml.common.Mod.*;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;


@Mod(modid = MineHealthCore.MODID, name = MineHealthCore.MODID, version = MineHealthCore.VERSION)
public class MineHealthCore {

    public static final String MODID = "MineHealth";
    public static final String VERSION = "1.0";

    public static int NumEffectiveLog;
    @EventHandler
    public void serverLoad(FMLServerStartingEvent event){
        event.registerServerCommand(new CommandHunger());
        event.registerServerCommand(new CommandEatLogBook());
        event.registerServerCommand(new CommandShowNutrients());
    }
    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
        MinecraftForge.EVENT_BUS.register(new EatEventHandler());
        MinecraftForge.EVENT_BUS.register(new UserLoginHandler());

        MinecraftForge.EVENT_BUS.register(new AttackEventHandler());

        Configuration config = new Configuration(event.getSuggestedConfigurationFile());
        config.load();
        NumEffectiveLog = config.get(Configuration.CATEGORY_GENERAL, "NumberOfEffectiveLog", 10).getInt(10);
        config.save();
    }
    @EventHandler
    public void init(FMLInitializationEvent event){

    }
    @EventHandler
    public void postInit(FMLPostInitializationEvent event){

    }
}
