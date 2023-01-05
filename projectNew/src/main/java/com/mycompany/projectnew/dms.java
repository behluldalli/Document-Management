/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectnew;

import java.util.List;

/**
 *
 * @author behlu
 */
public class dms {
  public static void main(String[] args) {
    // Veritabanı bağlantısı oluşturma
    DatabaseConnection databaseConnection = new DatabaseConnection(
        "jdbc:mysql://localhost:3306/dms", "user", "password");
    DocumentManagementSystem dms = new DocumentManagementSystem(databaseConnection);

    // PDF dökümanı yükleme
    Document pdfDocument = new PdfDocument(1, "Test PDF", new String[] {"pdf", "test"});
    dms.uploadDocument(pdfDocument);

    // Word dökümanı yükleme
    Document wordDocument = new WordDocument(2, "Test Word", new String[] {"word", "test"});
    dms.uploadDocument(wordDocument);

    // Döküman arama
    List<Document> documents = dms.searchDocuments("test");
    for (Document document : documents) {
      System.out.println(document.getName() + " (" + document.getType() + ")");
    }

    // Döküman etiketleme
    dms.addTagToDocument(1, "new_tag");
  }
}
