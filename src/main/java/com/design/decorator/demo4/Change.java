package com.design.decorator.demo4;

/**
 * Change
 *
 * @author dk
 * @date 2016/12/7
 */
public class Change implements TheGreatestSage {
    private TheGreatestSage sage;

    public Change(TheGreatestSage sage) {
        this.sage = sage;
    }

    @Override
    public void move() {
        // 代码
        sage.move();
    }
}
