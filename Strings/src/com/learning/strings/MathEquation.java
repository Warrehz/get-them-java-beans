package com.learning.strings;

public class MathEquation {
    private double leftVal;
    private double rightVal;
    private char opCode;
    private double result;

    private static int numberOfCalculations;
    private static double sumOfResults;

    public MathEquation() {}

    public MathEquation(char opCode) {
        this.opCode = opCode;
    }

    public MathEquation(double leftVal, char opCode, double rightVal) {
        this(opCode);
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }

    void execute() {

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

        numberOfCalculations++;
        sumOfResults += result;

    }

    public double getResult() {
        return this.result;
    }

    public static double getAverageResult() {
        return sumOfResults / numberOfCalculations;
    }

}
