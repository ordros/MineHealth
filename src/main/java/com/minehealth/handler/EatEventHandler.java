package com.minehealth.handler;

import com.minehealth.logbook.EatLogBook;
import com.minehealth.nutrition.HealthCondition;
import com.minehealth.nutrition.NutritionFacts;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.item.ItemFood;
import net.minecraftforge.event.entity.player.PlayerUseItemEvent.Finish;

public class EatEventHandler {
    private EatLogBook logbook = new EatLogBook();
    private HealthCondition condition;
    public EatEventHandler(){
    }
    @SubscribeEvent
    public void SomethingEaten(Finish event){
        if(event.item.getItem() instanceof ItemFood){
            logbook.addEatLog(event.item);
            logbook.saveEatLog();
            condition = new HealthCondition(NutritionFacts.CalcIngestedNutrition());
            condition.EffectByCondition(event.entityPlayer);
        }
    }
}
