package com.design.singleton.demo1;

/**
 * Created by dk05408 on 2016/12/8.
 */
public enum SingletonDemo {

    instance;

    /**
     * 单例可以有自己的操作
     */
    public void singletonOperation(){
        System.out.println("SingletonDemo instance");
    }
}
