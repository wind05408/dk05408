package com.data.annotation.fruit;

import java.lang.annotation.*;

/**
 * Created by Administrator on 2016/6/23.
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitProvider {
    /**
     * 供应商编号
     * @return
     */
    int id() default -1;

    /**
     * 供应商名称
     * @return
     */
    String name() default "";

    /**
     * 供应商地址
     * @return
     */
    String address() default "";
}
