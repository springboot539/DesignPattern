package com.example.designpattern.Behavioralpattern.StateMethod.before;

public interface LLift {

    //定义电梯状态的四个常量
    int OPENING_STATE = 1;
    int CLOSING_STATE = 2;
    int RUNNING_STATE = 3;
    int STOPPING_STATE = 4;

    void setState(int state);

    void open();

    void close();

    void run();

    void stop();
}
