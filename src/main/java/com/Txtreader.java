package com;

import java.io.BufferedReader; 
import java.io.FileReader; 
import java.io.IOException;

import java.util.ArrayList;

public class Txtreader {
    
    public ArrayList<ArrayList<String>> readTxTFile(String filename) {
        ArrayList<ArrayList<String>> list = new ArrayList<ArrayList<String>>();
        ArrayList<String> words = new ArrayList<String>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");
                for (String part : parts) {
                    words.add(part);
                }
                list.add(words);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

}

