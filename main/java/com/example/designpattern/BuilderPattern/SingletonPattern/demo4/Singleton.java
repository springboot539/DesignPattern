package com.example.designpattern.BuilderPattern.SingletonPattern.demo4;

/**
 * 懒汉式 - 双重检查锁 (多线程可能会存在空指针问题，JVM实例化对象存在优化和指令重排序操作)
 *         使用volatile关键保证可见性和有序性
 *
 *
 */
public class Singleton {

    private Singleton(){}

    //volatile 必须要，因为构造方法和引用赋值操作可能会存在指令重排序，如果new一半初始化对象，另外的线程访问直接 INSTANCE不为null，就导致数据不一致问题。
    private static volatile Singleton instance;

    public static  Singleton getInstance(){
        // 如果不为null，不需要抢占锁，直接返回instance即可
        if(instance == null){
            synchronized (Singleton.class){
                //如果为null,获取锁，线程休眠，另一个线程判断为null，等待执行创建初始化对象，拿到锁执行创建对象，导致创建出来的对象不是同一个
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }

        return instance;
    }
}
