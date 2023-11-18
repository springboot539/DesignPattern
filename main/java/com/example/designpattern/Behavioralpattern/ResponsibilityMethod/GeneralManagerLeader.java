package com.example.designpattern.Behavioralpattern.ResponsibilityMethod;

public class GeneralManagerLeader extends Handler{
    public GeneralManagerLeader() {
        super(NUM_THREE, NUM_SEVEN);
    }

    protected void handleLeave(LeaveRequest leave) {
        System.out.println(leave.getName() + " 请假 " + leave.getDays() + " 天, 理由是 " + leave.getContent());
        System.out.println("总经理审批 ： 同意");
    }
}
