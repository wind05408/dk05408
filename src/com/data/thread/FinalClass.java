package com.data.thread;

/**
 * @author dk
 * @date 2016/1/25
 */
public class FinalClass {
    public static void main(String[] args) {
        String a = "hello2";
        final String b = "hello";
        String d = "hello";
        String c = b + 2;
        String e = d + 2;
        System.out.println((a == c));
        System.out.println((a == e));

        String f = getHello()+2;
        System.out.println((e == f));
    }

    public static String getHello() {
        return "hello";
    }
}
