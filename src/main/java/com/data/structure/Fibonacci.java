package com.data.structure;

/**
 * @author dk
 * @date 2016/1/14
 */
public class Fibonacci {
    public static void main(String[] args) {
        for (int i=-2;i<=20;i++){
            System.out.println("i="+i+":"+getFibo(i));
        }
    }

    private static int getFibo(int i) {
        if (i < 2)
            return i <= 0 ? 0 : 1;
        else
            return getFibo(i - 1) + getFibo(i - 2);
    }
}
