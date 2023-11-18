package com.example.designpattern.BuilderPattern.PrototypePattern.demo1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CitationTest {

    public static void main(String[] args) throws Exception {

        /*浅克隆 非基本类型 仍指向原有属性的内存地址*/
        Citation citation = new Citation();
        Student student = new Student();
        student.setStuName("张三");
        citation.setStu(student);
        Citation clone = citation.clone();
        clone.getStu().setStuName("李四");
        citation.show();
        clone.show();
        System.out.println(clone.getStu() == student);

        /*深克隆*/
        /*创建对象输出流对象*/
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("citation.txt"));
        oos.writeObject(citation);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("citation.txt"));
        Citation citation1 = (Citation) ois.readObject();
        ois.close();
        System.out.println(student == citation1.getStu());
    }
}
