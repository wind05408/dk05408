package com.design.adapter.demo1;

/**
 * Created by dk05408 on 2016/12/19.
 */
public class Adapter implements Target {
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void sampleOperation1() {
     this.adaptee.sampleOperation1();
    }

    @Override
    public void sampleOperation2() {
        System.out.println("Adapter sampleOperation2");
        //this.adaptee.sampleOperation2();
    }
}
