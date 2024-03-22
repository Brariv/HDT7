package com;

import java.util.ArrayList;

public class Association {
    
    public void automaticAssociation(ArrayList<ArrayList<String>> Data, BinaryTree tree) {
        

        for (int i = 0; i < Data.size(); i++){
            String[] words = {Data.get(i).get(0), Data.get(i).get(1)};
            tree.insert(words);
        }
        
        
    }

    public void manualAssociation(String English, String Spanish, BinaryTree tree) {
        String[] words = {English, Spanish};
        tree.insert(words);
    }

    public String searchWord(String word, BinaryTree tree) {
        
        String resultado;
        resultado = tree.searchString(word.toLowerCase())[1];
        
        return resultado;
    }

}
