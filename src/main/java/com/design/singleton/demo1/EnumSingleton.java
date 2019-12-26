package com.design.singleton.demo1;

/**
 * @Description: TODO
 * @Author dk05408
 * @Date 2019/12/26
 **/
public class EnumSingleton {
    public static EnumSingleton getInstance(){
        return Singleton.INSTANCE.getInstance();
    }

    private enum Singleton{
        INSTANCE;
        private EnumSingleton singleton;
        //JVM会保证此方法绝对只调用一次
        private Singleton(){
            singleton = new EnumSingleton();
        }
        public EnumSingleton getInstance(){
            return singleton;
        }
    }
}
