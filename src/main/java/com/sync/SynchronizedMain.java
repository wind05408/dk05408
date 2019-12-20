package com.sync;

/**
 * @Description: TODO
 * @Author dk05408
 * @Date 2019/12/20
 **/
public class SynchronizedMain {
    public synchronized void test1(){

    }

    public void test2(){
        synchronized(this){

        }
    }
}
