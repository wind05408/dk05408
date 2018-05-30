package com.design.state.demo3;

/**
 * Created by dk05408 on 2017/1/11.
 */
public class Context {
    private State state = null;

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void push(){
        state.last(this);
        System.out.println(state.getState());
    }

    public void pull(){
        state.next(this);
        System.out.println(state.getState());
    }


}
