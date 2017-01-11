package com.design.state.demo3;

/**
 * Created by dk05408 on 2017/1/11.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Context context = new Context();
        State redState = new RedState();
        context.setState(redState);
        while (true){
            System.out.println("当前状态："+context.getState().getState());
            System.out.print("上一个状态: ");
            context.push();
            Thread.sleep(2000);
        }

    }
}
