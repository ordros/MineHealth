package com.minehealth.commands;

import com.minehealth.FormingOutput;
import com.minehealth.nutrition.CalcNutrition;
import com.minehealth.nutrition.FoodNutrition;
import com.minehealth.nutrition.Foods;
import com.minehealth.nutrition.NutritionFacts;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.command.PlayerNotFoundException;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;

import java.util.ArrayList;
import java.util.List;

public class CommandShowNutrients extends CommandBase{
    private List aliases;
    NutritionFacts facts;

    public CommandShowNutrients(){
        this.aliases = new ArrayList();
        this.aliases.add("nutrients");
        this.aliases.add("nut");
    }
    @Override
    public String getCommandName(){ return "nutrients"; }

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
    public void processCommand(ICommandSender icommandsender, String[] astring) throws PlayerNotFoundException
    {
        EntityPlayerMP entity;
        //entity = getCommandSenderAsPlayer(icommandsender);
        entity = (EntityPlayerMP) icommandsender;
        ItemStack food;

        if(astring.length != 0){
            if(Items.command_block_minecart == Foods.NameToItemStack(astring[0]).getItem()){ //NOT exist specify FOOD
                entity.addChatMessage(new ChatComponentText(astring[0]+" is NOT Food"));
            }else{
                food = Foods.NameToItemStack(astring[0]);
                entity.addChatComponentMessage(new ChatComponentText("==Nutrients of "+astring[0]+"=="));
                printNutritions(FoodNutrition.getFoodNutritionFacts(food), entity);
            }
        }else {
            facts = CalcNutrition.CalcIngestedNutrition(entity);
            entity.addChatComponentMessage(new ChatComponentText("==Nutritional Status=="));
            printNutritions(facts, entity);
        }

    }

    private void printNutritions(NutritionFacts facts, EntityPlayerMP entity){
        entity.addChatMessage(new ChatComponentText("Protein: " + String.valueOf(FormingOutput.roundOff(facts.getProtein(), 2)) + "mg"));
        entity.addChatMessage(new ChatComponentText("Carbohydrate: " + String.valueOf(FormingOutput.roundOff(facts.getCarbohydrate(), 2)) + "mg"));
        entity.addChatMessage(new ChatComponentText("Fat: " + String.valueOf(FormingOutput.roundOff(facts.getFats(), 2)) + "mg"));
        entity.addChatMessage(new ChatComponentText("Mineral: " + String.valueOf(FormingOutput.roundOff(facts.getMinerals(), 2)) + "mg"));
        entity.addChatMessage(new ChatComponentText("Vitamins: " + String.valueOf(FormingOutput.roundOff(facts.getVitamins(), 2)) + "mg"));
    }


    @Override
    public boolean canCommandSenderUseCommand(ICommandSender icommandsender) { return true; }
}
