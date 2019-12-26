package com.queue;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Description: TODO
 * @Author dk05408
 * @Date 2019/12/26
 **/
public class BlockingQueueWithLock<E> implements Queue<E> {

    private E[] array;
    private int head;  // 队头指针
    private int tail;  // 队尾指针

    private volatile int size; // 队列元素个数

    private Lock lock = new ReentrantLock();
    private Condition noFull = lock.newCondition();
    private Condition noEmpty = lock.newCondition();

    public BlockingQueueWithLock(int capacity) {
        array = (E[]) new Object[capacity];
    }

    @Override
    public void put(E e) throws InterruptedException {
        lock.lockInterruptibly();
        try {
            while (size == array.length) {
                noFull.await();
            }
            array[tail] = e;
            if (++tail == array.length) {
                tail = 0;
            }
            ++size;
            noEmpty.signalAll();
        } finally {
            lock.unlock();
        }
    }

    @Override
    public E take() throws InterruptedException {
        lock.lockInterruptibly();
        try {
            while (isEmpty()) {
                noEmpty.await();
            }
            E e = array[head];
            if (++head == array.length) {
                head = 0;
            }
            --size;
            noFull.signalAll();
            return e;
        } finally {
            lock.unlock();
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }
}
