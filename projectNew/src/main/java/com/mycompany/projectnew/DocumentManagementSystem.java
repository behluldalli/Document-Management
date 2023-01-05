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
        System.out.println(doc.getName());
      }
    } else {
      System.out.println("No results found.");
    }
   }
}