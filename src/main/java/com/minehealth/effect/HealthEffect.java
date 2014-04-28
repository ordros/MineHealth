package com.minehealth.effect;


import com.minehealth.FoodNutrition;
import com.minehealth.logbook.EatLogBook;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;

import java.util.Iterator;
import java.util.List;

public class HealthEffect {

    public int protein, carbohydrate, fats, minerals, vitamins;

    public void decideHealth(FoodNutrition food){
        protein = food.protein;
        carbohydrate = food.carbohydrate;
    }


    public void effectBlindness(EntityPlayer player , int level){
        player.addPotionEffect(new PotionEffect(15, 100*20, level));
    }

    public void effectFatigue(EntityPlayer player , int level){
        player.addPotionEffect(new PotionEffect(4, 100*20, level));
    }

    public void effectHaste(EntityPlayer player , int level){
        player.addPotionEffect(new PotionEffect(3, 100*20, level));
    }

    public void effectJumpBoost(EntityPlayer player , int level){
        player.addPotionEffect(new PotionEffect(8, 100*20, level));
    }

    public void effectSlowness(EntityPlayer player , int level){
        player.addPotionEffect(new PotionEffect(2, 100*20, level));
    }

    public void effectSpeed(EntityPlayer player , int level){
        player.addPotionEffect(new PotionEffect(1, 100*20, level));
    }

    public void effectStrength(EntityPlayer player , int level){
        player.addPotionEffect(new PotionEffect(5, 100*20, level));
    }
}
