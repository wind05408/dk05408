package com.spring.aop;

import net.sf.cglib.core.ObjectSwitchCallback;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * CglibProxy
 *
 * @author dk
 * @date 2016/8/30
 */
public class CglibProxy implements MethodInterceptor {
    private Enhancer enhancer = new Enhancer();
    public Object getProxy(Class clazz){
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        PerformanceMonitor.begin(o.getClass().getName()+"."+method. getName());//③-1
        Object result=methodProxy.invokeSuper(o, objects);// ③-2
        PerformanceMonitor.end();//③-1通过代理类调用父类中的方法
        return result;
    }
}
