package com.learning.calcengine;

public class Main {

    public static void main(String[] args) {
        double valueOne = 5;
        double valueTwo = 5;
        double result;
        char opCode = 'a';

        if (opCode == 'a') {
            result = valueOne + valueTwo;
        } else if (opCode == 's') {
            result = valueOne - valueTwo;
        } else if (opCode == 'm') {
            result = valueOne * valueTwo;
        } else if (opCode == 'd') {
            result = valueOne / valueTwo;
        } else {
            result = 0.00d;
        }

        System.out.println("Result: " + result);

    }
}
