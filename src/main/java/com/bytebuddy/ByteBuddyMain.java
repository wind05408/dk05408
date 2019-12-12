package com.bytebuddy;

import net.bytebuddy.ByteBuddy;
import net.bytebuddy.dynamic.loading.ClassLoadingStrategy;
import net.bytebuddy.implementation.FixedValue;
import net.bytebuddy.implementation.MethodDelegation;
import net.bytebuddy.matcher.ElementMatchers;

import static net.bytebuddy.matcher.ElementMatchers.any;
import static net.bytebuddy.matcher.ElementMatchers.is;

/**
 * @Description: TODO
 * @Author dk05408
 * @Date 2019/12/11
 **/
public class ByteBuddyMain {

    public static void main(String[] args) {
//        ByteBuddy bb = new ByteBuddy();
//
//        Class<?> clz = bb
//                .subclass(TestObject.class)
//                .method(any()).intercept(MethodDelegation.to(Interceptor.class))
//                .make()
//                .load(Object.class.getClassLoader(), ClassLoadingStrategy.Default.WRAPPER)
//                .getLoaded();
//
//        try {
//            Object test = clz.newInstance();
//
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        }

        Class<?> dynamicType = new ByteBuddy()
                .subclass(Object.class)
                .method(ElementMatchers.named("toString"))
                .intercept(FixedValue.value("Hello World!"))
                .make()
                .load(ByteBuddyMain.class.getClass().getClassLoader())
                .getLoaded();

        try {
            System.out.println(dynamicType.newInstance());
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

       // dynamicType.newInstance().toString(), is("Hello World!");

    }
}
