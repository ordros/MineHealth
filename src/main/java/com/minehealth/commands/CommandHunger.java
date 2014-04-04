package com.minehealth.commands;

import java.util.*;
import net.minecraft.command.*;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.potion.PotionEffect;

public class CommandHunger extends CommandBase{
    private List aliases;
    public CommandHunger()
    {
        this.aliases = new ArrayList();
        this.aliases.add("hunger");
    }

    @Override
    public String getCommandName() { return "hunger"; }

    @Override
    public String getCommandUsage(ICommandSender icommandsender)
    {
        return "hunger";
    }

    @Override
    public List getCommandAliases()
    {
        return this.aliases;
    }

    @Override
    public void processCommand(ICommandSender icommandsender, String[] astring)
    {
        int potionID = 4;
        EntityPlayerMP entity;
        if (astring.length > 1)
        {
            entity = getPlayer(icommandsender, astring[1]);
        }
        else
        {
            entity = getCommandSenderAsPlayer(icommandsender);
        }
        entity.addPotionEffect(new PotionEffect(potionID, 200));
        potionID ++;
        return;
    }

    @Override
    public boolean canCommandSenderUseCommand(ICommandSender icommandsender)
    {
        return true;
    }

    @Override
    public List addTabCompletionOptions(ICommandSender icommandsender, String[] astring)
    {
        return null;
    }

    @Override
    public boolean isUsernameIndex(String[] astring, int i)
    {
        return false;
    }

    @Override
    public int compareTo(Object o)
    {
        return 0;
    }

}
