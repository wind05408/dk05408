package com.design.template.demo1;

/**
 * AbstractTemplate
 *
 * @author dk
 * @date 2016/11/24
 */
public abstract class AbstractTemplate {
    public void templateMethod(){
        abstractMethod();
        hoodMethod();
        concreteMethod();
    }

    protected abstract void abstractMethod();

    protected void hoodMethod(){}

    private final void concreteMethod(){}
}
