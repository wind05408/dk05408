package com.design.singleton.demo1;


/**
 * Singleton1
 *
 * @author dk
 * @date 2016/12/8
 */
public class Singleton {
    private static Singleton instance = null;

    private Singleton() {
    }

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
