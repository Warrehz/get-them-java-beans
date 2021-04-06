package com.learning.organized;

public class Main {

    public static void main(String[] args) {
        System.out.println("This is a test.");

        ifTest(5, 2);
        ifTest(3, 8);
    }

    public static void ifTest(int a, int b) {
        System.out.println((a > b ? a : b) + " is the larger number.");
    }
}
