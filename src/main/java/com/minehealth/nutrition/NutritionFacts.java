package com.minehealth.nutrition;

import com.minehealth.MineHealthCore;
import com.minehealth.logbook.EatLogBook;
import net.minecraft.item.ItemStack;

import java.util.Collections;
import java.util.List;

public class NutritionFacts {
    private final double protein;
    private final double carbohydrate;
    private final double fats;
    private final double minerals;
    private final double vitamins;

    public static NutritionFacts CalcIngestedNutrition(){
        double protein = 0, carbohydrate = 0, fats = 0, minerals = 0, vitamins = 0;
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
        private double protein = 0;
        private double carbohydrate = 0;
        private double fats = 0;
        private double minerals = 0;
        private double vitamins = 0;

        public Builder protein(double val){
            protein = val; return this;
        }

        public Builder carbohydrate(double val){
            carbohydrate = val; return this;
        }

        public Builder fats(double val){
            fats = val; return this;
        }

        public Builder minerals(double val){
            minerals = val; return this;
        }

        public Builder vitamins(double val){
            vitamins = val; return this;
        }

        public NutritionFacts build(){
            return new NutritionFacts(this);
        }

    }

    public double getProtein(){
        return this.protein;
    }
    public double getCarbohydrate(){
        return this.carbohydrate;
    }
    public double getFats(){
        return this.fats;
    }
    public double getMinerals(){
        return this.minerals;
    }
    public double getVitamins(){
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
