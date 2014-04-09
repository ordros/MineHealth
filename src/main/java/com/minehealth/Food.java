package com.minehealth;

/**
 * Created by favcastle on 2014/04/09.
 */
public enum Food {

    APPLE("Apple"),
    BAKED_POTATO("Baked Potato"),
    BREAD("Bread"),
    CAKE("Carrot"),
    CLOWNFISH("Clownfish"),
    COOKED_CHICKEN("Cooked Chicken"),
    COOKED_FISH("Cooked Fish"),
    COOKED_PORKCHOP("Cooked Porkchop"),
    COOKED_SALMON("Cooked Salmon"),
    COOKIE("Cookie"),
    GOLDEN_APPLE("Golden Apple"),
    GOLDEN_CARROT("Golden Carrot"),
    MELON("Melon"),
    MUSHROOM_STEW("Mushroom Stew"),
    POISONOUS_POTATO("Poisonous Potato"),
    POTATO("Potato"),
    PUFFERFISH("Pufferfish"),
    PUMPKIN_PIE("Pumpkin Pie"),
    RAW_BEEF("Raw Beef"),
    RAW_CHICKEN("Raw Chicken"),
    RAW_FISH("Raw Fish"),
    RAW_PORKCHOP("Raw Porkchop"),
    RAW_SALMON("Raw Salmon"),
    ROTTEN_FLESH("Rotten Flesh"),
    SPIDER_EYE("Spider Eye"),
    STEAK("Steak"),
    NOT_FOOD("");

    private String displayName;
    private Food(String displayName){
        this.displayName = displayName;
    }
    @Override
    public String toString(){ return displayName;}

    public static Food toFood(String displayName){
        Food result = null;

        for(Food food : values()){
            if(food.toString().equals(displayName)){
                result = food;
                break;
            }
        }
        return result != null ? result:NOT_FOOD;
    }
}
