/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectnew;

import java.util.Date;

/**
 *
 * @author behlu
 */
class PDFDocument extends Document {
  public PDFDocument(String name, Date date) {
    super(name, date, "PDF");
  }

  public String getType() {
    return "PDF";
  }
}

