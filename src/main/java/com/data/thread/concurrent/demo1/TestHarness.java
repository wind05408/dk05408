package com.data.thread.concurrent.demo1;

import java.util.concurrent.CountDownLatch;

/**
 * TestHarness
 *
 * @author dk
 * @date 2016/11/14
 */
public class TestHarness {
    public static void main(String[] args) throws InterruptedException {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("task run");

            }
        };
        TestHarness t = new TestHarness();
        long time = t.timeTasks(5, r);

        System.out.println(time);
    }
    public long timeTasks(int nThreads,final Runnable task) throws InterruptedException{
        final CountDownLatch startGate = new CountDownLatch(1);
        final CountDownLatch endGate = new CountDownLatch(nThreads);
        for (int i = 0; i <nThreads; i++) {
         Thread t = new Thread(){
             @Override
             public void run() {
                 try {
                     startGate.await();
                     try {
                         task.run();
                     } finally {
                         endGate.countDown();
                     }

                 } catch (InterruptedException e) {
                     e.printStackTrace();
                 }
             }
         };
            t.start();
        }
        long start = System.nanoTime();
        startGate.countDown();
        endGate.await();
        return System.nanoTime() - start;
    }
}


