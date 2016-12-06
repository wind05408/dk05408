package com.design.decorator.demo1;

/**
 * Coffee
 *
 * @author dk
 * @date 2016/12/6
 */
public class Coffee extends Drink {

    @Override
    public float cost() {
        return super.getPrice();
    }

}
