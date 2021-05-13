package com.learning.simplenotepadmemo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class WriteToFile {

    public void appendToFile(FileWriter file, String memo) {

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(file, true);
            bufferedWriter.write(memo);
            bufferedWriter.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }



    }

}
