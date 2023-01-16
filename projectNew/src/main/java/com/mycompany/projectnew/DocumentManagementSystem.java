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
public class DocumentManagementSystem {

    private final ArrayList<Document> documents;
    private final Scanner scanner;

    public DocumentManagementSystem() {

        documents = new ArrayList<>();
        scanner = new Scanner(System.in);
        documents.add(new Document("Articles", new Date(123, 01, 12), "PDF"));
        documents.add(new Document("Introduction", new Date(122, 01, 05), "PDF"));
        documents.add(new Document("Lab Session", new Date(123, 01, 02), "PDF"));
        documents.add(new Document("Summary", new Date(122, 11, 17), "Word"));
        documents.add(new Document("Child", new Date(122, 06, 19), "JPG"));
        documents.add(new Document("Photo1", new Date(122, 05, 29), "JPG"));
        documents.add(new Document("Text", new Date(122, 04, 29), "Word"));

    }

    public void addDocument() {
        System.out.print("Enter document name: ");
        String name = scanner.nextLine();
        System.out.print("Enter file type: ");
        String fileType = scanner.nextLine();
        documents.add(new Document(name, new Date(), fileType));
        System.out.println("Document added successfully.");
    }

    public void removeDocument() {
        System.out.print("Enter document name: ");
        String name = scanner.nextLine();
        for (int i = 0; i < documents.size(); i++) {
            if (documents.get(i).getName().equals(name)) {
                documents.remove(i);
                System.out.println("Document removed successfully.");
                return;
            }
        }
        System.out.println("Document not found.");
    }

    public void searchDocuments() {
        System.out.print("Enter search query: ");
        String query = scanner.nextLine();
        ArrayList<Document> searchResults = new ArrayList<>();
        for (Document doc : documents) {
            if (doc.getName().contains(query)) {
                searchResults.add(doc);
            }
        }
        if (!searchResults.isEmpty()) {
            System.out.println("Search results:");
            for (Document doc : searchResults) {
                System.out.println(doc.getName() + "found");
            }
        } else {
            System.out.println("No results found.");
        }
    }
        
      
    public void showList() { 

        if (!documents.isEmpty()) {
            System.out.println("Document List:");
            for (Document doc : documents) {
                System.out.println(doc.getName() + " - " + doc.getDate() + " - " + doc.getFileType());
            }
        } else {
            System.out.println("No documents found.");
        }
    }
    
 public void operations() {
    System.out.println("Document Manager");
    System.out.println("1. Add Document");
    System.out.println("2. Remove Document");
    System.out.println("3. Search Documents");
    System.out.print("Enter your choice: ");
    int choice = scanner.nextInt();
    scanner.nextLine();
    switch (choice) {
      case 1 -> addDocument();
      case 2 -> removeDocument();
      case 3 -> searchDocuments();
      default -> System.out.println("Invalid choice. Please try again.");
    }
  }
}


