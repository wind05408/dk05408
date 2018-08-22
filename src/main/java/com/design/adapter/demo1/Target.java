package com.design.adapter.demo1;

/**
 * Created by dk05408 on 2016/12/19.
 */
public interface Target {
    /**
     * 这是源类Adaptee也有的方法
     */
    void sampleOperation1();
    /**
     * 这是源类Adapteee没有的方法
     */
    void sampleOperation2();
}