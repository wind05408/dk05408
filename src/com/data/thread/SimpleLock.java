package com.data.thread;

import java.util.concurrent.locks.AbstractQueuedSynchronizer;

/**
 * @author dk
 * @date 2016/3/17
 */
public class SimpleLock extends AbstractQueuedSynchronizer {
    public SimpleLock() {

    }

    protected boolean tryAcquire(int unused) {
        if (compareAndSetState(0, 1)) {
            setExclusiveOwnerThread(Thread.currentThread());
            return true;
        }
        return false;
    }


    protected boolean tryRelease(int unused) {
        setExclusiveOwnerThread(null);
        setState(0);
        return true;
    }


    public void lock() {
        acquire(1);
    }

    public boolean tryLock() {
        return tryAcquire(1);
    }

    public void unlock() {
        release(1);
    }

    public boolean isLocked() {
        return isHeldExclusively();
    }

    public static void main(String[] args) throws InterruptedException {
        final SimpleLock lock = new SimpleLock();
        lock.lock();

        for (int i = 0; i <10 ; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    lock.lock();
                    System.out.println(Thread.currentThread().getId()+" acquired the lock!");
                    lock.unlock();
                }
            }).start();
            Thread.sleep(100);
        }
        System.out.println("main thread unlock!");
        lock.unlock();
    }

}
