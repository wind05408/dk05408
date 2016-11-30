package com.design.observer.demo2;



/**
 * ObserverClient
 *
 * @author dk
 * @date 2016/11/29
 */
public class ObserverClient {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        ConcreteObserver observer = new ConcreteObserver();

        subject.attach(observer);
        subject.change("new State");
    }
}
