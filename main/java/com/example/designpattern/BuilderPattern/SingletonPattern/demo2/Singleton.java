package com.example.designpattern.BuilderPattern.SingletonPattern.demo2;

/**
 * 饿汉式 - 静态代码块实现方式
 */
public class Singleton {

    private Singleton(){}

    // 声明一个成员变量，但是并没有赋值
    private static  Singleton instance; //此时是null

    // 在静态代码块中进行赋值操作
    static {
        instance = new Singleton();
    }

    // 提供访问方法
    public static Singleton getInstance(){
        return instance;
    }
}
