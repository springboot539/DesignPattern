package com.example.designpattern.Behavioralpattern.IteratorMethod;

/**
 * 迭代器模式 抽象迭代器接口
 */
public interface StudentIterator {

    boolean hasNext();

    Student next();
}
