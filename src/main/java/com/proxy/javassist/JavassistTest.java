package com.proxy.javassist;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: dk05408
 * @date: 2019/3/19 18:02
 * Description:${TODO}
 */
public class JavassistTest {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        System.out.println("*******************方式一*******************");
        JavassistProxyFactory<JavassistProxyFunction> jpf = new JavassistProxyFactory<JavassistProxyFunction>();
        JavassistProxyFunction function = new JavassistProxyFunction();
        jpf.setTarget(function);
        JavassistProxyFunction proxy = jpf.getProxy();
        proxy.del();
        proxy.save();
        System.out.println("");
        System.out.println("*******************方式二*******************");
        JavassistProxyFactory02 jpf02 = new JavassistProxyFactory02();
        JavassistProxyFunction function2 = (JavassistProxyFunction) jpf02.getProxy(JavassistProxyFunction.class);
        function2.del();
        function2.save();
    }
}
