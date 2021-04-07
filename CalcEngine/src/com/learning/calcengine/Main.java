package com.learning.calcengine;

public class Main {

    public static void main(String[] args) {
        double valueOne = 5;
        double valueTwo = 0;
        double result;
        char opCode = 'd';

        if (opCode == 'a') {
            result = valueOne + valueTwo;
        } else if (opCode == 's') {
            result = valueOne - valueTwo;
        } else if (opCode == 'm') {
            result = valueOne * valueTwo;
        } else if (opCode == 'd') {
            if (valueTwo != 0) {
                result = valueOne / valueTwo;
            } else {
                System.out.println("Cannot divide by zero.");
                result = 0.00d;
            }
        } else {
            System.out.println("Invalid opCode: " + opCode);
            result = 0.00d;
        }

        System.out.println("Result: " + result);

    }
}
