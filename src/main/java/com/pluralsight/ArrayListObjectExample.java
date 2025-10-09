package com.pluralsight;

import java.util.ArrayList;

public class ArrayListObjectExample {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Student student1 = new Student(1, "Kanye", "West", "Music");
        students.add(student1);
        students.add(new Student(2, "Michael", "Jordan", "NBA"));

        System.out.println(students);

    }
}
