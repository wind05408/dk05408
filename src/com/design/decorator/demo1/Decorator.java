package com.design.decorator.demo1;

/**
 * Decorator
 *
 * @author dk
 * @date 2016/12/6
 */
public class Decorator extends Drink {
    private  Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public float cost() {
        return super.getPrice()+drink.cost();
    }

    @Override
    public String getDescription() {
        return super.getDescription()+"-"+super.getPrice()+"&&"+drink.getDescription();
    }
}
