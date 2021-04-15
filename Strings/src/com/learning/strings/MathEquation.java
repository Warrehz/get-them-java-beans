package com.learning.strings;

public class MathEquation {
    double leftVal;
    double rightVal;
    char opCode;
    double result;

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

    }
}
