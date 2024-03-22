package com;


class Nodo {
    
    //create an array of 2 elements with strings
    String[] words = new String[2];
    Nodo left;
    Nodo right;


    public Nodo(String[] word) {
        words = word;
        this.left = null;
        this.right = null;
    }

    public String[] getWords() {
        return words;
    }

    public void setWords(String[] words) {
        this.words = words;
    }




}
