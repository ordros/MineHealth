package com.minehealth.handler;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.item.ItemFood;
import net.minecraftforge.event.entity.player.PlayerUseItemEvent.Finish;

public class EatEventListener {
    @SubscribeEvent
    public void SomethingEaten(Finish event){
        System.out.println("Use ANY Item");
        if(event.item.getItem() instanceof ItemFood){
            System.out.println("This is FOOD!");
        }

    }
}
