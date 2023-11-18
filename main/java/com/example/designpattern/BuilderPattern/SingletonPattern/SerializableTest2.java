package com.example.designpattern.BuilderPattern.SingletonPattern;


import com.example.designpattern.BuilderPattern.SingletonPattern.demo5.Singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 序列化破坏单例模式
 */
public class SerializableTest2 {

    public static void main(String[] args) throws Exception {
        // writeObject2File();
        readObjectFromFile();
        readObjectFromFile();
    }

    public static void writeObject2File() throws Exception {
        Singleton singleton = Singleton.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/Users/pangjiaming/a.txt"));
        oos.writeObject(singleton);
        oos.close();
    }

    public static void readObjectFromFile () throws Exception{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/Users/pangjiaming/a.txt"));
        Singleton instance = (Singleton) ois.readObject();
        System.out.println(instance);
        ois.close();
    }
}
