package com.data.thread;

import java.io.IOException;

/**
 * @author dk
 * @date 2016/1/25
 */
public class EscapeDemo {

    public EscapeDemo(T1 t1) {
        t1.demo = this;// ��this�ڹ����ڼ���ݳ��������ݳ��Ķ�����Ϊ�ǡ�û����ȷ������(not properly constructed)��
        try {
            Thread.sleep(100000000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void print() {
        System.out.println("demo's method");
    }

    public static void main(String[] args) {
        T1 t1 = new T1();
        t1.start();
        new EscapeDemo(t1);
    }

    static class T1 extends Thread {
        public EscapeDemo demo;

        public void run() {
            while (true) {
                if (demo != null) {// ��ʵ֤������ʹDemo�Ĺ��췽��δִ���꣬this��ֵ��T1.demo�󣬲�Ϊnull
                    demo.print();// ���ܹ�����ʹ��demo��ʵ����������������demo�Ĺ��췽��δִ��������ʲô���ȶ���Ӱ�죬Ӧ����ָ������δ����Ԥ�ڵ�ȥ��ʼ��һЩ���ݡ�
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

