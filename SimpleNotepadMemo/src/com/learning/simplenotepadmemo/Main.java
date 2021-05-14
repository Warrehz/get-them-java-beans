package com.learning.simplenotepadmemo;

public class Main {

    public static void main(String[] args) {

        execute();

    }

    static void execute() {

        MessageAndInput messageAndInput = new MessageAndInput();

        String memo = messageAndInput.ask("What memo would you like to jot down?");

        WriteToFile writeToFile = new WriteToFile();

        writeToFile.appendToFile(memo);
    }
}
