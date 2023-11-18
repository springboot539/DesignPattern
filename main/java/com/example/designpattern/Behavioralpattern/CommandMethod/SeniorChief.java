package com.example.designpattern.Behavioralpattern.CommandMethod;

/**
 * 厨师类 命令模式实现类
 */
public class SeniorChief {

    public void makeFood(String name, int num) {
        System.out.println("制作 ：" + name + "， " + num + "份。");
    }
}
