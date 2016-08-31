package com.spring.aop;

import net.sf.cglib.core.ObjectSwitchCallback;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * SubjectMethodInterceptor
 *
 * @author dk
 * @date 2016/8/31
 */
public class SubjectMethodInterceptor implements MethodInterceptor {
    private Object targetObject;

    public Object createProxyObject(Object object)
    {
        this.targetObject = object;
        Enhancer enhancer = new Enhancer();
        enhancer.setCallback(this);
        enhancer.setSuperclass(object.getClass());
        Object proxyObject = enhancer.create();
        return proxyObject;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        return method.invoke(targetObject,objects);
    }
}
