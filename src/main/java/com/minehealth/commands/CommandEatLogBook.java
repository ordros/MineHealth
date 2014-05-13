package com.minehealth.commands;

import com.minehealth.MineHealthCore;
import com.minehealth.nutrition.NutritionFacts;
import com.minehealth.logbook.EatLogBook;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;

import java.util.List;

public class CommandEatLogBook extends CommandBase {

    int LOG_MAX = MineHealthCore.NumEffectiveLog;
    public CommandEatLogBook(){
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
        int countLog = 0, index;
        EatLogBook logbook = new EatLogBook();
        List<ItemStack> log = logbook.getEatLog();
        NutritionFacts facts;
        EntityPlayerMP entity = getCommandSenderAsPlayer(icommandsender);

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
