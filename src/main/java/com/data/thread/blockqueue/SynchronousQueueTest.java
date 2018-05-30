package com.data.thread.blockqueue;

import java.util.Random;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

/**
 * SynchronousQueueTest
 *
 * @author dk
 * @date 2016/11/10
 */
public class SynchronousQueueTest {
    public static void main(String[] args) {
//            final SynchronousQueue<Integer> queue = new SynchronousQueue<Integer>();
//            new Thread(new Runnable(){
//                @Override
//                public void run() {
//                    try {
//                        System.out.println("等待数据传入...");
//                        System.out.println("##获取的数据为:"+queue.take());
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }}
//            ).start();
//            try {
//                TimeUnit.SECONDS.sleep(3);//三秒之后传入数据
//                System.out.println("准备传入数据.."+queue.offer(new Random().nextInt(1000)));
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }

        final SynchronousQueue queue = new SynchronousQueue();


        new Thread() {
            @Override
            public void run() {
                try {
                    while (true) {
                        System.out.println("size1:" + queue.size());
                        System.out.println("element:" + queue.take());
                        System.out.println("size2:" + queue.size());


                    }
                } catch (InterruptedException e) {

                e.printStackTrace();
                }
            }
        }.start();


        try {
            queue.put(1);
            queue.put(2);
            queue.put(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

//        SynchronousQueue<Integer> queue = new SynchronousQueue<Integer>();
//        new Customer(queue).start();
//        new Product(queue).start();
    }
    static class Product extends Thread{
        SynchronousQueue<Integer> queue;

        public Product(SynchronousQueue<Integer> queue) {
            this.queue = queue;
        }

        @Override
        public void run() {
            while (true){
             int rand = new Random().nextInt(1000);
                System.out.println("生产了一个产品："+rand);
                System.out.println("等待三秒后运送出去...");
                try {
                    TimeUnit.SECONDS.sleep(3);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                queue.offer(rand);
            }
        }
    }

    static class Customer extends Thread{
        SynchronousQueue<Integer> queue;

        public Customer(SynchronousQueue<Integer> queue) {
            this.queue = queue;
        }

        @Override
        public void run() {
            while (true){
                try {
                    System.out.println("消费了一个产品:"+queue.take());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("------------------------------------------");
            }
        }
    }
}
