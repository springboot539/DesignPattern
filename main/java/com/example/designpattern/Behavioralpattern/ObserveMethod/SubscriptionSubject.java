package com.example.designpattern.Behavioralpattern.ObserveMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体主题角色类
 */
public class SubscriptionSubject implements Subject{


    //定义集合存储观察者对象
    private List<Observer> weixinUserList = new ArrayList<Observer>();
    public void attach(Observer observer) {
        weixinUserList.add(observer);
    }

    public void detach(Observer observer) {
        weixinUserList.remove(observer);
    }

    public void notifyObservers(String msg) {
        for(Observer observer : weixinUserList){
            observer.update(msg);
        }
    }
}
