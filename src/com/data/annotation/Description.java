package com.data.annotation;

import java.lang.annotation.*;

/**
 * Created by Administrator on 2016/6/22.
 */

/**
 * Annotation其实是一种接口。通过Java的反射机制相关的API来访问annotation信息
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface Description {
    String value() default "gg";
}
