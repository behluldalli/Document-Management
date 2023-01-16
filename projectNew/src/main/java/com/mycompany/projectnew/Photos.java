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
public class Photos extends Document{
      public Photos(String name, Date date) {
    super(name, date, "JPG");
  }

  public String getType() {
    return "JPG";
  }
}

