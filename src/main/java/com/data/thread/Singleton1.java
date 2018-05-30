package com.data.thread;

/**
 * @author dk
 * @date 2016/1/18
 */
public class Singleton1 {
    private Singleton1(){}
    private static final Singleton1 instance = new Singleton1();
    public static Singleton1 getInstance(){
        return instance;
    }
}

class Singleton2{
    private Singleton2(){}
    private static Singleton2 instance = null;
    public static synchronized Singleton2 getInstance(){
        if(instance == null){
            instance = new Singleton2();
        }
        return instance;
    }
}

class Singleton3{
    private Singleton3(){}
    private volatile static Singleton3 instance = null;
    public static Singleton3 getInstance(){
        if(instance == null){
            synchronized (Singleton3.class){
                if(instance == null){
                    instance = new Singleton3();
                }
            }
        }
        return instance;
    }
}

class Singleton4{
    private Singleton4(){}
    private static class LazyHolder{
        final static Singleton4  INSTANCE  = new Singleton4();
    }
    public static Singleton4 getInstance(){
       return LazyHolder.INSTANCE;
    }
}
