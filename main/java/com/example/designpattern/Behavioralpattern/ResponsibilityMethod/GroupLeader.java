package com.example.designpattern.Behavioralpattern.ResponsibilityMethod;

public class GroupLeader extends Handler{
    public GroupLeader() {
        super(0, NUM_ONE);
    }

    protected void handleLeave(LeaveRequest leave) {
        System.out.println(leave.getName() + " 请假 " + leave.getDays() + " 天, 理由是 " + leave.getContent());
        System.out.println("小组长审批 ： 同意");
    }
}
