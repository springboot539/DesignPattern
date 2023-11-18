package com.example.designpattern.StructuralPattern.AdapterPattern.object_adapter;

public class SDAdapterTF implements SDCard {
    private TFCard tfCard;

    public SDAdapterTF(TFCard tfCard){
        this.tfCard = tfCard;
    }

    public String readSD() {
        System.out.println("SDCard Adapter readSD TF card !!! 对象结构模式");
        return tfCard.readTF();
    }

    public void writeSD(String msg) {
        System.out.println("SDCard Adapter writeSD msg :" + msg);
        tfCard.writeTF(msg);
    }
}
