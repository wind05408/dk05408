package com.spring.aop;

/**
 * MethodPerformance
 *
 * @author dk
 * @date 2016/8/30
 */
public class MethodPerformance {
    private long begin;
    private long end;
    private String serviceMethod;

    public MethodPerformance(String serviceMethod) {
        this.serviceMethod = serviceMethod;
        this.begin = System.currentTimeMillis();
    }

    public void printPerformance(){
        end = System.currentTimeMillis();
        System.out.println(serviceMethod+"花费"+(end-begin)+"毫秒。");
    }
}
