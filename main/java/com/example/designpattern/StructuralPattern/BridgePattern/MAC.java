package com.example.designpattern.StructuralPattern.BridgePattern;

public class MAC extends OperateSystem{


    public MAC(VideoFile videoFile) {
        super(videoFile);
    }

    public void play(String videoName) {
        videoFile.decode(videoName);
        System.out.println("MAC解码完成 ，播放 file ：" + videoName);
    }

    public void stop() {

    }
}
