package com.design.singleton.demo1;

/**
 * ConcurrentSingleton2
 *
 * @author dk
 * @date 2016/12/8
 */
public class ConcurrentSingleton2 {

    private static ConcurrentSingleton2 instance = new ConcurrentSingleton2();

    private ConcurrentSingleton2() {
    }

    public static  ConcurrentSingleton2 getInstance(){
        if(instance == null){
            instance = new ConcurrentSingleton2();
        }
        return instance;
    }
}
