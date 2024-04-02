package com;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuUi {

    Scanner scanner = new Scanner(System.in);
    Txtreader reader = new Txtreader();
    BinaryTree tree = new BinaryTree();
    Association association = new Association();

    
    public void showMenu() {
        System.out.println("Ingresar path del archivo de la base de datos:");
        String path = scanner.nextLine();
        //remove quotes
        path = path.replaceAll("\"", "");
        ArrayList<ArrayList<String>> list = reader.readTxTData(path);
        association.automaticAssociation(list, tree);
        int option = 0;

        while (option != 5) {
            
        
            System.out.println("1. Leer archivo de texto para traducciones");
            System.out.println("2. Ingresar traducción manual");
            System.out.println("3. Buscar traducción");
            System.out.println("4. Mostrar todas las traducciones");
            System.out.println("5. Salir");

            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Ingresar path del archivo de texto:");
                    String path2 = scanner.nextLine();
                    path2 = scanner.nextLine();
                    path2 = path2.replaceAll("\"", "");
                    ArrayList<String> file = reader.readTxTFile(path2);
                    String resultado = "";
                    for (String word : file) {
                        resultado = resultado + association.searchWord(word, tree);
                        resultado = resultado + " ";
                    }
                    System.out.println(resultado);
                    break;
                case 2:
                    System.out.println("Ingresar palabra en inglés:");
                    String english = scanner.nextLine();
                    english = scanner.nextLine();
                    System.out.println("Ingresar traduccion en español:");
                    String spanish = scanner.nextLine();
                    association.manualAssociation(english.toLowerCase(), spanish.toLowerCase(), tree);
                    break;
                case 3:
                    System.out.println("Ingresar palabra en inglés:");
                    String word = scanner.nextLine();
                    word = scanner.nextLine();
                    System.out.println("La traduccion a espanol es: " + association.searchWord(word, tree));
                    break;
                case 4:
                    tree.inorder();
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }

        }
    }
}
