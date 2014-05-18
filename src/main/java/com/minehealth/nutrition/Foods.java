package com.minehealth.nutrition;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public enum Foods {

    APPLE("Apple"),
    BAKED_POTATO("Baked Potato"),
    BREAD("Bread"),
    CAKE("Cake"),
    CARROT("Carrot"),
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

    private Foods(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public String toString() {
        return displayName;
    }

    public static Foods toFood(String displayName) {
        Foods result = null;

        for (Foods food : values()) {
            if (food.toString().equals(displayName)) {
                result = food;
                break;
            }
        }
        return result != null ? result : NOT_FOOD;
    }

    public static ItemStack NameToItemStack(String displayName) {       //Name of food convert to ItemStack (ex.NametoItemStack("Apple") -> ItemStack(Item(Items.apple)))
        switch (toFood(displayName)) {
            case APPLE:
                return new ItemStack(Items.apple);

            case BAKED_POTATO:
                return new ItemStack(Items.baked_potato);

            case BREAD:
                return new ItemStack(Items.bread);

            case CAKE:
                return new ItemStack(Items.cake);

            case CARROT:
                return new ItemStack(Items.carrot);

            case CLOWNFISH:
                return new ItemStack(Items.fish, 1, (short) 2);

            case COOKED_CHICKEN:
                return new ItemStack(Items.cooked_chicken);

            case COOKED_FISH:
                return new ItemStack(Items.cooked_fished);

            case COOKED_PORKCHOP:
                return new ItemStack(Items.cooked_porkchop);

            case COOKED_SALMON:
                return new ItemStack(Items.cooked_fished, 1, (short) 1);

            case COOKIE:
                return new ItemStack(Items.cookie);

            case GOLDEN_APPLE:
                return new ItemStack(Items.golden_apple);

            case GOLDEN_CARROT:
                return new ItemStack(Items.golden_carrot);

            case MELON:
                return new ItemStack(Items.melon);

            case MUSHROOM_STEW:
                return new ItemStack(Items.mushroom_stew);

            case POISONOUS_POTATO:
                return new ItemStack(Items.poisonous_potato);

            case POTATO:
                return new ItemStack(Items.potato);

            case PUFFERFISH:
                return new ItemStack(Items.fish, 1, (short) 3);

            case PUMPKIN_PIE:
                return new ItemStack(Items.pumpkin_pie);

            case RAW_BEEF:
                return new ItemStack(Items.beef);

            case RAW_CHICKEN:
                return new ItemStack(Items.chicken);

            case RAW_FISH:
                return new ItemStack(Items.fish);

            case RAW_PORKCHOP:
                return new ItemStack(Items.porkchop);

            case RAW_SALMON:
                return new ItemStack(Items.fish, 1, (short) 1);

            case ROTTEN_FLESH:
                return new ItemStack(Items.rotten_flesh);

            case SPIDER_EYE:
                return new ItemStack(Items.spider_eye);

            case STEAK:
                return new ItemStack(Items.cooked_beef);

            case NOT_FOOD:
                return new ItemStack(Items.command_block_minecart); // NOT a Food

            default:
                return new ItemStack(Items.command_block_minecart); // NOT a Food
        }
    }
}



