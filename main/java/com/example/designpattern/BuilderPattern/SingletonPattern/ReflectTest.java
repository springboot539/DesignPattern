package com.example.designpattern.BuilderPattern.SingletonPattern;


import com.example.designpattern.BuilderPattern.SingletonPattern.demo2.Singleton;

import java.io.*;
import java.lang.reflect.Constructor;

/**
 * 反射破坏单例模式
 */
public class ReflectTest {

    public static void main(String[] args) throws Exception {
        Class clazz = Singleton.class;
        Constructor cons = clazz.getDeclaredConstructor();
//     取消访问检查
        cons.setAccessible(true);
        Singleton instance1 = (Singleton) cons.newInstance();
        Singleton instance2 = (Singleton) cons.newInstance();
        System.out.println(instance1 == instance2);  //false
    }


}
