package com.example.designpattern.StructuralPattern.AdapterPattern.object_adapter;

/**
 * Computer只能从SDCard读取数据 不能直接读取TF数据，所以需要Adapter Adapter继承Target TFCardImpl，实现Adaptee的接口
 * 注意 这个是类适配器模式，需要依赖继承和实现 耦合度高
 * 一般使用对象适配器模式，依赖组合或者聚合实现
 */
public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.readSD(new SDCardImpl());

        Computer computer1 = new Computer();
        System.out.println(computer1.readSD(new SDAdapterTF(new TFCardImpl())));

    }
}
