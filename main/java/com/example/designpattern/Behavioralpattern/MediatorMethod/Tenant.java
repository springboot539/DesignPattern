package com.example.designpattern.Behavioralpattern.MediatorMethod;

/**
 * 具体的同事角色类
 */
public class Tenant extends Person{


    public Tenant(String name, Mediator mediator) {
        super(name, mediator);
    }

    //和中介联系
    public void constact(String msg){
        mediator.constract(msg, this);
    }

    //获取信息
    public void getMessage(String msg){
        System.out.println("租房者 :" + name + ", 获取到的信息， " + msg);
    }
}
