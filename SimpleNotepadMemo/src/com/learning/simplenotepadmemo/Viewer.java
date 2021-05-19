package com.learning.simplenotepadmemo;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Viewer extends ProcessChoiceBase {


    @Override
    public void process(String filePath) {

        ArrayList<String> memos = new ArrayList<>();

        try {
            File file = new File(filePath);

            if (!file.exists()) {
                file.createNewFile();
            }

            Scanner reader = new Scanner(file);

            while (reader.hasNextLine()) {
                memos.add(reader.nextLine());
            }

            reader.close();
            int index = 0;

            for (String memo : memos) {
                System.out.println(++index + ": " + memo);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public String getKeyword() {
        return "view";
    }

}
