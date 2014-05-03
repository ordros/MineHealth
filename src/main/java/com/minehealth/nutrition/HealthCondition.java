package com.minehealth.nutrition;

import com.minehealth.effect.HealthEffect;
import net.minecraft.entity.player.EntityPlayer;

public class HealthCondition {
    private final int protein;
    private final int carbohydrate;
    private final int fats;
    private final int minerals;
    private final int vitamins;
    private final int all_nutrients;

    public boolean isObesity = false;

    public HealthCondition(NutritionFacts facts){
        this.protein = facts.getProtein();
        this.carbohydrate = facts.getCarbohydrate();
        this.fats = facts.getFats();
        this.minerals = facts.getMinerals();
        this.vitamins = facts.getVitamins();
        this.all_nutrients = this.protein + this.carbohydrate + this.fats + this.minerals + this.vitamins;
    }

    public void DecideCondition(){
        if(this.fats/this.all_nutrients  >= 0.3) isObesity = true;
    }

    public void EffectByCondition(EntityPlayer player){
        DecideCondition();
        if(isObesity == true){
            NutritionalDisorders.Obesity(player);
        }
    }
}
