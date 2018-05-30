package com.design.decorator.demo3;

/**
 * ComponentClient
 *
 * @author dk
 * @date 2016/12/7
 */
public class ComponentClient {
    public static void main(String[] args) {

        Component component = new ConcreteComponent();
        component.sampleOperation();
        System.out.println("***************************************");

        component = new ConcreteDecoratorA(component);
        component.sampleOperation();
        System.out.println("***************************************");

        component = new ConcreteDecoratorB(component);
        component.sampleOperation();
    }
}
