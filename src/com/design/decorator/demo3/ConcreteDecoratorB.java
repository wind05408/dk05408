package com.design.decorator.demo3;

/**
 * ConcreteDecoratorB
 *
 * @author dk
 * @date 2016/12/7
 */
public class ConcreteDecoratorB extends Decorator {

    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    public void sampleOperation() {
        super.sampleOperation();
        System.out.println("ConcreteDecoratorB sampleOperation");
    }
}
