package com.minehealth.handler;

import com.minehealth.logbook.EatLogBook;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagInt;
import net.minecraft.nbt.NBTTagString;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;

public class UserLoginHandler {
    EatLogBook logBook = new EatLogBook();

    @SubscribeEvent
    public void LoadEatLog(EntityJoinWorldEvent event){
        EatLogBook logBook = new EatLogBook();
        if(event.entity instanceof EntityPlayer) {    // when player login
            logBook.loadEatLog();
        }
    }
}
