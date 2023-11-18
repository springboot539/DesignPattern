package com.example.designpattern.Behavioralpattern.MediatorMethod;

/**
 * 具体的同事角色
 */
public class HouseOwner extends Person{

    public HouseOwner(String name, Mediator mediator) {
        super(name, mediator);
    }

    public void constract(String message){
        mediator.constract(message, this);
    }

    public void getMessage(String msg){
        System.out.println("房主 ：" + name  + ", 获取到的信息：" + msg);
    }
}
