package com.example.designpattern.BuilderPattern.SingletonPattern.demo1;


/**
 * 测试类 测试饿汉式 静态变量
 */
public class Client {
    public static void main(String[] args) {

        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        //饿汉式获取到的应该同一个对象
        System.out.println(instance == instance2); //true 在内存中是同一个对象
    }
}
