package com.example.designpattern.Behavioralpattern.IteratorMethod;

/**
 * 迭代器迭代对象
 */
public class Student {

    private String name;
    private String number;

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, String number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
