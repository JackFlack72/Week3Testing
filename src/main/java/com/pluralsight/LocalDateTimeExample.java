package com.pluralsight;

import java.time.LocalDateTime;

public class LocalDateTimeExample {
    public static void main(String[] args) {
        LocalDateTime rightNow = LocalDateTime.now();
        System.out.println("Right now it is: "+rightNow);
    }
}
