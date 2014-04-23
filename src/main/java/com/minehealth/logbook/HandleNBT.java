package com.minehealth.logbook;



import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.nbt.NBTTagString;
import net.minecraftforge.common.util.Constants;
import net.minecraftforge.event.entity.player.PlayerUseItemEvent;

import java.util.ArrayList;
import java.util.List;

public class HandleNBT {

    List<ItemStack> Log = new ArrayList<ItemStack>();
    EatLogBook logBook = new EatLogBook();

    HandleNBT(NBTTagCompound tag){

        if(tag.getTagList("EatLog", Constants.NBT.TAG_LIST) == null) {
            tag.setTag("EatLog", new NBTTagList());
        }
    }

    public void writeToNBT(List<ItemStack> log){
        Log = logBook.getEatLog();
        for(ItemStack food: Log){
            food.
        }
    }

    public List readFromNBT(NBTTagCompound tag){
        Log = logBook.getEatLog();
        NBTTagList foods = tag.getTagList("EatLog",Constants.NBT.TAG_LIST);
        for(int i=0; i<foods.tagCount(); ++i){
            NBTTagCompound item = (NBTTagCompound) foods.getCompoundTagAt(i);
            System.out.println(item.getString("EatLog"));
        }
        return null;
    }

}
