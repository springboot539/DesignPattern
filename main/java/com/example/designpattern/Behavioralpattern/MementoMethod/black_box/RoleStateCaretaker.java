package com.example.designpattern.Behavioralpattern.MementoMethod.black_box;

/**
 * 备忘录管理者
 */
public class RoleStateCaretaker {

    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
