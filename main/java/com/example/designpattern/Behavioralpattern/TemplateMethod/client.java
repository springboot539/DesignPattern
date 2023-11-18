package com.example.designpattern.Behavioralpattern.TemplateMethod;

public class client {
    public static void main(String[] args) {

        AbstractClass baocai = new ConcreteClasss_Baocai();
        baocai.cookProcess();


    }
}
