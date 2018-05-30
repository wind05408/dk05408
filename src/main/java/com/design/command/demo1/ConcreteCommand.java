package com.design.command.demo1;

/**
 * Created by dk05408 on 2016/12/19.
 */
public class ConcreteCommand implements Command {
    private Receiver receiver = null;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
