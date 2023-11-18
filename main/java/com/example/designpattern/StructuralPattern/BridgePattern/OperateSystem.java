package com.example.designpattern.StructuralPattern.BridgePattern;

public abstract class OperateSystem {

    //声明实现化角色
    protected VideoFile videoFile;

    public OperateSystem(VideoFile videoFile) {
        this.videoFile = videoFile;
    }

    public abstract void play(String videoName);

    public abstract void stop();
}
