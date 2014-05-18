package com.minehealth;

import java.math.BigDecimal;

public class FormingOutput {
    public static BigDecimal roundOff(double var, int digit){
        BigDecimal b = new BigDecimal(String.valueOf(var));
        return b.setScale(digit, BigDecimal.ROUND_HALF_UP);
    }
}
