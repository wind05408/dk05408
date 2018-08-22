package com.data.thread;

import java.io.IOException;

public class Demo {


    final int x;

    public Demo(T1 t1) {
        t1.demo = this;// ��this�ڹ����ڼ���ݳ��������ݳ��Ķ�����Ϊ�ǡ�û����ȷ������(not properly constructed)��
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

    public static void main(String[] args) {
//        T1 t1 = new T1();
//        t1.start();
//        new Demo(t1);
        String[] a = {"1","2","3"};
        for (int i = 0; i <a.length ; i++) {
          a[i] = a[i]+"P";
        }
        System.out.println(a[0]);
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