package com.example.designpattern.BuilderPattern.PrototypePattern.demo1;

import java.io.Serializable;

/**
 * 奖状类，除了name不同其他的都相同
 */
public class Citation implements Cloneable, Serializable {
    private Student stu;

    public void setStu(Student stu) {
        this.stu = stu;
    }

    public Student getStu() {
        return stu;
    }

    public void show(){
        System.out.println(stu.getStuName() + " —> 获取奖状");
    }
    @Override
    public Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }
}
