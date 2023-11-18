package com.example.designpattern.Behavioralpattern.StateMethod.before;

/**
 * 电梯类
 * 使用了大量的switch语句/ifelse语句 扩展性比较差
 */
public class Lift implements LLift{


    private int state;


    public void setState(int state) {
        this.state = state;
    }

    public void open() {
        switch (state){
            case OPENING_STATE:

                break;
            case CLOSING_STATE:
                System.out.println("电梯打开了");
                setState(OPENING_STATE);
                break;
            case STOPPING_STATE:
                System.out.println("电梯打开了");
                setState(OPENING_STATE);
                break;
            case RUNNING_STATE:
                break;
            default:break;
        }
    }

    public void close() {

    }

    public void run() {

    }

    public void stop() {

    }
}
