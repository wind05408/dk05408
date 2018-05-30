package com.data.thread;

/**
 * @author dk
 * @date 2016/3/7
 */
public class DaemonTest {
//    public static void main(String[] args) {
//        Thread myThread = new MyThread();
//        for (int i =0;i<100;i++){
//            System.out.println( "main thread i = " + i);
//            //Daemon
////            if (i == 20) {
////                myThread.setDaemon(true);
////                myThread.start();
////            }
//            if(i==20){
//                myThread.setPriority(Thread.MAX_PRIORITY);
//                myThread.start();
//            }
//        }

    public static void main(String[] args) {
        Thread myThread1 = new MyThread();
        Thread myThread2 = new MyThread2();
        myThread1.setPriority(Thread.MAX_PRIORITY);
        myThread2.setPriority(Thread.MAX_PRIORITY);

        for (int i = 0; i < 100; i++) {
            System.out.println("main thread i = " + i);
            if (i == 20) {
                myThread1.start();
                //myThread2.start();
                Thread.yield();
            }
        }

    }
}
class MyThread extends Thread {

    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("MyThread1 i = " + i);
//            try {
//                Thread.sleep(1);
//            } catch (InterruptedException e) {
//                // TODO Auto-generated catch block
//                e.printStackTrace();
//            }
        }
    }
}

class MyThread2 extends Thread {

    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("MyThread2 i = " + i);
//            try {
//                Thread.sleep(1);
//            } catch (InterruptedException e) {
//                // TODO Auto-generated catch block
//                e.printStackTrace();
//            }
        }
    }
}
