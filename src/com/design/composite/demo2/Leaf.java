package com.design.composite.demo2;

/**
 * Created by dk05408 on 2016/12/28.
 */
public class Leaf implements Component {

    /**
     * 叶子对象的名字
     */
    private String name;
    /**
     * 构造方法，传入叶子对象的名称
     * @param name 叶子对象的名字
     */
    public Leaf(String name){
        this.name = name;
    }

    @Override
    public void printStruct(String component) {
        System.out.println(component + "-" + name);
    }
}
