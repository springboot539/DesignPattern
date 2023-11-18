package com.example.designpattern.Behavioralpattern.ResponsibilityMethod;

/**
 * 请假条类
 */
public class LeaveRequest {

    private String name;

    private int days;

    public String getName() {
        return name;
    }

    public int getDays() {
        return days;
    }

    public String getContent() {
        return content;
    }

    public LeaveRequest(String name, int days, String content) {
        this.name = name;
        this.days = days;
        this.content = content;
    }

    /**
     * 请假条内容
     */
    private String content;
}
