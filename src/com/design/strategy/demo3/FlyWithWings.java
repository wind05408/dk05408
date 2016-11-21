package com.design.strategy.demo3;

/**
 * FlyWithWings
 *
 * @author dk
 * @date 2016/11/21
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying!!");
    }
}
