package com.example.designpattern.StructuralPattern.AdapterPattern.class_adapter;

public class SDAdapterTF extends TFCardImpl implements SDCard{


    public String readSD() {
        System.out.println("SDCard Adapter readSD TF card");
        return readTF();
    }

    public void writeSD(String msg) {
        System.out.println("SDCard Adapter writeSD msg :" + msg);
        writeTF(msg);
    }
}
