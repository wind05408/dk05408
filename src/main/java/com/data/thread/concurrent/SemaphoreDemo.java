package com.data.thread.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * SemaphoreDemo
 *
 * @author dk
 * @date 2016/11/14
 * Semaphore相当于有一共有n个许可，当n个许可中有空闲时，别的线程才能获得许可.
 * 单个信号量的Semaphore对象可以实现互斥锁的功能，并且可以是由一个线程获得了“锁”，再由另一个线程释放“锁”，这可应用于死锁恢复的一些场合。
 */
public class SemaphoreDemo {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        final Semaphore semaphore = new Semaphore(5);
        for (int i = 1; i <=20 ; i++) {
            final int NO = i;
            Runnable run = new Runnable() {
                @Override
                public void run() {
                    try {
                        semaphore.acquire();
                        System.out.println("Accessing NO="+NO);
                        TimeUnit.MILLISECONDS.sleep((long) (Math.random()*10000));
                        semaphore.release();
                        System.out.println("---------- semaphore have "+semaphore.availablePermits()+" seat");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            };
            exec.execute(run);
        }
        exec.shutdown();
    }
}
