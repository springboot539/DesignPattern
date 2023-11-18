package com.example.designpattern.BuilderPattern.SingletonPattern.demo1;


/**
 * 饿汉式 - 静态成员变量方式
 */
public class Singleton {

    // 私有的构造方法
    private Singleton(){

    }

    // 创建本类对象供外界使用
    private static Singleton instance = new Singleton();

    // 提供一个公共的访问方式，让外界获取到该对象
    public static Singleton getInstance(){
        return instance;
    }
}
