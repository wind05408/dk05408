package com.design.strategy.demo3;

/**
 * Duck
 *
 * @author dk
 * @date 2016/11/21
 */
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    public Duck(){

    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    abstract void display();

    //将飞行行为委托给飞行行为类处理
    public void performFly() {
        flyBehavior.fly();
    }
    //将呱呱叫行为委托给呱呱叫行为类处理
    public void performQuack() {
        quackBehavior.quack();
    }

    //所有鸭子都会浮水
    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }
}
