package com.design.command.demo1;

/**
 * Created by dk05408 on 2016/12/19.
 */
public class Invoker {

    private Command command = null;

    public Invoker(Command command) {
        this.command = command;
    }
    /**
     * 行动方法
     */
    public void action(){
        command.execute();
    }
}
