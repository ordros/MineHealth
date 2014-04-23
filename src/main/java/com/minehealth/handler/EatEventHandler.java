package com.minehealth.handler;

import com.minehealth.FoodNutrition;
import com.minehealth.logbook.EatLogBook;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.item.ItemFood;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.event.entity.player.PlayerUseItemEvent.Finish;

public class EatEventHandler {
    EatLogBook logbook = new EatLogBook();
    FoodNutrition food = new FoodNutrition();
    public EatEventHandler(){
    }
    @SubscribeEvent
    public void SomethingEaten(Finish event){
        if(event.item.getItem() instanceof ItemFood){
            logbook.addEatLog(event.item);
            food.getFoodNutrition(event.item);

            NBTTagCompound tag = event.entityPlayer.getEntityData();

        }

    }
}
