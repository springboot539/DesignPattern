package com.example.designpattern.BuilderPattern.PrototypePattern.demo1;

import java.io.Serializable;

public class Student implements Serializable {
    private String stuName;

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuName='" + stuName + '\'' +
                '}';
    }
}
