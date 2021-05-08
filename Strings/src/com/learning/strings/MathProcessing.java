package com.learning.strings;

public interface MathProcessing {
    String SEPARATOR = " ";
    String getKeyword();
    double doCalculation(double leftVal, double rightVal);
    String getFormattedOutput();
}
