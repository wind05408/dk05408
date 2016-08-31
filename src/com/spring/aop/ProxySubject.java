package com.spring.aop;

/**
 * ProxySubject
 *
 * @author dk
 * @date 2016/8/31
 *
 * 静态代理类
 * @see Subject.info
 */
public class ProxySubject implements Subject {

    private Subject delegate;

    public ProxySubject(Subject delegate) {
        this.delegate = delegate;
    }

    @Override
    public void dealTask(String taskName) {
        long begin = System.currentTimeMillis();
        //将请求分派给委托类处理
        delegate.dealTask(taskName);
        long end = System.currentTimeMillis();
        System.out.println("执行任务耗时"+(end - begin)+"毫秒");
    }

}



