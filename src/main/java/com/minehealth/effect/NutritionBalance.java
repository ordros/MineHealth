package com.minehealth.effect;

import com.minehealth.FoodNutrition;
import com.minehealth.MineHealthCore;
import com.minehealth.logbook.EatLogBook;
import net.minecraft.item.ItemStack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NutritionBalance {

    public NutritionBalance(){}

    public static int[] CalcNutritionSum(){
        int protein = 0, carbohydrate = 0, fats = 0, minerals = 0, vitamins = 0;
        int LOG_MAX = MineHealthCore.NumEffectiveLog;
        System.out.println(LOG_MAX);

        FoodNutrition food = new FoodNutrition();
        EatLogBook logBook = new EatLogBook();
        List<ItemStack> log = logBook.getEatLog();

        Collections.reverse(log);
        for(ItemStack item: log){
            food.getFoodNutrition(item);

            protein += food.protein;
            carbohydrate += food.carbohydrate;
            fats += food.fats;
            minerals += food.minerals;
            vitamins += food.vitamins;

            LOG_MAX--;
            if(LOG_MAX <= 0) break;
        }
        int[] n={protein, carbohydrate, fats, minerals, vitamins};
        return n;
    }





}
