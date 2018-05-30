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

        //********************************************

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

   /*     console out:
        begin monitor....
        模拟删除Forum记录:10
        end monitor....
        com.spring.aop.ForumServiceImpl.removeForum花费40毫秒。

        begin monitor....
        模拟删除Topic记录:1012
        end monitor....
        com.spring.aop.ForumServiceImpl.removeTopic花费21毫秒。*/

      //********************************************

        //cglib
//        CglibProxy proxy = new CglibProxy();
//        ForumServiceImpl forumService = //①
//        (ForumServiceImpl )proxy.getProxy(ForumServiceImpl.class);
//        forumService.removeForum(10);
//        forumService.removeTopic(1023);

   /*   console out:
        begin monitor....
        模拟删除Forum记录:10
        end monitor....
        com.spring.aop.ForumServiceImpl$$EnhancerByCGLIB$$f5731c05.removeForum花费40毫秒。
        begin monitor....
        模拟删除Topic记录:1023
        end monitor....
        com.spring.aop.ForumServiceImpl$$EnhancerByCGLIB$$f5731c05.removeTopic花费20毫秒。*/
    }
}
