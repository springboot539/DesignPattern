package com.example.designpattern.Behavioralpattern.CommandMethod;

import java.util.Map;

/**
 * 具体命令者
 * 持有实现者
 */
public class OrderCommand implements Command {
    private SeniorChief seniorChief;
    private Order order;

    public OrderCommand(SeniorChief seniorChief, Order order) {
        this.seniorChief = seniorChief;
        this.order = order;
    }

    public void execute() {
        System.out.println(order.getDateingtable() + "桌");
        Map<String, Integer> foodDir = order.getFoodDir();
        for (Map.Entry<String, Integer> entry : foodDir.entrySet()) {
            seniorChief.makeFood(entry.getKey(), entry.getValue());
        }

        System.out.println("已经准备好了" + order.getDateingtable());
    }
}
