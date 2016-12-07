package com.vm.demo1;

/**
 * VM1
 *
 * @author dk
 * @date 2016/11/30
 */
public class VM1 {
    public static void main(String[] args) {
//        for (int i = 0; i <2 ; i++) {
//            Byte[] b = new Byte[1024*1024];
//        }
//        byte[] b = new byte[10 * 1024 * 1024];
//        System.out.println("分配了10M空间给数组");
        System.gc();
        System.out.println("Xmx=" + Runtime.getRuntime().maxMemory() / 1024.0 / 1024 + "M");     //系统的最大空间

        System.out.println("free mem=" + Runtime.getRuntime().freeMemory() / 1024.0 / 1024 + "M");   //系统的空闲空间

        System.out.println("total mem=" + Runtime.getRuntime().totalMemory() / 1024.0 / 1024 + "M");   //当前可用的总空间
//        Runtime.getRuntime().freeMemory(); //当前JVM空闲内存
//        Runtime.getRuntime().totalMemory(); //当前JVM占用的内存总数，其值相当于当前JVM已使用的内存及freeMemory()的总和
    }
}
