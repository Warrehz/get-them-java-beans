package com.learning.strings;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        executeInteractively();

        // formatting example
        int valueOne = 123;
        int valueTwo = 9872;
        int valueThree = 26;
        int valueFour = 5;
        String s1 = String.format("A:%d, B:%d", valueOne, valueFour);
        String s2 = String.format("C:%d, D:%d", valueTwo, valueThree);
        System.out.println();
        System.out.println(s1);
        System.out.println(s2);
        String s3 = String.format("A:%5d, B:%5d", valueOne, valueFour);
        String s4 = String.format("C:%5d, D:%5d", valueTwo, valueThree);
        System.out.println();
        System.out.println(s3);
        System.out.println(s4);
        String s5 = String.format("A:%05d, B:%05d", valueOne, valueFour);
        String s6 = String.format("C:%05d, D:%05d", valueTwo, valueThree);
        System.out.println();
        System.out.println(s5);
        System.out.println(s6);
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

        MathEquation[] equations = new MathEquation[4];
        equations[0] = create(10.0d, 5.0d, 'a');
        equations[0] = create(33.0d, 55.0d, 's');
        equations[0] = create(1.0d, 5.0d, 'd');
        equations[0] = create(123.0d, 874.0d, 'm');

        if (opCode == 'w') {
            handleWhen(parts);
        } else {
            char symbol = symbolFromOpCode(opCode);
            double leftVal = valueFromWord(parts[1]);
            double rightVal = valueFromWord(parts[2]);
            double result = execute(opCode, leftVal, rightVal);
            displayResult(leftVal, symbol, rightVal, result);
        }
    }

    private static MathEquation create(double leftVal, double rightVal, char opCode) {
        MathEquation equation = new MathEquation();
        equation.leftVal = leftVal;
        equation.rightVal = rightVal;
        equation.opCode = opCode;
        return equation;
    }

    private static void handleWhen(String[] parts) {
        LocalDate startDate = LocalDate.parse(parts[1]);
        long daysToAdd = (long) valueFromWord(parts[2]);
        LocalDate newDate = startDate.plusDays(daysToAdd);
        String output = String.format("%s plus %d days is %s", startDate, daysToAdd, newDate);
        System.out.println(output);
    }

    private static void displayResult(double leftVal, char symbol, double rightVal, double result) {

        /* StringBuilder string = new StringBuilder();
        string.append(leftVal + " " + symbol + " " + rightVal + " = " + result);
        System.out.println(string.toString()); */

        String output = String.format("%.3f %c %.3f = %.3f", leftVal, symbol, rightVal, result);
        System.out.println(output);

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

        double value = -1d;

        for (int index = 0; index < numberWords.length; index++) {
            if (word.equals(numberWords[index])) {
                value = index;
                break;
            }
        }

        if (value == -1d) {
            value = Double.parseDouble(word);
        }

        return value;

    }


}
