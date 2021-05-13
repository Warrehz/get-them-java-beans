package com.learning.simplenotepadmemo;

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

            File file = new File("/Users/warrehz/Desktop/Test1.txt");

            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fileWriter  = new FileWriter(file, true);

            bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write(memo);
            bufferedWriter.newLine();

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
