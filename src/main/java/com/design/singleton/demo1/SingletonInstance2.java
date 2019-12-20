package com.design.singleton.demo1;

/**
 * @Description: TODO
 * @Author dk05408
 * @Date 2019/12/20
 **/
public class SingletonInstance2 {

    private static class SingletonInstaceHolder{
        public static SingletonInstance2 instance = new SingletonInstance2();
    }

    public SingletonInstance2 getInstance(){
        return SingletonInstaceHolder.instance;
    }
}
