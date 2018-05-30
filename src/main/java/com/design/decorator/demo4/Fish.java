package com.design.decorator.demo4;

/**
 * Fish
 *
 * @author dk
 * @date 2016/12/7
 */
public class Fish extends Change {

    public Fish(TheGreatestSage sage) {
        super(sage);
    }

    @Override
    public void move() {
        // 代码
        System.out.println("Fish Move");
    }
}
