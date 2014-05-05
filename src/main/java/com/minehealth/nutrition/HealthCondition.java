package com.minehealth.nutrition;

import net.minecraft.entity.player.EntityPlayer;

public class HealthCondition {
    private final double protein;
    private final double carbohydrate;
    private final double fats;
    private final double minerals;
    private final double vitamins;
    private final double all_nutrients;

    public boolean isOverFats = false;

    public HealthCondition(NutritionFacts facts){
        this.protein = facts.getProtein();
        this.carbohydrate = facts.getCarbohydrate();
        this.fats = facts.getFats();
        this.minerals = facts.getMinerals();
        this.vitamins = facts.getVitamins();
        this.all_nutrients = this.protein + this.carbohydrate + this.fats + this.minerals + this.vitamins;
    }

    public void DecideCondition(){
        if(this.fats/this.all_nutrients  >= 0.3) isOverFats = true;

    }

    public void EffectByCondition(EntityPlayer player){
        DecideCondition();
        if(isOverFats == true){
            NutritionalDisorders.Obesity(player);
        }
    }
}
