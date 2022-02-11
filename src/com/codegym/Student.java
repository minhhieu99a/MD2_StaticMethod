package com.codegym;

public class Student {
    private int rollno;
    private String name;
    private static String college = "Codegym Huế";

    Student(int r, String n) {
        rollno = r;
        name = n;
    }

    static void change() {
        college = "Codegym Moncity";
    }

    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}
