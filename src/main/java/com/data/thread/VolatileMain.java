package com.data.thread;

/**
 * @author dk
 * @date 2016/1/18
 */
public class VolatileMain {
    public volatile int inc =0;
    public void increase(){
        inc++;
    }
    public static void main(String[] args) {
        final VolatileMain main = new VolatileMain();
        for(int i=0;i<10;i++){
            new Thread(){
                public void run() {
                    for(int j=0;j<1000;j++)
                        main.increase();
                }
            }.start();
        }

        while(Thread.activeCount()>2)  //��֤ǰ����̶߳�ִ����
            Thread.yield();
        System.out.println(main.inc);

    }
}
