package com.design.singleton.demo1;

/**
 * ConcurrentSingleton1
 *
 * @author dk
 * @date 2016/12/8
 */
public class ConcurrentSingleton1 {
    private static ConcurrentSingleton1 instance = null;

    private ConcurrentSingleton1() {
    }

    public static synchronized ConcurrentSingleton1 getInstance(){
        if(instance == null){
            instance = new ConcurrentSingleton1();
        }
        return instance;
    }
}
