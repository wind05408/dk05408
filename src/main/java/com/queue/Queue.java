package com.queue;

public interface Queue<E> {
    void put(E e) throws InterruptedException;

    E take() throws InterruptedException;

    int size();

    boolean isEmpty();
}
