package com.queue;
/**
 * @Description: TODO
 * @Author dk05408
 * @Date 2019/12/26
 **/
public class BlockingQueueWithSync<E> implements Queue<E> {
    private E[] array;
    private int head;  // 队头指针
    private int tail;  // 队尾指针

    private volatile int size; // 队列元素个数

    public BlockingQueueWithSync(int capacity) {
        this.array =(E[]) new Object[capacity];
    }

    @Override
    public synchronized void put(E e) throws InterruptedException {
        while (size == array.length){
            this.wait();
        }
        array[tail] = e;
        if(++tail == array.length){
            tail = 0;
        }
        ++size;
        this.notifyAll();
    }

    @Override
    public synchronized E take() throws InterruptedException {
        while (isEmpty()){
            this.wait();
        }
        E e = array[head];
        if(++head == array.length){
            head = 0;
        }
        --size;
        this.notifyAll();
        return e;
    }

    @Override
    public synchronized  int size() {
        return size;
    }

    @Override
    public synchronized  boolean isEmpty() {
        return size == 0;
    }
}
