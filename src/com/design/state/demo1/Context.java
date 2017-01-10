package com.design.state.demo1;

/**
 * Created by dk05408 on 2017/1/10.
 */
public class Context {
    private State state;

    public void setState(State state) {
        this.state = state;
    }

    public void request(String param){
        state.handle(param);
    }
}
