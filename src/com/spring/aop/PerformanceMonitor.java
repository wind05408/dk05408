package com.spring.aop;

/**
 * PerformanceMonitor
 *
 * @author dk
 * @date 2016/8/30
 */
public class PerformanceMonitor {

    private static ThreadLocal<MethodPerformance> performanceThreadLocal = new ThreadLocal<>();

    public static void begin(String method){
        System.out.println(" begin monitor....");
        MethodPerformance mp = new MethodPerformance(method);
        performanceThreadLocal.set(mp);
    }

    public static void end(){
        System.out.println(" end monitor....");
        MethodPerformance mp = performanceThreadLocal.get();
        mp.printPerformance();
    }

}
