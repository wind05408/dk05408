package com.lambda;

/**
 * @Description: TODO
 * @Author dk05408
 * @Date 2019/12/19
 **/
public class Lambda {
    public static void PrintString(String s, Print<String> print) {
        print.print(s);
    }
    public static void main(String[] args) {
        PrintString("test", (x) -> System.out.println(x));
        new Thread(()->{
            System.out.println(Thread.currentThread().getName()+"在执行");
        },"Lambda_Thread_Name").start();
    }
}

@FunctionalInterface
interface Print<T> {
    public void print(T x);
}


//javap -p Lambda.class >1.txt
//Compiled from "Lambda.java"
//public class com.lambda.Lambda {
//public com.lambda.Lambda();
//public static void PrintString(java.lang.String, com.lambda.Print<java.lang.String>);
//public static void main(java.lang.String[]);
//private static void lambda$main$0(java.lang.String);
//        }
