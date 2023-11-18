package com.example.designpattern.Behavioralpattern.StateMethod.after;

public class Client {

    public static void main(String[] args) {
        //环境角色
        Context context = new Context();
        context.setLiftState(new Opening());

        context.close();
        context.open();
        context.run();
        context.stop();
    }
}
