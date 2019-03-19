package com.proxy.javassist;

import javassist.util.proxy.MethodHandler;
import javassist.util.proxy.ProxyFactory;

import java.lang.reflect.Method;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: dk05408
 * @date: 2019/3/19 17:57
 * Description:${TODO}
 */
public class JavassistProxyFactory02 {

    public Object getProxy(Class clazz) throws IllegalAccessException, InstantiationException {
        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.setSuperclass(clazz);
        proxyFactory.setHandler(new MethodHandler() {
            @Override
            public Object invoke(Object self, Method thisMethod, Method proceed, Object[] args) throws Throwable {
                System.out.println("--------------------------------");
                System.out.println(self.getClass());
                //class com.javassist.demo.A_$$_javassist_0
                System.out.println("要调用的方法名："+thisMethod.getName());
                System.out.println(proceed.getName());
                System.out.println("开启事务-------");

                Object result = proceed.invoke(self, args);
                //下面的代码效果与上面的相同
                //不过需要传入一个目标对象
                //Object result = thismethod.invoke(target,args);

                System.out.println("提交事务-------");
                return result;
            }
        });
        // 通过字节码技术动态创建子类实例
        return proxyFactory.createClass().newInstance();
    }
}
