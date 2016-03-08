package com.data.thread;

import java.io.IOException;

public class Demo {


    final int x;

    public Demo(T1 t1) {
        t1.demo = this;// 将this在构造期间就逸出，这样逸出的对象被认为是“没有正确构建的(not properly constructed)”
        try {
            Thread.sleep(100000000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        x = 9;
    }

    public void print() {
        System.out.println(this.x);
    }

    public static void main(String[] args) throws IOException, InterruptedException, ClassNotFoundException {
        T1 t1 = new T1();
        t1.start();
        new Demo(t1);
    }

    static class T1 extends Thread {
        public Demo demo;

        public void run() {
            while (true) {
                if (demo != null) {
                    demo.print();
                }
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}