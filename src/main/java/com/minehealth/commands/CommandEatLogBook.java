package com.minehealth.commands;

import com.minehealth.MineHealthCore;
import com.minehealth.nutrition.NutritionFacts;
import com.minehealth.logbook.EatLogBook;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.command.PlayerNotFoundException;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;

import java.util.ArrayList;
import java.util.List;

public class CommandEatLogBook extends CommandBase {

    int LOG_MAX = MineHealthCore.NumEffectiveLog;
    private List aliases;
    public CommandEatLogBook()
    {
        this.aliases = new ArrayList();
        this.aliases.add("logs");
    }
    @Override
    public List getCommandAliases(){ return this.aliases; }
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
        int countLog = 0, index;
        EatLogBook logbook = new EatLogBook();
        List<ItemStack> log = logbook.getEatLog();
        NutritionFacts facts;
        EntityPlayerMP entity = null;
        System.out.println("eatlog...");
        entity = (EntityPlayerMP) icommandsender;

    /*    try{
            getCommandSenderAsPlayer(icommandsender);
        }catch (PlayerNotFoundException e){
            e.printStackTrace();
        }
        if (entity == null) System.out.println("null.");
    */
        if(!log.isEmpty()) {
            entity.addChatMessage(new ChatComponentText("---- Eat Log ---- "));
            index = log.size() > LOG_MAX ? log.size() - LOG_MAX : 0;
            for (; index < log.size() && countLog < LOG_MAX; index++) {
                entity.addChatMessage(new ChatComponentText(log.get(index).getDisplayName()));
                countLog++;
            }
        }else{
            entity.addChatMessage(new ChatComponentText(" Log is EMPTY."));
        }
    }

    @Override
    public boolean canCommandSenderUseCommand(ICommandSender icommandsender){ return true; }

    //@Override
    public List addTabCompletionOptions(ICommandSender icommandsender, String[] astring)
    {
        return null;
    }

    @Override
    public boolean isUsernameIndex(String[] astring, int i)
    {
        return false;
    }
/*
    @Override
    public int compareTo(Object o)
    {
        return 0;
    }
*/
}
