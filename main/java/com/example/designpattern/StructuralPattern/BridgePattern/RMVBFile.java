package com.example.designpattern.StructuralPattern.BridgePattern;

/**
 *  具体实现化角色
 */
public class RMVBFile implements VideoFile{
    public void decode(String fileName) {
        System.out.println("RMVB 视频文件 fileName :" + fileName);
    }
}
