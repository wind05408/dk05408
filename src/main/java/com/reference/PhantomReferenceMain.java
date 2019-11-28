package com.reference;

import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description: TODO
 * @Author dk05408
 * @Date 2019/11/28
 **/

/**
 * 虚引用，一种较为特殊的引用，该引用不能拿来存值，当你创建了虚引用以后，
 * 你不能通过get方法来获取值，相当于没有引用，这个引用主要可以拿来作为监控使用，
 * 因为当垃圾回收器确定回收对象的时候，会把引用放入到ReferenceQueue中，可以通过poll queue获取当前要被回收的引用对象
 */
public class PhantomReferenceMain {
    public static void main(String[] args) {
        final ReferenceQueue queue = new ReferenceQueue();

        final PhantomReference<Integer> phantomRef = new PhantomReference<>(128,queue);

        //start一个线程进行监控
        new Thread(new Runnable() {
            @Override
            public void run() {
                while(true) {
                    Reference ref = queue.poll();
                    if(ref!=null){
                        System.out.println("--- 虚引用对象被jvm回收了 ----");
                        System.exit(1);
                    }
                }
            }
        }).start();

        //初始化一个list，不停的添加数据，出发jvm gc
        final List list = new ArrayList();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    list.add(new byte[1024 * 50]);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("phantomRef的referent："+phantomRef.get());
                }
            }
        }).start();
    }
}
