package com.learning.simplenotepadmemo;

public class Main {

    public static void main(String[] args) {

        execute();

    }

    static void execute() {

        MessageAndInput messageAndInput = new MessageAndInput();

        String filePath = messageAndInput.ask("What is your selected file path?");

        String action = messageAndInput.ask("What would you like to do? Your options are: " +
                "\n > view memos \n > add memo \n > delete memo \n > close program");


        MemoFile memoFile = new MemoFile(filePath);

        memoFile.getMemos();

        String memo = messageAndInput.ask("What memo would you like to jot down?");

        WriteToFile writeToFile = new WriteToFile();

        writeToFile.appendToFile(memo, memoFile.getFilePath());
    }
}
