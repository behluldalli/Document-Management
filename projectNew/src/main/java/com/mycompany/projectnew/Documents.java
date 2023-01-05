/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectnew;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author behlu
 */
class Documents {

    public static void main(String[] args) {
    
        ArrayList<Document> documents = new ArrayList<>();            
       
        documents.add(new Document("PDF 1", new Date(15012023), "PDF"));
        documents.add(new Document("PDF 2", new Date(16012023), "PDF"));
        documents.add(new Document("PDF 3", new Date(17012023), "PDF"));
        documents.add(new Document("Word 1", new Date(18012023), "Word"));
        documents.add(new Document("Word 2", new Date(19012023), "Word"));
        documents.add(new Document("Word 3", new Date(20012023), "Word"));
        documents.add(new Document("Word 4", new Date(21012023), "Word"));

        System.out.println("Number of Documents " + documents.size());

        for (int i = 0; i < documents.size(); i++) {
            System.out.println(documents.get(i).getName());
        }
        
        
                DocumentManagementSystem doc = new DocumentManagementSystem();
        System.out.println("Please select 1 -> add, 2 -> delete, 3 -> search");
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        
        switch (b) {
            case 1 -> doc.addDocument();
            case 2 -> doc.removeDocument();
            case 3 -> doc.searchDocuments();
            default -> {
                System.out.println("Hatali secim.");
               
            }
        }
    }
    }

