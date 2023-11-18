package com.example.designpattern.Behavioralpattern.VisitorMethod;

/**
 * 访问者角色类
 * 注意 必须传入具体类型，且接口数量和元素数量报纸一至
 */
public interface Person {
    void feed(Cat cat);

    void feed(Dog dog);
}
