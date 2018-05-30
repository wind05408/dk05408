package com.design.strategy.demo2;

/**
 * Context
 *
 * @author dk
 * @date 2016/11/21
 */
public class Context {
    //持有一个具体策略的对象
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }
    /**
     * 策略方法
     */
    public void contextInterface(){
        strategy.strategyInterface();
    }
}
