package com.minehealth.handler;

import com.minehealth.nutrition.CalcNutrition;
import com.minehealth.nutrition.HealthCondition;
import com.minehealth.nutrition.NutritionalCondition;
//import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.event.entity.player.AttackEntityEvent;

public class AttackEventHandler {
    @SubscribeEvent
    public void ComsumeNutrition(AttackEntityEvent event){
        System.out.println("Attack Entity");
        NutritionalCondition nCondition = new NutritionalCondition(event.entityPlayer);
        nCondition.consumeNutrition(1,1,1,1,1);

    }
}
