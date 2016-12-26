package com.design.command.demo2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dk05408 on 2016/12/19.
 */
public class MacroAudioCommand implements MacroCommand {
    private List<Command> commandList = new ArrayList<Command>();


    @Override
    public void execute() {
        for (Command cmd:commandList) {
            cmd.execute();
        }
    }

    /**
     * 宏命令聚集管理方法
     */
    @Override
    public void add(Command cmd) {
        commandList.add(cmd);
    }

    @Override
    public void remove(Command cmd) {
        commandList.remove(cmd);
    }
}
