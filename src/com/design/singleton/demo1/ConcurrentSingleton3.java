package com.design.singleton.demo1;

/**
 * ConcurrentSingleton3
 *
 * @author dk
 * @date 2016/12/8
 */
public class ConcurrentSingleton3 {

    private static volatile ConcurrentSingleton3 instance = null;

    private ConcurrentSingleton3() {
    }

    public static ConcurrentSingleton3 getInstance(){
        if(instance == null){
            synchronized (ConcurrentSingleton3.class){
                if (instance == null){
                    instance = new ConcurrentSingleton3();
                }
            }
        }
        return instance;
    }
}
