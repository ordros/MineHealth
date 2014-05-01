package com.minehealth.nutrition;

import com.minehealth.effect.HealthEffect;
import net.minecraft.entity.player.EntityPlayer;

public class NutritionalDisorders {

    public static void Beriberi(EntityPlayer player){
        HealthEffect.effectSlowness(player, 1);
    }

    public static void Nyctalopia(EntityPlayer player){
        HealthEffect.effectBlindness(player, 1);
    }

    public static void Obesity(EntityPlayer player){
        HealthEffect.effectSlowness(player, 3);
    }

}
