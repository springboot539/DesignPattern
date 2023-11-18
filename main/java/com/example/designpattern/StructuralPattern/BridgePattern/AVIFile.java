package com.example.designpattern.StructuralPattern.BridgePattern;

/**
 *  具体实现化角色
 */
public class AVIFile implements VideoFile{
    public void decode(String fileName) {
        System.out.println("AVI 视频文件 fileName :" + fileName);
    }
}
