package com.data.annotation.fruit;

import java.lang.annotation.*;

/**
 * Created by Administrator on 2016/6/23.
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitColor {
    enum Color{BULE,RED,WHITE,BLACK,GREEN}

    Color fruitColor() default Color.GREEN;
}
