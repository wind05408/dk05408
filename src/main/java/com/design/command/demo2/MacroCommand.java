package com.design.command.demo2;

/**
 * Created by dk05408 on 2016/12/19.
 */
public interface MacroCommand extends Command {
    /**
     * 宏命令聚集的管理方法
     * 可以添加一个成员命令
     */
    void add(Command cmd);
    /**
     * 宏命令聚集的管理方法
     * 可以删除一个成员命令
     */
    void remove(Command cmd);
}
