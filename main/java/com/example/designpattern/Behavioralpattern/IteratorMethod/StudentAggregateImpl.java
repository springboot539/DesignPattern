package com.example.designpattern.Behavioralpattern.IteratorMethod;

import java.util.ArrayList;
import java.util.List;

public class StudentAggregateImpl implements StudentAggregate{

    private List<Student> stuList;

    public void addStudent(Student student) {
        if(stuList == null){
            stuList = new ArrayList<Student>();
        }
        stuList.add(student);
    }

    public void removeStudent(Student student) {
        if(!stuList.isEmpty() && stuList.contains(student)){
            stuList.remove(student);
        }
    }

    public StudentIterator getStudentIterator() {
        return new StudentIteratorImpl(stuList);
    }
}
