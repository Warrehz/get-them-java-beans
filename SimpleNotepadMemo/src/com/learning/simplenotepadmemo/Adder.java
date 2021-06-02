package com.learning.simplenotepadmemo;

public class Adder extends ProcessChoiceBase {

    @Override
    public void process(String filePath) {

        try {

            WriteToFile writeToFile = new WriteToFile();

            String memo = new MessageAndInput().ask("Please enter your memo.");

            writeToFile.appendToFile(memo, filePath);

        } catch(Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public String getKeyword() {
        return "add";
    }

}
