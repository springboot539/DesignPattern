package com.example.designpattern.Behavioralpattern.StateMethod.after;

public class Context {


    //定义对应状态的常量
    public final static Opening OPENING_STATE = new Opening();
    public final static Closeing CLOSEING_STATE = new Closeing();
    public final static Running RUNNING_STATE = new Running();
    public final static Stoping STOPING_STATE = new Stoping();

    //定义当前状态变量
    private LiftState liftState;

    public LiftState getLiftState() {
        return liftState;
    }

    /**
     * 设置当前状态对象
     * @param liftState
     */
    public void setLiftState(LiftState liftState) {
        this.liftState = liftState;
        //设置当前状态中的Context对象
        this.liftState.setContext(this);
    }

    public void open(){
        this.liftState.open();
    }

    public void close(){
        this.liftState.close();
    }

    public void run(){
        this.liftState.run();
    }

    public void stop(){
        this.liftState.stop();
    }
}
