package com.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

interface IHello {
    void say(String s);
}

// 待加强的目标类
class RealHello implements IHello {

    @Override
    public void say(String s) {
        System.out.println("hello " + s);
    }

}

// 增强器
class HelloProxy implements InvocationHandler {

    private IHello target;  // 原始对象

    public HelloProxy(IHello target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before print");
        method.invoke(target, args);  // 调用原始对象的方法
        System.out.println("after print");
        return null;
    }

}

public class JdkProxyMain {

    public static void main(String[] args) {
        IHello hello = enhanceHello(new RealHello());  //增强原始方法
        hello.say("world");
    }

    public static IHello enhanceHello(IHello target) {
        return (IHello) Proxy.newProxyInstance(JdkProxyMain.class.getClassLoader(), new Class<?>[]{IHello.class},
                new HelloProxy(target));
    }

}