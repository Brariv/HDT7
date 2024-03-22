package com;

import java.io.BufferedReader; 
import java.io.FileReader; 
import java.io.IOException;

import java.util.ArrayList;

public class Txtreader {
    
    public ArrayList<ArrayList<String>> readTxTData(String filename) {
        ArrayList<ArrayList<String>> list = new ArrayList<ArrayList<String>>();
        
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                ArrayList<String> words = new ArrayList<String>();
                String[] parts = line.split(" ");
                for (String part : parts) {
                    part = part.replace(",", "");
                    part = part.replace(" ", "");
                    if (part.contains("(")){
                        part = part.replace("(", "");
                    } else if (part.contains(")")){
                        part = part.replace(")", "");
                    }
                    words.add(part);
                }
                list.add(words);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public ArrayList<String> readTxTFile(String filename) {
        ArrayList<String> list = new ArrayList<String>();
        
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");
                for (String part : parts) {
                    
                    list.add(part.toLowerCase());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

}

