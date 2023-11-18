package com.example.designpattern.Behavioralpattern.VisitorMethod;

public class Dog implements Animal{


    public void accept(Person person) {
        System.out.println("dog 获取食物 从： "  + person);
        person.feed(this);
    }
}
