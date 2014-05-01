package com.minehealth.logbook;


import com.minehealth.nutrition.Foods;
import net.minecraft.item.ItemStack;

import java.io.*;
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
                PrintLog.add(i.next());
            }
            else{ i.next(); }
            j++;
        }
        return PrintLog;
    }
    public void addEatLog(ItemStack item){
        this.log.add(item);
    }

    public void clearEatlog(){
        this.log.clear();
    }

    public void saveEatLog(){
        List<ItemStack> SaveLog = new ArrayList<ItemStack>();
        SaveLog = getEatLog();
        File file = new File("eatlog");
        try{
            FileWriter filewriter = new FileWriter(file);
                try {
                    for (ItemStack item : SaveLog) {
                        filewriter.write(item.getDisplayName()+"\r\n");
                    }
                }finally {
                    filewriter.close();
                }
        }catch(IOException e) {
            System.out.println(e);
        }
    }

    public void loadEatLog() {
        File file = new File("eatlog");
        String str;
        clearEatlog();
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            try {
                while((str = br.readLine()) != null){
                    addEatLog(Foods.NameToItemStack(str));
                    addEatLog(Foods.NameToItemStack(str));
                }
            } finally {
                br.close();
            }
        } catch (IOException e){
            System.out.println(e);
        }

    }

}
