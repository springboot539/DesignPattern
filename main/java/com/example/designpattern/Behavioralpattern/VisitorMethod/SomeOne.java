package com.example.designpattern.Behavioralpattern.VisitorMethod;

public class SomeOne implements Person{


    public void feed(Cat cat) {
        System.out.println("其他人喂猫");
    }

    public void feed(Dog dog) {
        System.out.println("其他人喂狗");
    }
}
