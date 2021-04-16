package com.learning.strings;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // executeInteractively();

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
        System.out.println();

        // example using array of custom class type
        performOperation();

    }

    static void executeInteractively() {
        System.out.println("Enter an interaction and two numbers.");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        String[] parts = userInput.split(" ");
    }

    public static void performOperation() {

        MathEquation[] equations = new MathEquation[4];
        equations[0] = create(10.0d, 5.0d, 'a');
        equations[1] = create(33.0d, 55.0d, 's');
        equations[2] = create(1.0d, 5.0d, 'd');
        equations[3] = create(123.0d, 2.0d, 'm');

        for (MathEquation equation : equations) {
            equation.execute();
            System.out.println("Result: " + equation.result);
        }

    }

    private static MathEquation create(double leftVal, double rightVal, char opCode) {
        MathEquation equation = new MathEquation();
        equation.leftVal = leftVal;
        equation.rightVal = rightVal;
        equation.opCode = opCode;
        return equation;
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
