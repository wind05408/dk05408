package com.data.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author dk
 * @date 2016/1/18
 */
public class VolatileMain2 {
    public  int inc = 0;
    Lock lock = new ReentrantLock();

    public  void increase() {
        lock.lock();
        try {
            inc++;
        } finally{
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        final VolatileMain2 test = new VolatileMain2();
        for(int i=0;i<3;i++){
            new Thread(){
                public void run() {
                    for(int j=0;j<10;j++)
                        test.increase();
                };
            }.start();
        }


        while(Thread.activeCount()>1){
            //保证前面的线程都执行完
            Thread.yield();
            System.out.println(Thread.activeCount());
        }
        System.out.println(test.inc);
    }
}
