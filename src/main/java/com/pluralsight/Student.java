package com.pluralsight;

public class Student {
    private int studentId;
    private String firstName;
    private String lastName;
    private String major;

    public Student(int studentId, String firstName, String lastName, String major) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.major = major;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMajor() {
        return major;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("studentId=").append(studentId);
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", major='").append(major).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
