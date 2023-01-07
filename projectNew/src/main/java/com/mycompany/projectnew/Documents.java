/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectnew;

import java.util.Scanner;

/**
 *
 * @author behlu
 */
class Documents {

public static void main(String[] args) {
        DocumentManagementSystem doc = new DocumentManagementSystem();
        selection(doc);
    }

    private static void selection(DocumentManagementSystem doc) {
           Scanner sc = new Scanner(System.in);
        System.out.println("Please Select 1 -> Documents, 2 -> Operations");
        int a =sc.nextInt();

                switch (a) {
            case 1 ->
                    doc.showList();
            case 2 ->doc.operations();
                   
            default -> System.out.println("Invalid Choice.");
        }



        selection(doc);
    }
}
