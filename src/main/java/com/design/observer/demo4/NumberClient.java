package com.design.observer.demo4;

/**
 * NumberClient
 *
 * @author dk
 * @date 2016/11/30
 */
public class NumberClient {
    public static void main(String[] args) {
        NumsObservable numsObservable = new NumsObservable();
        numsObservable.addObserver(new ODDObserver());
        numsObservable.addObserver(new EvenObserver());
        numsObservable.setData(1);
        numsObservable.setData(2);
        numsObservable.setData(3);
        numsObservable.setData(4);

    }
}
