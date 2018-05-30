package com.data.thread;

/**
 * Created with IntelliJ IDEA
 * MultiThreadLong
 * 32Bit JMM 原子性
 * @author dk
 * @date 2017/6/20 14:48
 */
public class MultiThreadLong {
    public static long t =0;
    public static class ChangeT implements Runnable{
        private long to;

        public ChangeT(long to) {
            this.to = to;
        }

        @Override
        public void run() {
            while (true){
                MultiThreadLong.t = to;
                Thread.yield();
            }

        }
    }


    public static class ReadT implements Runnable{
        @Override
        public void run() {
            while (true){
                long tmp = MultiThreadLong.t;
                if(tmp != 111l&&tmp !=-999l&&tmp !=333l&&tmp !=-444l){
                    System.out.println(tmp);
                }
                Thread.yield();
            }
        }
    }

    public static void main(String[] args) {
        new Thread(new ChangeT(111L)).start();
        new Thread(new ChangeT(-999l)).start();
        new Thread(new ChangeT(333l)).start();
        new Thread(new ChangeT(-444l)).start();
        new Thread(new ReadT()).start();
    }

}
