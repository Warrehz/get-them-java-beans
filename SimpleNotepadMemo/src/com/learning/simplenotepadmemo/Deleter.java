package com.learning.simplenotepadmemo;

import java.io.IOException;
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

            System.out.println("\nSelect the memo you'd like to delete by entering the memo number:");


        } catch(IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public String getKeyword() {
        return "delete";
    }

}
