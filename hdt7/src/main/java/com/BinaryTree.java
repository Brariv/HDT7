package com;



public class BinaryTree {

    private Nodo root;

    public BinaryTree() {
        root = null;
    }

    public void insert(String[] word) {
        root = insertRec(root, word);
    }

    private Nodo insertRec(Nodo current, String[] value) {
        if (current == null) {
            return new Nodo(value);
        }
        if (value[0].compareTo(current.getWords()[0]) < 0) {
            current.left = insertRec(current.left, value);
        } else if (value[0].compareTo(current.getWords()[0]) > 0) {
            current.right = insertRec(current.right, value);
        } else {
            return current;
        }

        return current;
    }

    public void inorder() {
        inorderRec(root);
    }

    private void inorderRec(Nodo root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.getWords()[0] + " " + root.getWords()[1]);
            inorderRec(root.right);
        }
    }

    public String[] searchString(String word) {
        return searchRec(root, word);
    }

    private String[] searchRec(Nodo root, String word) {
        if (root == null) {
            String Nada = "*"+word+"*";
            String[] NA = {word, Nada};
            return NA;
        }
        if (root.getWords()[0].equals(word)) {
            return root.getWords();
        }
        if (word.compareTo(root.getWords()[0]) < 0) {
            return searchRec(root.left, word);
        }
        return searchRec(root.right, word);
    }

    
}
