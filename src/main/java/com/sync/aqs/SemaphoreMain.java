package com.sync.aqs;

import java.util.concurrent.Semaphore;

/**
 * @Description: TODO
 * @Author dk05408
 * @Date 2019/12/27
 **/
public class SemaphoreMain {

    static class Parking{
        private Semaphore semaphore;

        public Parking(int count) {
            this.semaphore = new Semaphore(count);
        }

        public void park(){
            try {
                semaphore.acquire();
                long time = (long) (Math.random() * 10);
                System.out.println(Thread.currentThread().getName() + "进入停车场，停车" + time + "秒..." );
                Thread.sleep(time);
                System.out.println(Thread.currentThread().getName() + "开出停车场...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                semaphore.release();
            }
        }
    }

    static class Car extends Thread {
        Parking parking ;

        Car(Parking parking){
            this.parking = parking;
        }

        @Override
        public void run() {
            parking.park();     //进入停车场
        }
    }


    public static void main(String[] args){
        Parking parking = new Parking(5);

        for(int i = 0 ; i < 17 ; i++){
            new Car(parking).start();
        }
    }
}
