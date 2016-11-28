package com.design.template.demo3;

/**
 * Coffee
 *
 * @author dk
 * @date 2016/11/28
 */
public class Coffee extends HotDrink {

    @Override
    protected void brew() {
        System.out.println("brew coffee");
    }

    @Override
    public void addCondiments() {
        System.out.println("addCondiments sugar and milk");
    }
}
