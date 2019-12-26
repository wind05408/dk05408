package com.queue;

import org.junit.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Benchmark {

    @Test
    public void testWithMonitor() {
        Queue<Integer> queue = new BlockingQueueWithSync<>(5);
        execute(queue);
    }

    @Test
    public void testWithCondition() {
        Queue<Integer> queue = new BlockingQueueWithLock<>(5);
        execute(queue);
    }

    private void execute(Queue<Integer> queue) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 1; i <= 1000; i++) {
            final int finalNum = i;
            executorService.execute(() -> {
                try {
                    queue.put(finalNum);
                    Integer take = queue.take();
                    System.out.println("item: " + take);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
        executorService.shutdown();
    }

}