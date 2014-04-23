package com.minehealth.effect;


import net.minecraft.potion.PotionEffect;
import net.minecraftforge.event.entity.player.PlayerUseItemEvent;

public class EffectJumpBoost{
    public static void effect(PlayerUseItemEvent event, int level){
        event.entityPlayer.addPotionEffect(new PotionEffect(8, 100*20, level));
    }
}
