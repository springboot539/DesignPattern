package com.example.designpattern.Behavioralpattern.ObserveMethod;

/**
 * 抽象主题角色类
 */
public interface Subject {

    //添加观察者
    void attach(Observer observer);

    //删除观察者
    void detach(Observer observer);

    //通知观察者更新操作
    void notifyObservers(String msg);
}
