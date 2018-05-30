package com.data.annotation;

import java.lang.annotation.*;

/**
 * Created by Administrator on 2016/6/22.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface Author {
    String name();
    String group();
}
