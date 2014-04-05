package com.minehealth.logbook;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import java.util.ArrayList;
import java.util.List;

public class EatLogBook {
    private static ArrayList<ItemStack> Log = new ArrayList<ItemStack>();
    public ArrayList<ItemStack> getEatLog(){
        return this.Log;
    }
    public void addEatLog(ItemStack item){
        this.Log.add(item);
    }
}
