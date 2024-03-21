package com;

import java.util.ArrayList;

public class Association {
    
    public void createAssociation(ArrayList<ArrayList<String>> Data, BinaryTree tree) {
        

        for (int i = 0; i < Data.size(); i++){
            String[] words = (String[]) Data.get(i).toArray(); 
            tree.insert(words);
        }
        
        
    }
}
