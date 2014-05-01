package com.minehealth.effect;


import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.PotionEffect;

public class HealthEffect {

    public static void effectBlindness(EntityPlayer player , int level){
        player.addPotionEffect(new PotionEffect(15, 100*20, level));
    }

    public static void effectFatigue(EntityPlayer player , int level){
        player.addPotionEffect(new PotionEffect(4, 100*20, level));
    }

    public static void effectHaste(EntityPlayer player , int level){
        player.addPotionEffect(new PotionEffect(3, 100*20, level));
    }

    public static void effectJumpBoost(EntityPlayer player , int level){
        player.addPotionEffect(new PotionEffect(8, 100*20, level));
    }

    public static void effectSlowness(EntityPlayer player , int level){
        player.addPotionEffect(new PotionEffect(2, 100*20, level));
    }

    public static void effectSpeed(EntityPlayer player , int level){
        player.addPotionEffect(new PotionEffect(1, 100*20, level));
    }

    public static void effectStrength(EntityPlayer player , int level){
        player.addPotionEffect(new PotionEffect(5, 100*20, level));
    }
}
