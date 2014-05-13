package com.minehealth.handler;

import com.minehealth.nutrition.HealthCondition;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.event.entity.player.AttackEntityEvent;

public class AttackEventHandler {
    @SubscribeEvent
    public void ComsumeNutrition(AttackEntityEvent event){
        HealthCondition condition = new HealthCondition(event.entityPlayer);
        condition.consumeNutrition(1,1,1,1,1);
    }
}
