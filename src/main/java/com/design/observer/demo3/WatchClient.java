package com.design.observer.demo3;

import java.util.Observer;

/**
 * WatchClient
 *
 * @author dk
 * @date 2016/11/29
 */
public class WatchClient {
    public static void main(String[] args) {
        //创建被观察者对象
        Watched watched = new Watched();
        //创建观察者对象，并将被观察者对象登记
        Observer watcher = new Watcher(watched);
        //给被观察者状态赋值
        watched.setData("start");
        watched.setData("run");
        watched.setData("stop");
    }
}
