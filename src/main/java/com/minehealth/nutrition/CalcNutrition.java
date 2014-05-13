package com.minehealth.nutrition;

import com.minehealth.ManageNBT;
import net.minecraft.entity.player.EntityPlayer;

public class CalcNutrition {
    public static NutritionFacts CalcIngestedNutrition(EntityPlayer player){
        double protein = 0;
        double carbohydrate = 0;
        double fats = 0;
        double minerals = 0;
        double vitamins = 0;

        ManageNBT nbt = new ManageNBT(player);

        protein = nbt.getNutrientFromNBT("Protein");
        carbohydrate = nbt.getNutrientFromNBT("Carbohydrate");
        fats = nbt.getNutrientFromNBT("Fats");
        minerals = nbt.getNutrientFromNBT("Minerals");
        vitamins = nbt.getNutrientFromNBT("Vitamins");

        return new NutritionFacts.Builder().protein(protein).carbohydrate(carbohydrate).fats(fats).minerals(minerals).vitamins(vitamins).build();
    }
}
