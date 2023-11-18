package com.example.designpattern.Behavioralpattern.ObserveMethod;

/**
 * 具体的观察者角色
 */
public class WeiXinUser implements Observer{

    private String name;

    public WeiXinUser(String name) {
        this.name = name;
    }

    public void update(String message) {
        System.out.println("name - " + name + "， msg : " + message);
    }
}
