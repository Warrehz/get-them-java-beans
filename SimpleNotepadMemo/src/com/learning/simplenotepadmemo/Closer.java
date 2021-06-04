package com.learning.simplenotepadmemo;

public class Closer extends ProcessChoiceBase {

    @Override
    public void process(String filePath) {
        System.out.println("Closing...");
    }

    @Override
    public String getKeyword() {
        return "close";
    }

}
