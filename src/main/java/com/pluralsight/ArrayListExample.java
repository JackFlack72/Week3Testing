package com.pluralsight;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> studentNames = new ArrayList<>();
        studentNames.add("Lucas");
        studentNames.add("Catrina");
        studentNames.add("Nam Kiet");
        studentNames.add("Fatinur");
        studentNames.add("Mario");

        System.out.println(studentNames);
/* Output:
[Lucas, Catrina, Nam Kiet, Fatinur, Mario]
*/

/*
        studentNames.remove(2)

This will remove the second element in the array
*/

        for (String studentName: studentNames) {
            System.out.println(studentName);
/* Output:
Lucas
Catrina
Nam Kiet
Fatinur
Mario
*/
        }

    }
}
