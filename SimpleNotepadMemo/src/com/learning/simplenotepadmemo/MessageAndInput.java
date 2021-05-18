package com.learning.simplenotepadmemo;

import java.util.Scanner;

public class MessageAndInput {

    public String ask(String question) {
        String answer = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println(question);
        if (scanner.hasNextLine()) {
            answer = scanner.nextLine();
        }
        return answer;
    }
}
