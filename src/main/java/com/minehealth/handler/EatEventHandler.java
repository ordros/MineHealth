package com.minehealth.handler;

import com.minehealth.ManageNBT;
import com.minehealth.logbook.EatLogBook;
import com.minehealth.nutrition.HealthCondition;
import com.minehealth.nutrition.NutritionFacts;
import com.minehealth.nutrition.NutritionalCondition;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemFood;
import net.minecraftforge.event.entity.player.PlayerUseItemEvent.Finish;

public class EatEventHandler {
    private EatLogBook logbook = new EatLogBook();
    private HealthCondition condition;
    private ManageNBT nbt;
    private NutritionalCondition Ncondition;
    public EatEventHandler(){
    }
    @SubscribeEvent
    public void SomethingEaten(Finish event){   // Fire at eat something (NOT fire when player eat Cake...)
        if(event.item.getItem() instanceof ItemFood && event.entityPlayer instanceof EntityPlayerMP){  //イベントが立て続けに2回発火するのを抑制
            logbook.addEatLog(event.item);
            condition = new HealthCondition(event.entityPlayer);
            Ncondition = new NutritionalCondition(event.entityPlayer);


            //condition.EffectByCondition(event.entityPlayer);
        }
    }
}
