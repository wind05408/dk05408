package com.design.observer.demo1;

/**
 * ConcreteObject
 *
 * @author dk
 * @date 2016/11/29
 */
public class ConcreteObject implements Observer {
    //观察者的状态
    private String observerState;
    @Override
    public void update(String state) {
        /**
         * 更新观察者的状态，使其与目标的状态保持一致
         */
        this.observerState = state;
        System.out.println("状态为："+observerState);
    }
}
