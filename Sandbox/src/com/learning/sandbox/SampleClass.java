package com.learning.sandbox;

public class SampleClass {
    private int field1;
    private char field2;
    private String[] field3;

    public SampleClass(int firstArg, char secondArg, String[] thirdArg) {

        this.field1 = firstArg;
        this.field2 = secondArg;
        this.field3 = thirdArg.clone();

    }

    public int getField1() {
        return field1;
    }

    public void setField1(int num) {
        field1 = num;
    }

    public char getField2() {
        return field2;
    }

    public void setField2(char singleChar) {
        field2 = singleChar;
    }

    public String[] getField3() {
        return field3;
    }

    public void setField3(String[] field3) {
        this.field3 = field3.clone();
    }

}
