/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.devkinetics.training.johnerisvillanueva.javabasic1;

/**
 *
 * @author John Eris
 */
public class TestAuthor {
    public static void main(String[] args)  {
        Author author1 = new Author("John Eris Villanueva",
            "johnerisvillanueva@gmail.com", 'M');
        System.out.println(author1);
        System.out.println(author1.getName() + " " + author1.getEmail() + " "
                + author1.getGender());
        System.out.println("Change email");
        author1.setEmail("eris_villanueva@yahoo.com");
        System.out.println(author1);
    }
}
