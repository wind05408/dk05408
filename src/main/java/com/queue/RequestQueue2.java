package com.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Description: TODO
 * @Author dk05408
 * @Date 2019/12/23
 **/
public class RequestQueue2 {
    private final Queue<Request> queue = new LinkedList<>();
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public  Request getRequest() {
        try {
            lock.lock();
            while (queue.peek() == null) {
                try {
                    condition.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            return queue.remove();
        } finally {
            lock.unlock();
        }
    }
    public void putRequest(Request request) {
        try {
            lock.lock();
            queue.offer(request);
            condition.signalAll();
        } finally {
            lock.unlock();
        }
    }
}
