package com.design.adapter.demo2;

/**
 * Created by dk05408 on 2016/12/19.
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void sampleOperation2() {
        System.out.println("Adapter sampleOperation2");
    }
}
