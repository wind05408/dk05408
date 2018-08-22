package com.data.annotation;

import java.lang.annotation.*;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Validate {

    ValidateTypeKind type();

    String name();

    boolean required() default false;

    int maxLength() default 0;

}