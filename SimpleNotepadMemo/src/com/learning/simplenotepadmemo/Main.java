package com.learning.simplenotepadmemo;

public class Main {

    public static void main(String[] args) {

        execute();

    }

    static void execute() {


        String filePath = new MessageAndInput().ask("What is your selected file path?");

        MemoFile memoFile = new MemoFile(filePath);

        memoFile.getMemos();

        String memo = new MessageAndInput().ask("What memo would you like to jot down?");

        WriteToFile writeToFile = new WriteToFile();

        writeToFile.appendToFile(memo, memoFile.getFilePath());
    }
}
