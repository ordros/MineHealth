package com.minehealth.commands;

import java.math.BigDecimal;

/**
 * Created by favcastle on 2014/05/04.
 */
public class ShapeOutput {
    public static BigDecimal roundOff(double var, int digit){
        BigDecimal b = new BigDecimal(String.valueOf(var));
        return b.setScale(digit, BigDecimal.ROUND_HALF_UP);
    }
}
