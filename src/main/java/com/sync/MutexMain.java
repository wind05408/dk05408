package com.sync;

import java.util.Collection;
import java.util.Random;

/**
 * @Description: TODO
 * @Author dk05408
 * @Date 2019/12/21
 **/
public class MutexMain {
    private static Random random = new Random(47);
    private static int threadCount = 10;
    private static Mutex mutex = new Mutex();

    private static class Weight implements Runnable {//给苹果称重的任务
        String name;

        public Weight(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            mutex.lock();
            System.out.println(name + "放苹果！");
            System.out.println(name + "重量：" + (random.nextInt(10) + 3));
            System.out.println(name + "取苹果！");
            printQueuedThreads(mutex.getQueuedThreads());
            mutex.unlock();
        }
    }

    private static void printQueuedThreads(Collection<Thread> threads) {
        System.out.print("等待队列中的线程：");
        for (Thread t : threads) {
            System.out.print(t.getName() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Thread[] threads = new Thread[threadCount];
        for (int i = 0; i < threadCount; i++) {
            threads[i] = new Thread(new Weight("Weight-" + i), "Thread-" + i);
        }
        for (int i = 0; i < threadCount; i++) {
            threads[i].start();
        }
    }
}
