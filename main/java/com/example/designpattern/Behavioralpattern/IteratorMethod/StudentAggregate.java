package com.example.designpattern.Behavioralpattern.IteratorMethod;

/**
 * 抽象聚合接口
 */
public interface StudentAggregate {

    void addStudent(Student student);

    void removeStudent(Student student);

    StudentIterator getStudentIterator();
}
