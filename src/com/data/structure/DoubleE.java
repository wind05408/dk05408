package com.data.structure;

import java.math.BigDecimal;

/**
 * @author dk
 * @date 2016/1/14
 */
public class DoubleE {
    public static void main(String[] args) {
        Double d = 5.7657567575757E13;
        //BigDecimal b = new BigDecimal(d).setScale(2,BigDecimal.ROUND_HALF_DOWN);
        System.out.println(doubleFormat(d));
        System.out.println(d.toString());
        System.out.println(String.valueOf(d));
        System.out.println(d.doubleValue());

    }

    private static Object  doubleFormat(Double d){
        double dd = new BigDecimal(d).setScale(2, BigDecimal.ROUND_HALF_DOWN).doubleValue();
        if(dd % 1.0 == 0){
            return (long)dd;
        }
        return dd;
    }

}
