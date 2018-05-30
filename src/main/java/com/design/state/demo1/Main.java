package com.design.state.demo1;

/**
 * Created by dk05408 on 2017/1/10.
 */
public class Main {
    public static void main(String[] args) {
        State statea = new ContextStateB();
        Context context = new Context();
        context.setState(statea);
        context.request("test");

        State stateb = new ContextStateB();
        context.setState(stateb);
        context.request("test handle");
    }
}
