package com.minehealth.commands;

import com.minehealth.MineHealthCore;
import com.minehealth.effect.NutritionBalance;
import com.minehealth.logbook.EatLogBook;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import scala.tools.cmd.gen.AnyVals;

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
        int n[], i = 0, j;
        EatLogBook logbook = new EatLogBook();
        List<ItemStack> log = logbook.getEatLog();
        EntityPlayerMP entity = getCommandSenderAsPlayer(icommandsender);

        if(!log.isEmpty()) {
            entity.addChatMessage(new ChatComponentText("---- Eat Log ---- "));
            j = log.size() > LOG_MAX ? log.size() - LOG_MAX : 0;
            for (; j < log.size() && i < LOG_MAX; j++) {
                entity.addChatMessage(new ChatComponentText(log.get(j).getDisplayName()));
                i++;
            }
            n = NutritionBalance.CalcNutritionSum();
            entity.addChatMessage(new ChatComponentText(String.valueOf(n[0] + " " + n[1] + " " + n[2] + " " + n[3] + " " + n[4])));
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
