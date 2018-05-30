package com.data.thread.concurrent.demo1;

import java.util.concurrent.CountDownLatch;

/**
 * Videoconference
 *
 * @author dk
 * @date 2016/11/11
 */
public class Videoconference implements Runnable {
    private final CountDownLatch latch;

    public Videoconference(int number) {
        latch = new CountDownLatch(number);
    }
    public void arrive(String name){
        System.out.println(name+" has arrived.");
        latch.countDown();
        System.out.println("VideoConference:Waiting for "+latch.getCount());
    }

    @Override
    public void run() {
        System.out.println("VideoConference:Initialization:"+latch.getCount());
        try {
            latch.await();
            System.out.println("VideoConference: All the participants have come");
            System.out.println("VideoConference: Let's start...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
