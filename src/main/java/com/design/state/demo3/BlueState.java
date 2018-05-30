package com.design.state.demo3;

/**
 * Created by dk05408 on 2017/1/11.
 */
public class BlueState implements State {
    @Override
    public void last(Context c) {
        c.setState(new GreenState());
    }

    @Override
    public void next(Context c) {
        c.setState(new RedState());
    }

    @Override
    public String getState() {
        return "blue";
    }
}
