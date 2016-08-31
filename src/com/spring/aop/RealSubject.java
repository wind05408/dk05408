package com.spring.aop;

/**
 * RealSubject
 *
 * @author dk
 * @date 2016/8/31
 * 委托类，具体处理业务
 */
public class RealSubject implements Subject {
    @Override
    public void dealTask(String taskName) {
        System.out.println("正在执行任务："+taskName);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
