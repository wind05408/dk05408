package com.design.adapter.demo1;

/**
 * Created by dk05408 on 2016/12/19.
 */
public class Main {
    public static void main(String[] args) {
     Adaptee adaptee = new Adaptee();
     adaptee.sampleOperation1();

     Target target = new Adapter(adaptee);
     target.sampleOperation1();
     target.sampleOperation2();
    }
}
