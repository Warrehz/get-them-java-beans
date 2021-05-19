package com.learning.simplenotepadmemo;

public abstract class ProcessChoiceBase {

    String choice;

    public String getChoice() {
        return choice;
    }

    public abstract String getKeyword();

    public abstract void process(String filePath);

}


