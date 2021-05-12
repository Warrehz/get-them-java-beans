package com.learning.simplenotepadmemo;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, what memo do you have to write down?");

        String memo = scanner.nextLine();

        scanner.close();

        System.out.println(memo);

        BufferedWriter bufferedWriter = null;

        try {

            File file = new File("/Users/warrehz/Desktop/Test1.rtf");

            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fileWriter  = new FileWriter(file);

            bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write(memo);

            System.out.println("Successfully wrote to file.");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {

                if (bufferedWriter != null) {
                    bufferedWriter.close();
                }

            } catch (Exception ex) {
                System.out.println("Error in closing BufferedWriter" + ex);
            }

        }


    }
}
