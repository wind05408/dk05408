package com.data.annotation.fruit;

import java.lang.annotation.*;

/**
 * Created by Administrator on 2016/6/23.
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitName {
    String value() default "";
}
