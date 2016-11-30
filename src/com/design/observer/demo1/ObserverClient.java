package com.design.observer.demo1;

/**
 * ObserverClient
 *
 * @author dk
 * @date 2016/11/29
 */
public class ObserverClient {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        ConcreteObject observer = new ConcreteObject();

        subject.attach(observer);
        subject.change("new State");

    }
}
