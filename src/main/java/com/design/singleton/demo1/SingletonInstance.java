package com.design.singleton.demo1;

/**
 * @Description: TODO
 * @Author dk05408
 * @Date 2019/12/20
 **/
public class SingletonInstance {
    private volatile static  SingletonInstance instance = null;

    private SingletonInstance(){}

    public static SingletonInstance getInstance(){
        if(instance == null){
            synchronized (SingletonInstance.class){
                if(instance == null){
                    instance = new SingletonInstance();
                }
            }
        }
        return instance;
    }

}
