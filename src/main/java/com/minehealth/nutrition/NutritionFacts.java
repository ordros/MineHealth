package com.minehealth.nutrition;

import com.minehealth.MineHealthCore;
import com.minehealth.logbook.EatLogBook;
import net.minecraft.item.ItemStack;

import java.util.Collections;
import java.util.List;

public class NutritionFacts {
    private final int protein;
    private final int carbohydrate;
    private final int fats;
    private final int minerals;
    private final int vitamins;

    public static NutritionFacts CalcIngestedNutrition(){
        int protein = 0, carbohydrate = 0, fats = 0, minerals = 0, vitamins = 0;
        int LOG_MAX = MineHealthCore.NumEffectiveLog;

        FoodNutrition food = new FoodNutrition();
        EatLogBook logBook = new EatLogBook();
        NutritionFacts facts;
        List<ItemStack> log = logBook.getEatLog();

        Collections.reverse(log);
        for(ItemStack item: log){
            facts = food.getFoodNutritionFacts(item);

            protein += facts.getProtein();
            carbohydrate += facts.getCarbohydrate();
            fats += facts.getFats();
            minerals += facts.getMinerals();
            vitamins += facts.getVitamins();

            LOG_MAX--;
            if(LOG_MAX <= 0) break;
        }
        return new Builder().protein(protein).carbohydrate(carbohydrate).fats(fats).minerals(minerals).vitamins(vitamins).build();

    }

    public static class Builder{
        private int protein = 0;
        private int carbohydrate = 0;
        private int fats = 0;
        private int minerals = 0;
        private int vitamins = 0;

        public Builder protein(int val){
            protein = val; return this;
        }

        public Builder carbohydrate(int val){
            carbohydrate = val; return this;
        }

        public Builder fats(int val){
            fats = val; return this;
        }

        public Builder minerals(int val){
            minerals = val; return this;
        }

        public Builder vitamins(int val){
            vitamins = val; return this;
        }

        public NutritionFacts build(){
            return new NutritionFacts(this);
        }

    }

    public int getProtein(){
        return this.protein;
    }
    public int getCarbohydrate(){
        return this.carbohydrate;
    }
    public int getFats(){
        return this.fats;
    }
    public int getMinerals(){
        return this.minerals;
    }
    public int getVitamins(){
        return this.vitamins;
    }

    public NutritionFacts(Builder builder){
        protein = builder.protein;
        carbohydrate = builder.carbohydrate;
        fats = builder.fats;
        minerals = builder.minerals;
        vitamins = builder.vitamins;
    }

}
