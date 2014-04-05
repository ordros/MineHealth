package com.minehealth.handler;

import com.minehealth.logbook.EatLogBook;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.item.ItemFood;
import net.minecraftforge.event.entity.player.PlayerUseItemEvent.Finish;

import java.util.List;

public class EatEventListener {
    EatLogBook logbook = new EatLogBook();
    public EatEventListener(){
    }
    @SubscribeEvent
    public void SomethingEaten(Finish event){
        if(event.item.getItem() instanceof ItemFood){
            logbook.addEatLog(event.item);
        }

    }
}
