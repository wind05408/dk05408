package com.design.strategy.demo2;

/**
 * StrategyClient
 *
 * @author dk
 * @date 2016/11/21
 */
public class StrategyClient {
    public static void main(String[] args) {
        Strategy strategyA = new ConcreteStrategyA();
        Context  context = new Context(strategyA);
        context.contextInterface();

        Strategy strategyB = new ConcreteStrategyB();
        context = new Context(strategyB);
        context.contextInterface();

        Strategy strategyC = new ConcreteStrategyC();
        context = new Context(strategyC);
        context.contextInterface();


    }
}
