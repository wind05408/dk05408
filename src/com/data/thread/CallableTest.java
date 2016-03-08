package com.data.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author dk
 * @date 2016/3/7
 */
public class CallableTest {
    public static void main(String[] args) {
        Callable<Integer> myCallable = new MyCallable();
        FutureTask<Integer> ft = new FutureTask<Integer>(myCallable);

        for (int i= 0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+"*"+i);
            if(i==30){
                Thread thread = new Thread(ft);
                thread.start();
            }
        }
        System.out.println("���߳�forѭ��ִ�����..");

        try {
            int sum = ft.get();
            System.out.println("sum="+sum);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}

class MyCallable implements Callable<Integer>{
    private int i = 0;
    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (;i<100;i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
            sum+=i;
        }
        return sum;
    }
}
