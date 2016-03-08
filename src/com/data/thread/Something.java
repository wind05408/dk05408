package com.data.thread;

/**
 * @author dk
 * @date 2016/1/18
 */
public class Something {
    private Something(){}
    private static class LazyHolder{
        private static final Something INSTANCE  = new Something();
    }
    public static Something getInstance(){
        return LazyHolder.INSTANCE;
    }
}
