package com.design.decorator.demo1;

/**
 * Chocolate
 *
 * @author dk
 * @date 2016/12/6
 */
public class Chocolate extends Decorator {

    public Chocolate(Drink drink) {
        super(drink);
        super.setDescription("Chocolate");
        super.setPrice(1.0f);
    }
}
