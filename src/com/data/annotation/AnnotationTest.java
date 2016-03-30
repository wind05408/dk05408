package com.data.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;

/**
 * @author dk
 * @date 2016/3/30
 */
public class AnnotationTest {

    @UserAnnotation(age=20,gender = "F",id = 2014,name = "lisi")
    public Object obj;

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

//        Field field =AnnotationTest.class.getField("obj");
//
//        UserAnnotation ua = field.getAnnotation(UserAnnotation.class);
//
//        System.out.println(ua.age()+" "+ua.gender()+" "+ua.id()+" "+ua.name());
//
//        AnnotationTest at = new AnnotationTest();
//        //public User(int id, String name, int age, String gender) {
//        field.set(at,new User(ua.id(),ua.name(),ua.age(),ua.gender()));
//
//        Target t = ua.annotationType().getAnnotation(Target.class);
//        ElementType[] values = t.value();
//        for (ElementType value : values) {
//            System.out.println(value);
//        }

        ValidateTest test = new ValidateTest();
        test.setName("123456489");
        test.setAmount("fdf");
        Field[] fields =  ValidateTest.class.getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(Validate.class)) {//ø¥¡À
                Validate validateUtil = field.getAnnotation(Validate.class);
                if(validateUtil.required() == true){

                    ValidateTypeKind type = validateUtil.type();
                    if (ValidateTypeKind.Length == type) {
                        if (true == length(field.getName(), test, validateUtil.maxLength())) {
                            System.out.println(validateUtil.name());
                        }
                    }
                }
            }
        }
//        String name = (String) ValidateTest.class.getMethod("getName").invoke(test);
//        System.out.println(name);
//
//        System.out.println(getValue("name",test));
//        System.out.println(getValue("amount",test));


    }

    private static String getValue(String field, Object obj) {
        String result = null;
        String getMethodName = "get" + toFirstLetterUpperCase(field);
        try {
            result = (String) obj.getClass().getMethod(getMethodName).invoke(obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public static String toFirstLetterUpperCase(String str) {
        if (str == null || str.length() < 2) {
            return str;
        }
        String firstLetter = str.substring(0, 1).toUpperCase();
        return firstLetter + str.substring(1, str.length());
    }

    private static boolean length(String field, Object obj, int maxLength) {
        boolean result = false;
        String value = getValue(field, obj);

        if (value != null && value.length() > maxLength) {
            result = true;
        }

        return result;
    }




}
