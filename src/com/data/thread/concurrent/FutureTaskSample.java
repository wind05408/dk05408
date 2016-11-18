package com.data.thread.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class FutureTaskSample {
      
    static FutureTask<String> future = new FutureTask(new Callable<String>(){
        public String call(){  
            return getPageContent();  
        }  
    });  
      
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        //Start a thread to let this thread to do the time exhausting thing  
        new Thread(future).start();  
  
        //Main thread can do own required thing first  
        System.out.println(doOwnThing());
  
        //At the needed time, main thread can get the result  
        System.out.println(future.get());  
    }  
      
    public static String doOwnThing(){  
        return "Do Own Thing";  
    }  
    public static String getPageContent(){  
        return "Callable method...";  
    }  
}