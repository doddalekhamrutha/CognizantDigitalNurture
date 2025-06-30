package com.example;

public class Student {
    private String name;
    private int[] marks;

    public Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public double getAverage() {
        if (marks == null || marks.length == 0) {
            throw new IllegalArgumentException("Marks cannot be empty");
        }
        int sum = 0;
        for (int m : marks) {
            sum += m;
        }
        return sum / (double) marks.length;
    }
}
