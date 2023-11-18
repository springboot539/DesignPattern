package com.example.designpattern.BuilderPattern.SingletonPattern.demo5;

import java.io.Serializable;

/**
 * 懒汉式 - 静态内部类
 */
public class Singleton implements Serializable {

    private Singleton(){}

    private static class SingletonHolder {
        //内部类声明并初始化外部类对象
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance(){
        return SingletonHolder.INSTANCE;
    }

    //序列化破坏单例模式
    //当进行反序列化时会自动调用该方法，将该方法的返回值直接返回，否则直接new
    public Object readResolve(){
        return SingletonHolder.INSTANCE;
    }
}
