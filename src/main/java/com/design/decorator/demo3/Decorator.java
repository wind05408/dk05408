package com.design.decorator.demo3;

/**
 * Decorator
 *
 * @author dk
 * @date 2016/12/7
 */
public class Decorator implements Component {

    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void sampleOperation() {
        component.sampleOperation();
    }
}
