package com.example.designpattern.Behavioralpattern.VisitorMethod;

/**
 * 接收访问者访问的功能（指定访问者）
 */
public interface Animal {

    void accept(Person person);
}
