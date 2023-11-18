package com.example.designpattern.Behavioralpattern.TemplateMethod;

/**
 * 模板方法的具体实现类
 */
public class ConcreteClasss_Caixin extends AbstractClass{
    public void pourVegetable() {
        System.out.println("下锅的蔬菜时菜心");
    }

    public void pourSauce() {
        System.out.println("下锅的调料时腊肉");
    }
}
