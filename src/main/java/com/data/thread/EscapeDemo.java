package com.data.thread;

import java.io.IOException;

/**
 * @author dk
 * @date 2016/1/25
 */
public class EscapeDemo {

    public EscapeDemo(T1 t1) {
        t1.demo = this;// 将this在构造期间就逸出，这样逸出的对象被认为是“没有正确构建的(not properly constructed)”
        try {
            Thread.sleep(100000000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void print() {
        System.out.println("demo's method");
    }

    public static void main(String[] args) throws IOException, InterruptedException, ClassNotFoundException {
        T1 t1 = new T1();
        t1.start();
        new EscapeDemo(t1);
    }

    static class T1 extends Thread {
        public EscapeDemo demo;

        public void run() {
            while (true) {
                if (demo != null) {// 事实证明，即使Demo的构造方法未执行完，this赋值给T1.demo后，不为null
                    demo.print();// 且能够正常使用demo的实例方法。至于由于demo的构造方法未执行完会带来什么不稳定的影响，应该是指它可能未按照预期的去初始化一些数据。
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

