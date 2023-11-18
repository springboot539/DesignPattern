package com.example.designpattern.Behavioralpattern.TemplateMethod;

/**
 * 模板抽象类
 */
public abstract class AbstractClass {

    /**
     * 模板方法 定义算法顺序，定义为子类不允许重写
     */
    public final void cookProcess(){
        pourOil();
        hearOil();
        pourVegetable();
        pourSauce();
        fry();
    }

    public void pourOil() {
        System.out.println("倒油");
    }

    public void hearOil() {
        System.out.println("热油");
    }

    /**
     * 炒制特定蔬菜，由子类决定并实现
     */
    public abstract void pourVegetable();

    /**
     * 倒调味料
     */
    public abstract void pourSauce();

    public void fry() {
        System.out.println("翻炒 翻炒 一直到熟了为止");
    }
}
