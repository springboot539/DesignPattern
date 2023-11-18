package com.example.designpattern.Behavioralpattern.ResponsibilityMethod;

/**
 * 抽象处理者类
 */
public abstract class Handler {

    protected final static int NUM_ONE = 1;
    protected final static int NUM_THREE = 3;
    protected final static int NUM_SEVEN = 7;

    private int numStart;
    private int numEnd;

    //声明后继者，责任链模式，
    private Handler nextHandler;

    public Handler(int numStart, int numEnd) {
        this.numStart = numStart;
        this.numEnd = numEnd;
    }

    /**
     * 设置上级领导的批条
     * @param nextHandler
     */
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    protected abstract void handleLeave(LeaveRequest leave);

    public final void sumbit(LeaveRequest leaveRequest){
        //本次领导审批
        this.handleLeave(leaveRequest);
        if(this.nextHandler != null && leaveRequest.getDays() > this.numEnd){
//            提交给上次领导进行审批（巧妙啊 通过构造函数传入end就不用hardcode）
            this.nextHandler.sumbit(leaveRequest);
        } else {
            System.out.println("流程结束！");
        }
    }
}
