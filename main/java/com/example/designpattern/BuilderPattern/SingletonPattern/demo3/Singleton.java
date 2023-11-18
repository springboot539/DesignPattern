package com.example.designpattern.BuilderPattern.SingletonPattern.demo3;

/**
 * 懒汉式 - （线程不安全）
 * （线程安全）使用synchronized关键字
 */
public class Singleton {

    private Singleton(){}

    private static Singleton instance;

    public static synchronized Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
