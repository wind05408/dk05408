package com.design.observer.demo3;

import java.util.Observable;

/**
 * Watched
 *
 * @author dk
 * @date 2016/11/29
 */
public class Watched extends Observable {
    private String data ="";

    public String getData() {
        return data;
    }

    public void setData(String data) {
        if(!this.data.equals(data)){
            this.data = data;
            setChanged();
        }
        notifyObservers();
    }
}
