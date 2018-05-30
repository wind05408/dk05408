package com.spring.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * SubjectClient
 *
 * @author dk
 * @date 2016/8/31
 */
public class SubjectClient {

    public static void main(String[] args) {
        //静态代理
        Subject staticProxy = new ProxySubject(new RealSubject());
        staticProxy.dealTask("staticProxyTask");
        System.out.println();

        //动态代理
        Subject subject = new RealSubject();
        InvocationHandler handler = new SubjectInvocationHandler(subject);
        Subject dynProxy = (Subject) Proxy.newProxyInstance(subject.getClass().getClassLoader(),subject.getClass().getInterfaces(),handler);
        dynProxy.dealTask("dynProxyTask");
        System.out.println();
        //CglibProxy
        RealSubject realSubject = (RealSubject) new SubjectMethodInterceptor().createProxyObject(new RealSubject());
        realSubject.dealTask("CglibProxyTask");


    }

}
