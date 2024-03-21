package com;

import java.io.BufferedReader; 
import java.io.FileReader; 
import java.io.IOException;
import java.util.ArrayList;

public class Txtreader {
    
    public ArrayList<String> readTxTFile(String filename) {
        ArrayList<String> list = new ArrayList<String>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] splitWords = line.split(" ");
                
                for (String word : splitWords) {
                    list.add(word.trim());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}
