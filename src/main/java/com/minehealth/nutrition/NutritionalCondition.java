package com.minehealth.nutrition;

import com.minehealth.ManageNBT;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

public class NutritionalCondition {
    ManageNBT nbt;
    EntityPlayer player;
    private double protein;
    private double carbohydrate;
    private double fats;
    private double minerals;
    private double vitamins;

    public NutritionalCondition(EntityPlayer player){
        this.player = player;
        this.nbt = new ManageNBT(this.player);
        this.protein = nbt.getNutrientFromNBT("Protein");
        this.carbohydrate = nbt.getNutrientFromNBT("Carbohydrate");
        this.fats = nbt.getNutrientFromNBT("Fats");
        this.minerals = nbt.getNutrientFromNBT("Minerals");
        this.vitamins = nbt.getNutrientFromNBT("Vitamins");
    }

    public void addNutrition(ItemStack item){
        NutritionFacts facts = FoodNutrition.getFoodNutritionFacts(item);
        nbt.setNutrientToNBT("Protein", facts.getProtein() + this.protein);
        nbt.setNutrientToNBT("Carbohydrate", facts.getCarbohydrate() + this.carbohydrate);
        nbt.setNutrientToNBT("Fats", facts.getFats() + this.fats);
        nbt.setNutrientToNBT("Minerals", facts.getMinerals() + this.minerals);
        nbt.setNutrientToNBT("Vitamins", facts.getVitamins() + this.vitamins);
    }

    public void consumeNutrition(int protein, int carbohydrate, int fats, int minerals, int vitamins){  // Consume at working, attacking...
        nbt.setNutrientToNBT("Protein",this.protein - protein);
        nbt.setNutrientToNBT("Carbohydrate", this.carbohydrate - carbohydrate);
        nbt.setNutrientToNBT("Fats", this.fats - fats);
        nbt.setNutrientToNBT("Minerals", this.minerals -minerals);
        nbt.setNutrientToNBT("Vitamins", this.vitamins - vitamins);
    }

}

