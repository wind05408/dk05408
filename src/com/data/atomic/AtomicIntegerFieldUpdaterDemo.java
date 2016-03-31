package com.data.atomic;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/**
 * @author dk
 * @date 2016/3/31
 */
public class AtomicIntegerFieldUpdaterDemo {

    AtomicIntegerFieldUpdater<DemoData> getUpdater(String fileName){
        return AtomicIntegerFieldUpdater.newUpdater(DemoData.class,fileName);
    }

    void doit(){
        DemoData demoData = new DemoData();
        System.out.println("1 ==>"+getUpdater("value1").getAndSet(demoData,10));
        System.out.println("1 ==>"+getUpdater("value1").get(demoData));
        System.out.println("3 ==>"+getUpdater("value2").incrementAndGet(demoData));
        System.out.println("2 ==>"+getUpdater("value3").decrementAndGet(demoData));
        System.out.println("true ==>"+getUpdater("value4").compareAndSet(demoData,4,5));
    }

    public static void main(String[] args) {
        AtomicIntegerFieldUpdaterDemo demo = new AtomicIntegerFieldUpdaterDemo();
        demo.doit();
    }

    class DemoData{
        public volatile int value1 = 1;
        volatile  int value2 = 2;
        //下面是不可见的 protected private
        protected volatile int value3 = 3;
        private volatile int value4 = 4;
    }
}
