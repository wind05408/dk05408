package com.design.command.demo1;

/**
 * Created by dk05408 on 2016/12/19.
 */
public class Main {
    public static void main(String[] args) {
        //创建接收者
        Receiver receiver = new Receiver();
        //创建命令对象，设定它的接收者
        Command command = new ConcreteCommand(receiver);
        //创建请求者，把命令对象设置进去
        Invoker invoker= new Invoker(command);
        //执行方法
        invoker.action();
    }

}
