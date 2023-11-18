package com.example.designpattern.Behavioralpattern.ExpressinoMethod;

import java.util.HashMap;
import java.util.Map;

public class Context {

    private Map<Variable, Integer> map = new HashMap<Variable, Integer>();

    public void accept(Variable var, Integer i) {
        map.put(var, i);
    }

    public int getVariable(Variable var) {
        return map.get(var);
    }
}
