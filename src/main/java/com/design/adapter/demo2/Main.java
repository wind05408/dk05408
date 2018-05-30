package com.design.adapter.demo2;

/**
 * Created by dk05408 on 2016/12/19.
 */
public class Main {
    public static void main(String[] args) {
        Target adapter =new Adapter();
        adapter.sampleOperation1();
        adapter.sampleOperation2();
    }
}
