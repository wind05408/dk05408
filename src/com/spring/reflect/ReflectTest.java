package com.spring.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * ReflectTest
 *
 * @author dk
 * @date 2016/8/12
 */
public class ReflectTest {
    public static ReflectVO initByDefaultConst() throws Throwable{
        ClassLoader loader = Thread.currentThread().getContextClassLoader();//AppClassLoader
        Class clazz = loader.loadClass("com.spring.reflect.ReflectVO");

        Constructor cons = clazz.getDeclaredConstructor((Class[])null);
        ReflectVO vo = (ReflectVO) cons.newInstance();

        Method setBrand = clazz.getMethod("setBrand",String.class);
        setBrand.invoke(vo,"红旗CA72");
        Method setColor = clazz.getMethod("setColor",String.class);
        setColor.invoke(vo,"黑色");
        Method setMaxSpeed = clazz.getMethod("setMaxSpeed",int.class);
        setMaxSpeed.invoke(vo,200);
        return vo;
    }

    public static void main(String[] args) throws Throwable {
        ReflectVO vo = initByDefaultConst();
        vo.introduce();
    }
}
