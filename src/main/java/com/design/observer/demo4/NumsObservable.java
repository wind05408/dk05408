package com.design.observer.demo4;

import java.util.Observable;

/**
 * NumsObservable
 *
 * @author dk
 * @date 2016/11/30
 */
public class NumsObservable extends Observable {
    public final static  int ODD = 1;
    public final static  int EVEN = 2;

    private int data = 0;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
        int flag = EVEN;
        if((data&0x0001)==1)
            flag = ODD;
        setChanged();
        notifyObservers(flag);
    }
}
