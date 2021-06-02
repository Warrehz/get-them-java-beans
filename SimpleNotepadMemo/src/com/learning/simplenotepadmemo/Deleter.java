package com.learning.simplenotepadmemo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalTime;
import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;

public class Deleter extends ProcessChoiceBase {

    @Override
    public void process(String filePath) {

        ArrayList<String> memos = new ArrayList<>();

        try {

            File file = new File(filePath);

            if (!file.exists()) {
                file.createNewFile();
            }

            Scanner reader = new Scanner(file);

            while(reader.hasNext()) {
                memos.add(reader.nextLine());
            }

            reader.close();
            int index = 0;

            for(String memo : memos) {
                System.out.println(++index + ": " + memo);
            }

            String answer = new MessageAndInput().ask("\nIndicate the memo # you'd like to delete.");

            int memoNumber = Integer.parseInt(answer);

            // remove the selected memo
            memos.remove(--memoNumber);

            // delete old file
            file.delete();

            // create localtime
            LocalTime time = LocalTime.now();

            // append localtime to filepath
            String newFilePath = filePath.substring(0, filePath.length() - 4) + time + ".txt";

            File newFile = new File(newFilePath);

            // create new file
            file.createNewFile();

            BufferedWriter bufferedWriter = null;
            FileWriter fileWriter = new FileWriter(newFile);
            bufferedWriter = new BufferedWriter(fileWriter);

            for(String memo : memos) {
                bufferedWriter.write(memo);
                bufferedWriter.newLine();
            }

            bufferedWriter.close();

        } catch(IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public String getKeyword() {
        return "delete";
    }

}
