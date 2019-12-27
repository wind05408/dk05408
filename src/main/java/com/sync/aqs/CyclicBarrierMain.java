package com.sync.aqs;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @Description: TODO
 * @Author dk05408
 * @Date 2019/12/27
 **/
public class CyclicBarrierMain {
    private static CyclicBarrier cyclicBarrier;

    static class CyclicBarrierThread extends Thread{
        @Override
        public void run(){
            System.out.println(Thread.currentThread().getName() + "到了");
            try {
                cyclicBarrier.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        cyclicBarrier = new CyclicBarrier(5, new Runnable() {
            @Override
            public void run() {
                System.out.println("人到齐了，开会吧....");
            }
        });

        for(int i = 0 ; i < 5 ; i++){
            new CyclicBarrierThread().start();
        }
    }

}
