package com.design.strategy.demo3;

/**
 * MiniDuckSimulator
 *
 * @author dk
 * @date 2016/11/21
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        Duck  rubberDuck = new RubberDuck();
        Duck   decoyDuck = new DecoyDuck();

        mallardDuck.performQuack();
        rubberDuck.performQuack();
        decoyDuck.performQuack();
        System.out.println("----------quack end--------");

        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        mallardDuck.setFlyBehavior(new FlyRocketPowered());
        mallardDuck.performFly();
    }
}
