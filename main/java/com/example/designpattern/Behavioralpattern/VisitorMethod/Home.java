package com.example.designpattern.Behavioralpattern.VisitorMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * 对象结构类，声明集合存储元素对象
 */
public class Home {

    List<Animal> nodeList  = new ArrayList<Animal>();

    void action(Person person){
        //让访问者访问每一个元素
        for(Animal animal : nodeList){
            animal.accept(person);
        }
    }

    void add(Animal animal){
        nodeList.add(animal);
    }
}
