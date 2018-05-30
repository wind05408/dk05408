package com.design.decorator.demo1;

/**
 * Soy
 *
 * @author dk
 * @date 2016/12/6
 */
public class Soy extends Decorator {
    public Soy(Drink drink) {
        super(drink);
        super.setDescription("Soy");
        super.setPrice(2.2f);
    }
}
