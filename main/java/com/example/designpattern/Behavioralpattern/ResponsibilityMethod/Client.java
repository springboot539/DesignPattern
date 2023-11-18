package com.example.designpattern.Behavioralpattern.ResponsibilityMethod;

public class Client {
    public static void main(String[] args) {
        LeaveRequest request = new LeaveRequest("Tom", 2, "感冒了");

        GroupLeader leader = new GroupLeader();
        ManagerLeader leader1 = new ManagerLeader();
        GeneralManagerLeader leader2 = new GeneralManagerLeader();

        //设置处理者链 责任链
        leader.setNextHandler(leader1);
        leader1.setNextHandler(leader2);

        leader.sumbit(request);
    }
}
