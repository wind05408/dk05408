package com.design.observer.demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * Subject
 *
 * @author dk
 * @date 2016/11/29
 */
public abstract class Subject {
    private List<Observer> list = new ArrayList<>();

    public void attach(Observer observer){
        list.add(observer);
        System.out.println("attach an observer");
    }

    /** 删除观察者对象
    * @param observer    观察者对象
    */
    public void detach(Observer observer){

        list.remove(observer);
    }

    /**
     * 通知所有注册的观察者对象
     */
    public void nodifyObservers(String newState){

        for(Observer observer : list){
            observer.update(newState);
        }
    }

}
