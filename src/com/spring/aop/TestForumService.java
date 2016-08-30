package com.spring.aop;

import java.lang.reflect.Proxy;

/**
 * TestForumService
 *
 * @author dk
 * @date 2016/8/30
 */
public class TestForumService {
    public static void main(String[] args) {
//        ForumService forumService = new ForumServiceImpl();
//        forumService .removeForum(10);
//        System.out.println("");
//        forumService .removeTopic(1012);


        //①希望被代理的目标业务类
        ForumService target = new ForumServiceImpl();

        //②将目标业务类和横切代码编织到一起
        PerformanceHandler handler = new PerformanceHandler(target);

        //③根据编织了目标业务类逻辑和性能监视横切逻辑的InvocationHandler实例创建代理实例
        ForumService proxy = (ForumService) Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                handler);

        //④调用代理实例
        proxy.removeForum(10);
        System.out.println("");
        proxy.removeTopic(1012);
    }
}
