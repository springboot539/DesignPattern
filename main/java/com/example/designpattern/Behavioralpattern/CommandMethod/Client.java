package com.example.designpattern.Behavioralpattern.CommandMethod;

import com.sun.org.apache.xpath.internal.operations.Or;

public class Client {
    public static void main(String[] args) {

        Order order = new Order();
        order.setDateingtable(1);
        order.setFood("红烧狮子头",2);


        Order order1 = new Order();
        order1.setDateingtable(2);
        order1.setFood("刀削面",10);

        SeniorChief receiver = new SeniorChief();

        OrderCommand cmd1 = new OrderCommand(receiver, order);

        Waitor waitor = new Waitor();
        waitor.setCommand(cmd1);
        waitor.orderUp();
    }
}
