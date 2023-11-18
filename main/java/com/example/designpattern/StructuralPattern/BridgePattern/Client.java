package com.example.designpattern.StructuralPattern.BridgePattern;

public class Client {
    public static void main(String[] args) {
        VideoFile file = new AVIFile();
        OperateSystem system = new MAC(file);
        system.play("吴京");
    }
}
