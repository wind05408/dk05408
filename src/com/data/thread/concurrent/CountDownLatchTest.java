package com.data.thread.concurrent;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.CountDownLatch;

/**
 * CountDownLatchTest
 *
 * @author dk
 * @date 2016/11/11
 *
 * CountDownLatch类有3个基本元素：
 * 初始值决定CountDownLatch类需要等待的事件的数量。
 * await() 方法, 被等待全部事件终结的线程调用。
 * countDown() 方法，事件在结束执行后调用。
 *
 * CountDownLatch等待的是事件
 * CyclicBarrier等待的是其他线程
 */
public class CountDownLatchTest {
    final static SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(4);
        Worker worker1 = new Worker("zhangSan",100,latch);
        Worker worker2 = new Worker("liSi",200,latch);
        Worker worker3 = new Worker("wangWu",300,latch);
        //3个线程只能减3，而latch的count是4，最后永远不到0，所以后面的输出不能进行
        worker1.start();
        worker2.start();
        worker3.start();
//        worker1.countDown();测试不通过启动线程来countDown也是可以的
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
        void countDown(){
            latch.countDown();//工人完成工作，计数器减一
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
