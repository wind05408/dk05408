package com.design.facade.demo1;

/**
 * Created by dk05408 on 2016/12/26.
 */
public class Facade {
    public void mehtod(){
        ModuleA a = new ModuleA();
        a.methodA();
        ModuleB b = new ModuleB();
        b.methodB();
        ModuleC c = new ModuleC();
        c.methodC();
    }
}
