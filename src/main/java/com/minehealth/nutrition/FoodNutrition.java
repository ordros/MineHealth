package com.minehealth.nutrition;

import net.minecraft.item.ItemStack;


public class FoodNutrition {

    public NutritionFacts getFoodNutritionFacts(ItemStack item){
        String foodName = item.getDisplayName();

        switch (Foods.toFood(foodName)){
            case APPLE:
                return new NutritionFacts.Builder().protein(1).carbohydrate(1).fats(1).minerals(1).vitamins(1).build();

            case BAKED_POTATO:
                return new NutritionFacts.Builder().protein(2).carbohydrate(1).fats(1).minerals(1).vitamins(1).build();

            case BREAD:
                return new NutritionFacts.Builder().protein(3).carbohydrate(1).fats(1).minerals(1).vitamins(1).build();

            case CAKE:
                return new NutritionFacts.Builder().protein(4).carbohydrate(1).fats(1).minerals(1).vitamins(1).build();

            case CLOWNFISH:
                return new NutritionFacts.Builder().protein(5).carbohydrate(1).fats(1).minerals(1).vitamins(1).build();

            case COOKED_CHICKEN:
                return new NutritionFacts.Builder().protein(6).carbohydrate(1).fats(1).minerals(1).vitamins(1).build();

            case COOKED_FISH:
                return new NutritionFacts.Builder().protein(7).carbohydrate(1).fats(1).minerals(1).vitamins(1).build();

            case COOKED_PORKCHOP:
                return new NutritionFacts.Builder().protein(8).carbohydrate(1).fats(1).minerals(1).vitamins(1).build();

            case COOKED_SALMON:
                return new NutritionFacts.Builder().protein(9).carbohydrate(1).fats(1).minerals(1).vitamins(1).build();

            case COOKIE:
                return new NutritionFacts.Builder().protein(10).carbohydrate(1).fats(1).minerals(1).vitamins(1).build();

            case GOLDEN_APPLE:
                return new NutritionFacts.Builder().protein(11).carbohydrate(1).fats(1).minerals(1).vitamins(1).build();

            case GOLDEN_CARROT:
                return new NutritionFacts.Builder().protein(12).carbohydrate(1).fats(1).minerals(1).vitamins(1).build();

            case MELON:
                return new NutritionFacts.Builder().protein(13).carbohydrate(1).fats(1).minerals(1).vitamins(1).build();

            case MUSHROOM_STEW:
                return new NutritionFacts.Builder().protein(14).carbohydrate(1).fats(1).minerals(1).vitamins(1).build();

            case POISONOUS_POTATO:
                return new NutritionFacts.Builder().protein(15).carbohydrate(1).fats(1).minerals(1).vitamins(1).build();

            case POTATO:
                return new NutritionFacts.Builder().protein(16).carbohydrate(1).fats(1).minerals(1).vitamins(1).build();

            case PUFFERFISH:
                return new NutritionFacts.Builder().protein(17).carbohydrate(1).fats(1).minerals(1).vitamins(1).build();

            case PUMPKIN_PIE:
                return new NutritionFacts.Builder().protein(18).carbohydrate(1).fats(1).minerals(1).vitamins(1).build();

            case RAW_BEEF:
                return new NutritionFacts.Builder().protein(19).carbohydrate(1).fats(1).minerals(1).vitamins(1).build();

            case RAW_CHICKEN:
                return new NutritionFacts.Builder().protein(20).carbohydrate(1).fats(1).minerals(1).vitamins(1).build();

            case RAW_FISH:
                return new NutritionFacts.Builder().protein(21).carbohydrate(1).fats(1).minerals(1).vitamins(1).build();

            case RAW_PORKCHOP:
                return new NutritionFacts.Builder().protein(22).carbohydrate(1).fats(1).minerals(1).vitamins(1).build();

            case RAW_SALMON:
                return new NutritionFacts.Builder().protein(23).carbohydrate(1).fats(1).minerals(1).vitamins(1).build();

            case ROTTEN_FLESH:
                return new NutritionFacts.Builder().protein(24).carbohydrate(1).fats(1).minerals(1).vitamins(1).build();

            case SPIDER_EYE:
                return new NutritionFacts.Builder().protein(25).carbohydrate(1).fats(1).minerals(1).vitamins(1).build();

            case STEAK:
                return new NutritionFacts.Builder().protein(26).carbohydrate(1).fats(1).minerals(1).vitamins(1).build();

            default:
                return new NutritionFacts.Builder().protein(27).carbohydrate(1).fats(1).minerals(1).vitamins(1).build();
        }
    }
}
