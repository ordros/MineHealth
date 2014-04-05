package com.minehealth.commands;

import com.minehealth.logbook.EatLogBook;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by favcastle on 2014/04/05.
 */
public class CommandReadLogBook extends CommandBase {

    private EatLogBook logbook;
    public CommandReadLogBook(){
    }
    @Override
    public List getCommandAliases(){ return null; }
    @Override
    public String getCommandName() { return "eatlog"; }
    @Override
    public String getCommandUsage(ICommandSender icommandsender)
    {
        return "eatlog";
    }
    @Override
    public void processCommand(ICommandSender icommandsender, String[] astring)
    {
        EatLogBook logbook = new EatLogBook();
        ArrayList<ItemStack> log = logbook.getEatLog();
        int j = 1;
        for(Iterator<ItemStack> i = log.iterator(); i.hasNext();) {
            if(j%2 == 0){ System.out.println(i.next().getDisplayName()); }     //duplicate
            else{ i.next(); }
            j++;
        }

        return;
    }

    @Override
    public boolean canCommandSenderUseCommand(ICommandSender icommandsender){ return true; }

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
