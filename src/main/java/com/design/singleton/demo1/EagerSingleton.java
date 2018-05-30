package com.design.singleton.demo1;

/**
 * EagerSingleton
 *
 * @author dk
 * @date 2016/12/8
 * 饿汉式单例类
 */
public class EagerSingleton {
    private static EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance(){
        return instance;
    }
}
