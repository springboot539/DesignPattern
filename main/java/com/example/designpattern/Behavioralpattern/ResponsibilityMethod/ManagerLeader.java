package com.example.designpattern.Behavioralpattern.ResponsibilityMethod;

public class ManagerLeader extends Handler{
    public ManagerLeader() {
        super(NUM_ONE, NUM_THREE);
    }

    protected void handleLeave(LeaveRequest leave) {
        System.out.println(leave.getName() + " 请假 " + leave.getDays() + " 天, 理由是 " + leave.getContent());
        System.out.println("部门经理审批 ： 同意");
    }
}
