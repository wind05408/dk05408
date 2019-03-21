package com.proxy;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: dk05408
 * @date: 2019/3/20 14:18
 * Description:${TODO}
 */
public class DBQuery implements IDBQuery {

    public DBQuery() {
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String request() {
        return "request coming";
    }
}
