package com.learning.calcengine;

public class Main {

    public static void main(String[] args) {

        System.out.println("Result: " + calcEngine(2.00, 'a', 6.54));
        System.out.println("Result: " + calcEngine(1, 's', 1));
        System.out.println("Result: " + calcEngine(19837, 'm', 32));
        System.out.println("Result: " + calcEngine(15, 'd', 3));

        factorial(3);
        factorial(7);

        sumIntArrayOfFive(1 ,2 , 3, 4, 5);

        calcEngineWithArrays();

        System.out.println("Result: " + numTimesFive(100));

        }

        public static int numTimesFive(int valueOne) {
            return valueOne * 5;
        }

        public static void calcEngineWithArrays() {

            double[] leftVals = {10.0d, 4.0d, 125.0d, 33.0d};
            double[] rightVals = {3.0d, 69.0d, 666.0d, 10.0d};
            char[] opCodes = {'+', '-', '*', '/'};
            double[] results = new double[opCodes.length];

            for (int i = 0; i < opCodes.length; i++) {

                switch (opCodes[i]) {
                    case '+':
                        results[i] = leftVals[i] + rightVals[i];
                        break;
                    case '-':
                        results[i] = leftVals[i] - rightVals[i];
                        break;
                    case '*':
                        results[i] = leftVals[i] * rightVals[i];
                        break;
                    case '/':
                        if (rightVals[i] != 0) {
                            results[i] = leftVals[i] / rightVals[i];
                        } else {
                            System.out.println("Cannot divide by zero.");
                        }
                        break;
                    default:
                        System.out.println("Invalid opCode. Try again.");
                        results[i] = 0.00d;
                        break;
                }

            }

            for (double result : results) {

                System.out.println("Result: " + result);

            }

        }

        public static void sumIntArrayOfFive(int valueOne,
                                             int valueTwo,
                                             int valueThree,
                                             int valueFour,
                                             int valueFive) {

            int[] nums = new int[] {valueOne, valueTwo, valueThree, valueFour, valueFive};

            int result = 0;

            for (int num : nums) {
                result += num;
            }

            System.out.println("Result: " + result);

        }

        public static void factorial(int valueOne) {

            int result = 1;

            while(valueOne > 1) {

                result *= valueOne;
                valueOne--;

            }

            System.out.println("Result: " + result);

        }

        public static double calcEngine(double valueOne, char operator, double valueTwo) {

            double result = 0.00d;

            switch (operator) {
                case 'a':
                    result = valueOne + valueTwo;
                    break;
                case 's':
                    result = valueOne - valueTwo;
                    break;
                case 'm':
                    result = valueOne * valueTwo;
                    break;
                case 'd':
                    if (valueTwo != 0) {
                        result = valueOne / valueTwo;
                    } else {
                        System.out.println("Cannot divide by zero.");
                    }
                    break;
                default:
                    System.out.println("Invalid opCode. Try again.");
                    result = 0.00d;
                    break;
            }

        return result;

        /*if (opCode == 'a') {
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

        System.out.println("Result: " + result);*/

    }
}
