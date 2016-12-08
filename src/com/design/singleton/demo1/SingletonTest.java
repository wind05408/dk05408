package com.design.singleton.demo1;

/**
 * SingletonTest
 *
 * @author dk
 * @date 2016/12/8
 */
public class SingletonTest {
    public static void main(String[] args) {
        SingletonDemo instance =SingletonDemo.instance;
        instance.singletonOperation();
    }
}
