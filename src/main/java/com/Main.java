package com;

import java.util.ArrayList;

public class Main {
    
    public void main(String[] args) {
        Txtreader reader = new Txtreader();
        ArrayList<ArrayList<String>> list = reader.readTxTFile("Data.txt");
        System.out.println(list);
    }
}