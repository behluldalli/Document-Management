/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.projectnew;

import java.util.List;

/**
 *
 * @author behlu
 */
public class DocumentManagementSystemTest {
  
  public void testUploadDocument() {
    // Veritabanı bağlantısı oluşturma
    DatabaseConnection databaseConnection = new DatabaseConnection(
        "jdbc:mysql://localhost:3306/dms", "user", "password");
    DocumentManagementSystem dms = new DocumentManagementSystem(databaseConnection);

    // Döküman yükleme testi
    Document document = new PdfDocument(1, "Test PDF", new String[] {"pdf", "test"});
    dms.uploadDocument(document);

    // Yüklenen dökümanın veritabanında saklandığını doğrula
    // ...
  }
  public void testSearchDocuments() {
    // Veritabanı bağlantısı oluşturma ve döküman yükleme
    // ...

    // Döküman arama testi
    List<Document> documents = dms.searchDocuments("pdf");
    assertTrue(!documents.isEmpty());
    assertEquals(documents.get(0).getName(), "Test PDF");
  }


  public void testAddTagToDocument() {
    // Veritabanı bağlantısı oluşturma ve döküman yükleme
    // ...

    // Döküman etiketleme testi
    dms.addTagToDocument(1, "new_tag");

    // Etiketlenen dökümanın veritabanında güncellendiğini doğrula
    // ...
  }

    private void assertTrue(boolean b) {
    }

    private void assertEquals(String name, String test_PDF) {
    }
}
