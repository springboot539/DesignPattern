package com.example.designpattern.Behavioralpattern.ObserveMethod;

public class Client {
    public static void main(String[] args) {

        Subject subject = new SubscriptionSubject();
        subject.attach(new WeiXinUser("庞家铭1"));
        subject.attach(new WeiXinUser("庞家铭2"));
        subject.attach(new WeiXinUser("庞家铭3"));
        subject.notifyObservers("好好学习，天天向上");

    }
}
