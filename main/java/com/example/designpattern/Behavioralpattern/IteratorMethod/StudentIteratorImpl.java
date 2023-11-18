package com.example.designpattern.Behavioralpattern.IteratorMethod;

import java.util.List;

public class StudentIteratorImpl implements StudentIterator{

    private List<Student> stuList;
    private int pos;

    public StudentIteratorImpl(List<Student> stuList) {
        this.stuList = stuList;
        pos = 0;
    }

    public boolean hasNext() {
        return !stuList.isEmpty() && pos < stuList.size();
    }

    public Student next() {
        if (pos >= stuList.size()) {
            throw new RuntimeException("没有下一个元素");
        }
        Student stu = stuList.get(pos++);
        return stu;
    }
}
