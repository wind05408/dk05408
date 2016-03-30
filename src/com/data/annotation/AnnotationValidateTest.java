package com.data.annotation;

/**
 * @author dk
 * @date 2016/3/30
 * 输入参数注解验证
 */
public class AnnotationValidateTest {
    public static void main(String[] args) {
        ValidateTest test = new ValidateTest();//继承IRequest
        test.setName("123456489");
        test.setAmount("fdf");
        System.out.println(ValidateTools.validate(test));

    }
}
