package com.design.template.demo1;

/**
 * ConcreteTemplate
 *
 * @author dk
 * @date 2016/11/24
 */
public class ConcreteTemplate extends AbstractTemplate {

    @Override
    protected void abstractMethod() {
        System.out.println("ConcreteTemplate abstractMethod");
    }

    @Override
    protected void hoodMethod() {
        System.out.println("ConcreteTemplate hoodMethod");
    }
}
