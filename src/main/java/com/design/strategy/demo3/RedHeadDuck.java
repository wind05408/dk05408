package com.design.strategy.demo3;

/**
 * RedHeadDuck
 *
 * @author dk
 * @date 2016/11/21
 */
public class RedHeadDuck extends Duck {
    public RedHeadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    void display() {
        System.out.println("I'm a real Red Headed duck");
    }
}
