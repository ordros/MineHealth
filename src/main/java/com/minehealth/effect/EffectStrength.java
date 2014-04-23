package com.minehealth.effect;


import net.minecraft.potion.PotionEffect;
import net.minecraftforge.event.entity.player.PlayerUseItemEvent;

public class EffectStrength{
    public static void effect(PlayerUseItemEvent event, int level){
        event.entityPlayer.addPotionEffect(new PotionEffect(5, 100*20, level));
    }
}
