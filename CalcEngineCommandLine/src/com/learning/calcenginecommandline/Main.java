package com.learning.calcenginecommandline;

public class Main {

    public static void main(String[] args) {

        if (args.length != 3) {
            System.out.println("Invalid number of arguments.");
        } else {

            double valueOne = Double.parseDouble(args[0]);
            char opCode = args[1].charAt(0);
            double valueTwo = Double.parseDouble(args[2]);

            switch (opCode) {
                case '+':
                    System.out.println(valueOne + valueTwo);
                    break;
                case '-':
                    System.out.println(valueOne - valueTwo);
                    break;
                case 'x':
                    System.out.println(valueOne * valueTwo);
                    break;
                case '/':
                    if (valueTwo != 0) {
                        System.out.println(valueOne / valueTwo);
                    } else {
                        System.out.println("Cannot divide by zero.");
                    }
                    break;

            }

        }



    }
}
