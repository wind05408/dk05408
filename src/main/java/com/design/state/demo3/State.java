package com.design.state.demo3;

/**
 * Created by dk05408 on 2017/1/11.
 */
public interface State {
    void last(Context c);

    void next(Context c);

    String getState();

}
