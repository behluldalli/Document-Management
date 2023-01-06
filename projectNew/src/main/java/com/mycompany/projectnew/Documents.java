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
        DocumentManagementSystem doc = new DocumentManagementSystem();
        System.out.println("Please select 1 -> add, 2 -> delete, 3 -> search");
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();

        switch (b) {
            case 1 ->
                doc.addDocument();
            case 2 ->
                doc.removeDocument();
            case 3 ->
                doc.searchDocuments();
            default -> {
                System.out.println("Hatali secim.");

            }
        }
    }
}
