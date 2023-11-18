package com.example.designpattern.Behavioralpattern.CommandMethod;


import java.util.ArrayList;
import java.util.List;

/**
 * 属于调用者角色 供客户端调用
 */
public class Waitor {

    //可以持有多个命令对象

    private List<Command> commandList = new ArrayList<Command>();

    public void setCommand(Command command) {
        commandList.add(command);
    }

    /**
     * 发起命令功能
     */
    public void orderUp() {
        System.out.println("新订单来了 ！");
        for (Command c : commandList) {
            if (c != null) {
                c.execute();
            }
        }
    }

}
