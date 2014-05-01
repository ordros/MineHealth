package com.minehealth;

import com.minehealth.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.List;


public class FoodNutrition {

    public int protein, carbohydrate, fats, minerals, vitamins;

    public FoodNutrition() {}

    public void getFoodNutrition(ItemStack item){
        String foodName = item.getDisplayName();

        switch (Food.toFood(foodName)){
            case APPLE:
                setNutritions(1,1,1,1,1); // protein, carbohydrate, fats, minerals, vitamins
                break;

            case BAKED_POTATO:
                setNutritions(2,1,1,1,1);
                break;

            case BREAD:
                setNutritions(3,1,1,1,1);
                break;

            case CAKE:
                setNutritions(4,1,1,1,1);
                break;

            case CLOWNFISH:
                setNutritions(5,1,1,1,1);
                break;

            case COOKED_CHICKEN:
                setNutritions(6,1,1,1,1);
                break;

            case COOKED_FISH:
                setNutritions(7,1,1,1,1);
                break;

            case COOKED_PORKCHOP:
                setNutritions(8,1,1,1,1);
                break;

            case COOKED_SALMON:
                setNutritions(9,1,1,1,1);
                break;

            case COOKIE:
                setNutritions(10,1,1,1,1);
                break;

            case GOLDEN_APPLE:
                setNutritions(11,1,1,1,1);
                break;

            case GOLDEN_CARROT:
                setNutritions(12,1,1,1,1);
                break;

            case MELON:
                setNutritions(13,1,1,1,1);
                break;

            case MUSHROOM_STEW:
                setNutritions(14,1,1,1,1);
                break;

            case POISONOUS_POTATO:
                setNutritions(15,1,1,1,1);
                break;

            case POTATO:
                setNutritions(16,1,1,1,1);
                break;

            case PUFFERFISH:
                setNutritions(17,1,1,1,1);
                break;

            case PUMPKIN_PIE:
                setNutritions(18,1,1,1,1);
                break;

            case RAW_BEEF:
                setNutritions(19,1,1,1,1);
                break;

            case RAW_CHICKEN:
                setNutritions(20,1,1,1,1);
                break;

            case RAW_FISH:
                setNutritions(21,1,1,1,1);
                break;

            case RAW_PORKCHOP:
                setNutritions(22,1,1,1,1);
                break;

            case RAW_SALMON:
                setNutritions(23,1,1,1,1);
                break;

            case ROTTEN_FLESH:
                setNutritions(24,1,1,1,1);
                break;

            case SPIDER_EYE:
                setNutritions(25,1,1,1,1);
                break;

            case STEAK:
                setNutritions(26,1,1,1,1);
                break;

            default:
                setNutritions(100,2,2,2,2);
                break;

        }
    }
    public void setNutritions(int protein, int carbohydrate, int fats, int minerals, int vitamins){

        this.protein = protein;
        this.carbohydrate = carbohydrate;
        this.fats = fats;
        this.minerals = minerals;
        this.vitamins = vitamins;
    }
}
