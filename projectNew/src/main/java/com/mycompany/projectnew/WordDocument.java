/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectnew;

/**
 *
 * @author behlu
 */
public class WordDocument extends Document {
  public WordDocument(long id, String name, String[] tags) {
    super(id, name, tags);
  }

  @Override
  public String getType() {
    return "Word";
  }
}