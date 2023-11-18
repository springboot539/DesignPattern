package com.example.designpattern.Behavioralpattern.IteratorMethod;

public class Client {
    public static void main(String[] args) {
        Student student = new Student("张三","1");
        Student student1 = new Student("李四","2");
        Student student2 = new Student("王五","3");

        StudentAggregateImpl studentAggregate = new StudentAggregateImpl();
        studentAggregate.addStudent(student);
        studentAggregate.addStudent(student1);
        studentAggregate.addStudent(student2);
        StudentIteratorImpl studentIterator = (StudentIteratorImpl) studentAggregate.getStudentIterator();
        while (studentIterator.hasNext()) {
            System.out.println(studentIterator.next());
        }

    }
}
