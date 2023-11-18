package com.example.designpattern.Behavioralpattern.TemplateMethod;

public class ConcreteClasss_Baocai extends AbstractClass{
    public void pourVegetable() {
        System.out.println("下锅的蔬菜时包菜");
    }

    public void pourSauce() {
        System.out.println("下锅的调料时辣椒");
    }
}
