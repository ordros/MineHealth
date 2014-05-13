package com.minehealth;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagInt;

public class ManageNBT {
    private NBTBase modeTag;
    private NBTTagCompound tag;
    private EntityPlayer player;

    public ManageNBT(EntityPlayer player){
        this.player = player;
        tag = player.getEntityData();
    }

    public double getNutrientFromNBT(String tag){
        modeTag = this.tag.getTag(tag);
        if(modeTag != null){
            return this.tag.getDouble(tag);
        }else{
            this.tag.setDouble(tag, 0);
            return 0;
        }
    }

    public void setNutrientToNBT(String tag, double nutrient_val){
        this.tag.setDouble(tag, nutrient_val);
    }

}
