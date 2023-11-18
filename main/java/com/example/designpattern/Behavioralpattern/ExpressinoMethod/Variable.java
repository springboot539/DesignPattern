package com.example.designpattern.Behavioralpattern.ExpressinoMethod;

public class Variable extends AbstractMethod {

    private String name;

    public Variable(String name) {
        this.name = name;
    }

    public int interpret(Context context) {
        return context.getVariable(this);
    }

    @Override
    public String toString() {
        return name;
    }
}
