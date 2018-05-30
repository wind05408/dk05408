package com.data.thread.blockqueue;

import java.util.concurrent.LinkedBlockingQueue;

/**
 * BlockingQueueTest
 *
 * @author dk
 * @date 2016/11/10
 */
public class BlockingQueueTest {

    public static void main(String[] args) {
        testAdd();
        testOffer();
        testPut();

    }
    public static void testAdd(){
        try {
            LinkedBlockingQueue queue = new LinkedBlockingQueue(2);
            queue.add("1");
            queue.add("2");
            queue.add("3");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void testOffer(){
        try {
            LinkedBlockingQueue queue = new LinkedBlockingQueue(2);
            System.out.println(queue.offer("1"));
            System.out.println(queue.offer("2"));
            System.out.println(queue.offer("3"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void testPut(){
        try {
            LinkedBlockingQueue queue = new LinkedBlockingQueue(2);
            queue.put("1");
            queue.put("2");
            System.out.println("yes1");
            queue.take();
            queue.put("3");
            System.out.println("yes2");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
