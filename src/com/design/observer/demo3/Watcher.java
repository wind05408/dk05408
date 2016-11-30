package com.design.observer.demo3;


import java.util.Observable;
import java.util.Observer;

/**
 * Watcher
 *
 * @author dk
 * @date 2016/11/29
 */
public class Watcher implements Observer {

    public Watcher(Observable o){
        o.addObserver(this);
    }
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("状态发生改变：" + ((Watched)o).getData());
    }
}
