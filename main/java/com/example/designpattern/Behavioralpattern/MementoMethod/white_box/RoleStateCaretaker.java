package com.example.designpattern.Behavioralpattern.MementoMethod.white_box;

/**
 * 备忘录管理者
 */
public class RoleStateCaretaker {

    private RoleStateMemento memento;

    public void setMemento(RoleStateMemento memento) {
        this.memento = memento;
    }

    public RoleStateMemento getMemento() {
        return memento;
    }
}
