package com.example.designpattern.Behavioralpattern.StateMethod.before;

public class Client {
    public static void main(String[] args) {
        LLift lift = new Lift();
        lift.setState(LLift.OPENING_STATE);

        lift.open();
    }
}
