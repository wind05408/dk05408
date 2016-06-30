package com.data.annotation.fruit;


import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author dk
 * @date 2016/6/23
 */
public class FruitInfoUtil {

    public static void getFruitInfo(Class<?> clazz){
        String strFruitName="水果名称：";
        String strFruitColor="水果颜色：";
        String strFruitProvider="供应商信息：";

        Field[] fields = clazz.getDeclaredFields();

        for (Field field:fields){
            if(field.isAnnotationPresent(FruitName.class)){
                FruitName fruitName = field.getAnnotation(FruitName.class);
                strFruitName = strFruitName+fruitName.value();
                System.out.println(strFruitName);
            }

            if(field.isAnnotationPresent(FruitColor.class)){
                FruitColor color = field.getAnnotation(FruitColor.class);
                strFruitColor = strFruitColor+color.fruitColor().toString();
                System.out.println(strFruitColor);
            }

            if(field.isAnnotationPresent(FruitProvider.class)){
                FruitProvider fruitProvider = field.getAnnotation(FruitProvider.class);
                strFruitProvider=strFruitProvider+" 供应商编号："+fruitProvider.id()+" 供应商名称："+fruitProvider.name()+" 供应商地址："+fruitProvider.address();
                System.out.println(strFruitProvider);
            }

        }


    }

}
