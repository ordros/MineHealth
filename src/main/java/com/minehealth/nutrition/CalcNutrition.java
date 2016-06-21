package com.minehealth.nutrition;

import com.minehealth.ManageNBT;
import com.minehealth.logbook.EatLogBook;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.List;

public class CalcNutrition {
    public static NutritionFacts CalcIngestedNutrition(EntityPlayer player){
        double protein = 0;
        double carbohydrate = 0;
        double fats = 0;
        double minerals = 0;
        double vitamins = 0;


        EatLogBook eatLogBook = new EatLogBook();
        List<ItemStack> eatLogList = eatLogBook.getEatLog();
        NutritionFacts nutritionFacts;

        for(ItemStack item : eatLogList){
            nutritionFacts = FoodNutrition.getFoodNutritionFacts(item);
            protein += nutritionFacts.getProtein();
            carbohydrate += nutritionFacts.getCarbohydrate();
            fats += nutritionFacts.getFats();
            minerals += nutritionFacts.getMinerals();
            vitamins += nutritionFacts.getVitamins();
        }
/*
        ManageNBT nbt = new ManageNBT(player);

        protein = nbt.getNutrientFromNBT("Protein");
        carbohydrate = nbt.getNutrientFromNBT("Carbohydrate");
        fats = nbt.getNutrientFromNBT("Fats");
        minerals = nbt.getNutrientFromNBT("Minerals");
        vitamins = nbt.getNutrientFromNBT("Vitamins");
*/
        return new NutritionFacts.Builder().protein(protein).carbohydrate(carbohydrate).fats(fats).minerals(minerals).vitamins(vitamins).build();
    }
}
