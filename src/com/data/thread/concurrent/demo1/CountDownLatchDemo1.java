package com.data.thread.concurrent.demo1;

/**
 * CountDownLatchDemo1
 *
 * @author dk
 * @date 2016/11/11
 */
public class CountDownLatchDemo1 {
    public static void main(String[] args) {
        Videoconference videoconference = new Videoconference(11);
        Thread thread = new Thread(videoconference);
        thread.start();
        for (int i = 0; i < 10 ; i++) {
//         Participant p = new Participant(videoconference,"ParticipantName-"+i);
//            Thread t = new Thread(p);
//            t.start();
            videoconference.arrive(i+"");
        }
        videoconference.arrive("1234");
    }
}
