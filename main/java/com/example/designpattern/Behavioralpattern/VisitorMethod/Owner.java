package com.example.designpattern.Behavioralpattern.VisitorMethod;

public class Owner implements Person{
    public void feed(Cat cat) {
        System.out.println("主人喂食cat ：" + cat);
    }

    public void feed(Dog dog) {
        System.out.println("主人喂食dog ：" + dog);
    }
}
