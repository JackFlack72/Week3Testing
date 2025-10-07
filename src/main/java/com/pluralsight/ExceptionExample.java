package com.pluralsight;

public class ExceptionExample {
    public static void main(String[] args) {
        String[] students = {"Mario, Malika, Mateo, Nam Kiet, Lucas"};
/*
        for (String studentName: students) {
            System.out.println(studentName);
        }
*/
        try {
            System.out.println(students[7]);
        }catch(Exception exception) {
            System.out.println("Oops!");
/*
            System.out.println(exception.toString());
            exception.printStackTrace();
*/
        }
    }
}
