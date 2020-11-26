package com;

public class Student {
    String name;
    private int age;
    private double mark;


    public Student(String name, int age, double mark) {
        this.name = name;
        this.age = age;
        this.mark = mark;
    }

    public double getMark() {
        return mark;
    }

    public String getName() {
        return name;
    }
}
