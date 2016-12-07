package com.design.decorator.demo3;

/**
 * ConcreteComponent
 *
 * @author dk
 * @date 2016/12/7
 */
public class ConcreteComponent implements Component {
    @Override
    public void sampleOperation() {
        System.out.println("this is ConcreteComponent");
    }
}
