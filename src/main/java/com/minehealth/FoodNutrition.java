package com.minehealth;

import com.minehealth.Food;
import net.minecraft.item.ItemStack;


public class FoodNutrition {

    public int protein, carbohydrate, fats, minerals, vitamins;

    public FoodNutrition() {}

    public int[] getFoodNutrition(ItemStack item){
        String foodName = item.getDisplayName();

        switch (Food.toFood(foodName)){
            case APPLE:
                return Nutritions(1,1,1,1,1); // protein, carbohydrate, fats, minerals, vitamins

            case BAKED_POTATO:
                return Nutritions(2,1,1,1,1);

            case BREAD:
                return Nutritions(3,1,1,1,1);

            case CAKE:
                return Nutritions(4,1,1,1,1);

            case CLOWNFISH:
                return Nutritions(5,1,1,1,1);

            case COOKED_CHICKEN:
                return Nutritions(6,1,1,1,1);

            case COOKED_FISH:
                return Nutritions(7,1,1,1,1);

            case COOKED_PORKCHOP:
                return Nutritions(8,1,1,1,1);

            case COOKED_SALMON:
                return Nutritions(9,1,1,1,1);

            case COOKIE:
                return Nutritions(10,1,1,1,1);

            case GOLDEN_APPLE:
                return Nutritions(11,1,1,1,1);

            case GOLDEN_CARROT:
                return Nutritions(12,1,1,1,1);

            case MELON:
                return Nutritions(13,1,1,1,1);

            case MUSHROOM_STEW:
                return Nutritions(14,1,1,1,1);

            case POISONOUS_POTATO:
                return Nutritions(15,1,1,1,1);

            case POTATO:
                return Nutritions(16,1,1,1,1);

            case PUFFERFISH:
                return Nutritions(17,1,1,1,1);

            case PUMPKIN_PIE:
                return Nutritions(18,1,1,1,1);

            case RAW_BEEF:
                return Nutritions(19,1,1,1,1);

            case RAW_CHICKEN:
                return Nutritions(20,1,1,1,1);

            case RAW_FISH:
                return Nutritions(21,1,1,1,1);

            case RAW_PORKCHOP:
                return Nutritions(22,1,1,1,1);

            case RAW_SALMON:
                return Nutritions(23,1,1,1,1);

            case ROTTEN_FLESH:
                return Nutritions(24,1,1,1,1);

            case SPIDER_EYE:
                return Nutritions(25,1,1,1,1);

            case STEAK:
                return Nutritions(26,1,1,1,1);

            default:
                return Nutritions(100,2,2,2,2);

        }
    }
    public int[] Nutritions(int protein, int carbohydrate, int fats, int minerals, int vitamins){
        int[] nutritions = { protein, carbohydrate, fats, minerals, vitamins };

        this.protein = protein;
        this.carbohydrate = carbohydrate;
        this.fats = fats;
        this.minerals = minerals;
        this.vitamins = vitamins;

        return nutritions;
    }
}
