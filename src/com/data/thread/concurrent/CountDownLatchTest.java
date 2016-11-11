package com.data.thread.concurrent;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.CountDownLatch;

/**
 * CountDownLatchTest
 *
 * @author dk
 * @date 2016/11/11
 */
public class CountDownLatchTest {
    final static SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(2);
        Worker worker1 = new Worker("zhangSan",5000,latch);
        Worker worker2 = new Worker("liSi",8000,latch);
        worker1.start();
        worker2.start();
        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("all work done at "+sdf.format(new Date())+",and can do other task");
    }


    static class Worker extends Thread{
        String workerName;
        int workTime;
        CountDownLatch latch;

        public Worker(String workerName, int workTime, CountDownLatch latch) {
            this.workerName = workerName;
            this.workTime = workTime;
            this.latch = latch;
        }

        @Override
        public void run() {
            try {
                System.out.println("Worker "+workerName+" do work begin at "+sdf.format(new Date()));
                doWork();//工作了
                System.out.println("Worker "+workerName+" do work complete at "+sdf.format(new Date()));
            } finally {
                latch.countDown();//工人完成工作，计数器减一
            }
        }

        private void doWork() {
            try {
                Thread.sleep(workTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
