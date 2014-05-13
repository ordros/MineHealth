package com.minehealth.handler;

import com.minehealth.ManageNBT;
import com.minehealth.logbook.EatLogBook;
import com.minehealth.nutrition.HealthCondition;
import com.minehealth.nutrition.NutritionFacts;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemFood;
import net.minecraftforge.event.entity.player.PlayerUseItemEvent.Finish;

public class EatEventHandler {
    private EatLogBook logbook = new EatLogBook();
    private HealthCondition condition;
    private ManageNBT nbt;
    int p;
    public EatEventHandler(){
    }
    @SubscribeEvent
    public void SomethingEaten(Finish event){
        if(event.item.getItem() instanceof ItemFood && event.entityPlayer instanceof EntityPlayerMP){  //イベントが立て続けに2回発火するのを抑制
            logbook.addEatLog(event.item);
            condition = new HealthCondition(event.entityPlayer);
            condition.addNutrition(event.item);

            //condition.EffectByCondition(event.entityPlayer);
        }
    }
}
