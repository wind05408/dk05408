package com.data.thread;

/**
 * @author dk
 * @date 2016/1/18
 */
public class VolatileMain3 extends Thread {
    private static boolean flag = false;
    public void run(){while(!flag);}

    public static void main(String[] args) throws InterruptedException {
        new VolatileMain3().start();
        Thread.sleep(1000);
        flag = true;
    }

}
