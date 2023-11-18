package com.example.designpattern.StructuralPattern.BridgePattern;

public class Windows extends OperateSystem{


    public Windows(VideoFile videoFile) {
        super(videoFile);
    }

    public void play(String videoName) {
        videoFile.decode(videoName);
        System.out.println("Windows解码完成 ，播放 file ：" + videoName);
    }

    public void stop() {

    }
}
