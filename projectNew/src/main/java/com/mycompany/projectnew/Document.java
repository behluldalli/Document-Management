/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectnew;

/**
 *
 * @author behlu
 */
public abstract class Document {
  protected long id;
  protected String name;
  protected String[] tags;

  public Document(long id, String name, String[] tags) {
    this.id = id;
    this.name = name;
    this.tags = tags;
  }

  public long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String[] getTags() {
    return tags;
  }

  public abstract String getType();
}
