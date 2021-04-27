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

        // using execute overloads
        System.out.println();
        MathEquation equationOverload = new MathEquation('d');
        double leftDouble = 9.0d;
        double rightDouble = 4.0d;
        equationOverload.execute(leftDouble, rightDouble);
        System.out.println("Overloaded result with doubles: " + equationOverload.getResult());
        System.out.println();

        // seeing how automatic conversion works
        int leftInt = 9;
        int rightInt = 4;
        equationOverload.execute(leftInt, rightInt);
        System.out.println("Overloaded result with automatic conversion for ints: " + equationOverload.getResult());
        System.out.println();

        // using derived classes
        Divider divider = new Divider();
        doCalculation(divider, 100.0d, 50.0d);
        Multiplier multiplier = new Multiplier();
        doCalculation(multiplier, 3.0d, 2.0d);
        Subtracter subtracter = new Subtracter();
        doCalculation(subtracter, 333.0d, 2918.0d);
        Adder adder = new Adder();
        doCalculation(adder, 66.0d, 34.0d);

        // with CalculateBase being abstract
        performMoreCalculations();

    }

    private static CalculateBase createCalculation(MathOperation operation, double leftVal, double rightVal) {
        CalculateBase calculation = null;
        switch(operation) {
            case ADD:
                calculation = new Adder(leftVal, rightVal)
                break;
            case SUBTRACT:
                calculation = new Subtracter(leftVal, rightVal);
                break;
            case DIVIDE:
                calculation = new Divider(leftVal, rightVal);
                break;
            case MULTIPLY:
                calculation = new Multiplier(leftVal, rightVal);
                break;
        }
        return calculation;
    }

    private static void performMoreCalculations() {
        CalculateBase[] calculations = {
                new Divider(10.0d, 2.0d),
                new Adder(3.0d, 1.0d),
                new Subtracter(-123.0d, -23.0d),
                new Multiplier(50.0d, 2.0d)
        };

        System.out.println();
        System.out.println("Array calculations");

        for (CalculateBase calculation : calculations) {
            calculation.calculate();
            System.out.println("Result: " + calculation.getResult() );
        }
    }

    static void doCalculation(CalculateBase calculation, double leftVal, double rightVal) {
        calculation.setLeftVal(leftVal);
        calculation.setRightVal(rightVal);
        calculation.calculate();
        System.out.println("Calculation result: " + calculation.getResult());
    }

    static void executeInteractively() {
        System.out.println("Enter an interaction and two numbers.");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        String[] parts = userInput.split(" ");
    }

    public static void performOperation() {

        MathEquation[] equations = new MathEquation[4];
        equations[0] = new MathEquation(10.0d, 'a', 5.0d);
        equations[1] = new MathEquation(33.0d, 's', 55.0d);
        equations[2] = new MathEquation(1.0d, 'd', 5.0d);
        equations[3] = new MathEquation(123.0d, 'm', 2.0d);

        for (MathEquation equation : equations) {
            equation.execute();
            System.out.println("Result: " + equation.getResult());
        }

        System.out.println("Average of Results: " + MathEquation.getAverageResult());

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
