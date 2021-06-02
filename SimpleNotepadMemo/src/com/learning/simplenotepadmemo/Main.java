package com.learning.simplenotepadmemo;

public class Main {

    public static void main(String[] args) {

        execute();

    }

    static void execute() {
        // class to provide message and receive user input
        MessageAndInput messageAndInput = new MessageAndInput();

        // store the user input for file location
        String filePath = messageAndInput.ask("What is your selected file path?");

        // helper that will execute work based on user choice
        DynamicHelper helper = new DynamicHelper(new ProcessChoiceBase[]{
                new Viewer(),
                new Deleter(),
                new Adder()
        }, filePath);

        // give user a choice of action
        String action = messageAndInput.ask("What would you like to do? Your options are: " +
                "\n > view memos \n > add memo \n > delete memo \n > close program");

        // execute choice
        helper.process(action);

    }
}
