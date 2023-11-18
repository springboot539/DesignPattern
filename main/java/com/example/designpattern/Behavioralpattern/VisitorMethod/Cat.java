package com.example.designpattern.Behavioralpattern.VisitorMethod;

/**
 * 具体元素角色类,直接调用访问者的方法
 */
public class Cat implements Animal{

    public void accept(Person person) {
        System.out.println("cat 获取食物 从： " + person);
        person.feed(this);
    }
}
