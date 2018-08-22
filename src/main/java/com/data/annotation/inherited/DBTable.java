package com.data.annotation.inherited;

import java.lang.annotation.*;

/**
 * Created by Administrator on 2016/6/23.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface DBTable {
    String name() default "";
}