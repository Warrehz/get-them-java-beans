package com.learning.strings;

public class PowerOf implements MathProcessing {

    @Override
    public String getKeyword() {
        return "power";
    }

    @Override
    public double doCalculation(double leftVal, double rightVal) {
        return Math.pow(leftVal, rightVal);
    }
}
