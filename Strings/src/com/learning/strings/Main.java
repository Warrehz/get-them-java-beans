package com.learning.strings;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        executeInteractively();
    }

    static void executeInteractively() {
        System.out.println("Enter an interaction and two numbers.");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        String[] parts = userInput.split(" ");
        performOperation(parts);
    }

    public static void performOperation(String[] parts) {
        char opCode = opCodeFromString(parts[0]);
        char symbol = symbolFromOpCode(opCode);
        double leftVal = valueFromWord(parts[1]);
        double rightVal = valueFromWord(parts[2]);
        double result = execute(opCode, leftVal, rightVal);
        displayResult(leftVal, symbol, rightVal, result);
    }

    private static void displayResult(double leftVal, char symbol, double rightVal, double result) {

        StringBuilder sb = new StringBuilder();

        sb.append(leftVal + " " + symbol + " " + rightVal + " = " + result);

        System.out.println(sb.toString());

    }

    public static char symbolFromOpCode(char opCode) {
        char[] opCodes = {'a', 's', 'm', 'd'};
        char[] symbols = {'+', '-', '*', '/'};
        char symbol = ' ';

        for (int index = 0; index < opCodes.length; index++) {
            if (opCode == opCodes[index]) {
                symbol = symbols[index];
                break;
            }
        }

        return symbol;
    }

    public static double execute(char opCode, double leftVal, double rightVal) {

        double result = 0.0d;

        switch (opCode) {
            case 'a':
                result = leftVal + rightVal;
                break;
            case 's':
                result = leftVal - rightVal;
                break;
            case 'm':
                result = leftVal * rightVal;
                break;
            case 'd':
                if (rightVal != 0) {
                    result = leftVal / rightVal;
                } else {
                    result = 0.0d;
                    System.out.println("Cannot divide by zero.");
                }
                break;
        }

        return result;

    }

    public static char opCodeFromString(String operationName) {
        return operationName.charAt(0);
    }

    public static double valueFromWord(String word) {
        String[] numberWords = {
            "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"
        };

        double value = 0d;

        for (int index = 0; index < numberWords.length; index++) {
            if (word.equals(numberWords[index])) {
                value = index;
                break;
            }
        }

        return value;

    }


}
