package com.learning.simplenotepadmemo;

import java.util.Scanner;

public class MessageAndInput {

    public String ask(String question) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(question);
        String answer = scanner.nextLine();
        scanner.close();
        return answer;

    }

}
