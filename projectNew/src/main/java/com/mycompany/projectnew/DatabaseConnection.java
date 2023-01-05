/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectnew;

/**
 *
 * @author behlu
 */
public class DatabaseConnection {
  private final String url;
  private final String username;
  private final String password;

  public DatabaseConnection(String url, String username, String password) {
    this.url = url;
    this.username = username;
    this.password = password;
  }
}