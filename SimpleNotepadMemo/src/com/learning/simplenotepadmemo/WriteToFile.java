package com.learning.simplenotepadmemo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class WriteToFile {

    public void appendToFile(String memo) {

        BufferedWriter bufferedWriter = null;

        try {

            File file = new File("/Users/warrehz/Desktop/Test1.txt");

            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fileWriter = new FileWriter(file, true);

            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(memo);
            bufferedWriter.newLine();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                }
            } catch(Exception ex) {
                System.out.println("Error in closing bufferedWriter.");
            }
        }
    }
}
