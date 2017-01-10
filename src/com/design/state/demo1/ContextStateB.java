package com.design.state.demo1;

/**
 * Created by dk05408 on 2017/1/10.
 */
public class ContextStateB implements State {
    @Override
    public void handle(String param) {
        System.out.println("ContextStateB handle:"+param);
    }
}
