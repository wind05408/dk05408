package com.data.annotation;

import java.lang.annotation.*;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Validate {

    public ValidateTypeKind type();

    public String name();

    public boolean required() default false;

    public int maxLength() default 0;

}