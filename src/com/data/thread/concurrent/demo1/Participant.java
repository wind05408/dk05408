package com.data.thread.concurrent.demo1;

import java.util.concurrent.TimeUnit;

/**
 * Participant
 *
 * @author dk
 * @date 2016/11/11
 */
public class Participant implements Runnable {
    private Videoconference videoconference;
    private String name;

    public Participant(Videoconference videoconference, String name) {
        this.videoconference = videoconference;
        this.name = name;
    }

    @Override
    public void run() {
        long duration = (long) (Math.random()*10);
        try {
            TimeUnit.SECONDS.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        videoconference.arrive(name);

    }
}
