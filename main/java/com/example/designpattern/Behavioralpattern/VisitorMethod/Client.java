package com.example.designpattern.Behavioralpattern.VisitorMethod;

public class Client {
    public static void main(String[] args) {

        Home home = new Home();
        home.add(new Dog());
        home.add(new Dog());
        home.add(new Cat());
        home.add(new Cat());

        Owner owner = new Owner();
        SomeOne someOne = new SomeOne();
        //主人喂食所有宠物 (访问者模式 直接访问所有的)
        home.action(owner);
    }
}
