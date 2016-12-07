package com.design.decorator.demo4;

/**
 * Bird
 *
 * @author dk
 * @date 2016/12/7
 */
public class Bird extends Change {

    public Bird(TheGreatestSage sage) {
        super(sage);
    }

    @Override
    public void move() {
        // 代码
        System.out.println("Bird Move");
    }

}
