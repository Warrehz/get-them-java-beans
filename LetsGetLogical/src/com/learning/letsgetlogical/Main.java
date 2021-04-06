package com.learning.letsgetlogical;

public class Main {

    public static void main(String[] args) {
        int students = 150;
        int rooms = 0;

        if (rooms != 0 && students / rooms > 30) {
            System.out.println("Seems crowded.");
        } else {
            System.out.println("No rooms.");
        }
    }
}
