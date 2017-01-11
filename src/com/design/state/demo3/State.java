package com.design.state.demo3;

/**
 * Created by dk05408 on 2017/1/11.
 */
public interface State {
    public  void last(Context c);

    public  void next(Context c);

    public  String getState();

}
