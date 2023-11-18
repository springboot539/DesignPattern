package com.example.designpattern.Behavioralpattern.StateMethod.after;

public class Opening extends LiftState{
    public void open() {
        System.out.println("电梯开启。。");
    }

    public void close() {
        super.context.setLiftState(Context.CLOSEING_STATE);
        super.context.close();
    }

    public void run() {

    }

    public void stop() {
    }
}
