package com.design.decorator.demo3;

/**
 * ConcreteDecoratorA
 *
 * @author dk
 * @date 2016/12/7
 */
public class ConcreteDecoratorA extends Decorator {

    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void sampleOperation() {
        super.sampleOperation();
        System.out.println("ConcreteDecoratorA sampleOperation");
    }
}
