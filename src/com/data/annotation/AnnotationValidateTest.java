package com.data.annotation;

/**
 * @author dk
 * @date 2016/3/30
 * �������ע����֤
 */
public class AnnotationValidateTest {
    public static void main(String[] args) {
        ValidateTest test = new ValidateTest();//�̳�IRequest
        test.setName("123456489");
        test.setAmount("fdf");
        System.out.println(ValidateTools.validate(test));

    }
}
