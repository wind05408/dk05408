package com.design.singleton.demo1;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @Description: TODO
 * @Author dk05408
 * @Date 2019/12/26
 **/
public class SingletonInstance3 {

    private static final AtomicReference<SingletonInstance3> INSTANCE = new AtomicReference();

    private SingletonInstance3() {
    }

    public static SingletonInstance3 getInstance() {
        for (; ; ) {
            SingletonInstance3 singletonInstance3 = INSTANCE.get();
            if (singletonInstance3 != null) {
                return singletonInstance3;
            }
            singletonInstance3 = new SingletonInstance3();
            if (INSTANCE.compareAndSet(null, singletonInstance3)) {
                return singletonInstance3;
            }
        }
    }
}