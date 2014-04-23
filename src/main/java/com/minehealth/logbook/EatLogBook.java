package com.minehealth.logbook;


import net.minecraft.item.ItemStack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EatLogBook {

    private static List<ItemStack> log = new ArrayList<ItemStack>();
    public List<ItemStack> getEatLog(){
        int j=1;
        List<ItemStack> PrintLog = new ArrayList<ItemStack>();
        for(Iterator<ItemStack> i = log.iterator(); i.hasNext();){
            if(j%2 == 0){
                log.add(i.next());
            }
            else{ i.next(); }
            j++;
        }
        return this.log;
    }
    public void addEatLog(ItemStack item){
        this.log.add(item);
    }

}
