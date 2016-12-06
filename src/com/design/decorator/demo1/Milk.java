package com.design.decorator.demo1;

/**
 * Milk
 *
 * @author dk
 * @date 2016/12/6
 */
public class Milk extends Decorator {
    public Milk(Drink drink) {
        super(drink);
        super.setDescription("Milk");
        super.setPrice(2.5f);
    }
}
