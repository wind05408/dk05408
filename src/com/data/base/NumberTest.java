package com.data.base;

import java.math.BigDecimal;
import java.util.Random;

/**
 * @author dk
 * @date 2016/3/9
 */
public class NumberTest {
    public static void main(String[] args) {
//        System.out.println(Integer.toBinaryString(29));
//        System.out.println(Integer.toBinaryString(-1<<29));

//        BigDecimal d = new BigDecimal("40.00");
//        BigDecimal d1 = new BigDecimal("1478122800.00");
//        Double dd = new Double("44444.0010");
//        System.out.println("d:="+d);
//        java.text.NumberFormat nf = java.text.NumberFormat.getInstance();
//        nf.setGroupingUsed(false);
//        System.out.println("d:="+nf.format(new BigDecimal(dd)));
//        System.out.println(nf.format(dd));
//
//        System.out.println(new BigDecimal("1144555822511.0122250000").stripTrailingZeros().toString());
//
//        System.out.println(d.stripTrailingZeros().toPlainString());
//        System.out.println(d1.stripTrailingZeros().toPlainString());

        String test =get6AnyString();
        System.out.println("1"+test);
//        if(StringUtils.isNotBlank(orderNo)){
        test = test.substring(0,test.length()-6);
//        }
        System.out.println("1"+test);
    }

    private static String get6AnyString(){
        String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < 6; ++i) {
            int number = random.nextInt(62);// [0,62)
            sb.append(str.charAt(number));
        }
        return sb.toString();
    }
    public static String generateRandom() {
        Random random = new Random();
        char[] digits = new char[6];
        digits[0] = (char) (random.nextInt(9) + '1');
        for (int i = 1; i < 6; i++) {
            digits[i] = (char) (random.nextInt(10) + '0');
        }
        return new String(digits);
    }
}
