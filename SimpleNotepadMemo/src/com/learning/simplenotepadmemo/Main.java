package com.learning.simplenotepadmemo;

public class Main {

    public static void main(String[] args) {

        execute();

    }

    static void execute() {

        MemoFile memoFile = new MemoFile("/Users/warrehz/Desktop/Test1.txt");

        memoFile.getMemos();

        System.out.println("");

        MessageAndInput messageAndInput = new MessageAndInput();

        String memo = messageAndInput.ask("What memo would you like to jot down?");

        WriteToFile writeToFile = new WriteToFile();

        writeToFile.appendToFile(memo, memoFile.getFilePath());
    }
}
