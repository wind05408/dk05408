package com.design.decorator.demo1;

/**
 * CoffeeBar
 *
 * @author dk
 * @date 2016/12/6
 */
public class CoffeeBar {
    public static void main(String[] args) {
        Drink order;
        order = new Decaf();
        System.out.println("order1 price:"+order.cost());
        System.out.println("order1 desc:"+order.getDescription());

        System.out.println("********************************************");

        order = new LongBlcak();
        order = new Milk(order);
        order = new Chocolate(order);
        order = new Soy(order);

        System.out.println("order2 price:"+order.cost());
        System.out.println("order2 desc:"+order.getDescription());
    }
}
