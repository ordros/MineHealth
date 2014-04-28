package com.minehealth;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

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
    public ItemStack NametoItemStack(String displayName){
        Item item = new Item();
        switch(toFood(displayName)){
            case APPLE:
                return ItemStack(Item.apple);
            /*
            case BAKED_POTATO:
                item.getItemById(260);
            case BREAD:

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
            */
            default:
                break;


        }
    }
}


