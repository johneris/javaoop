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
public class TestBook {
    public static void main(String[] args)  {
        Author author1 = new Author("John Eris Villanueva", 
                "johnerisvillanueva@gmail.com", 'M');
        Book book1 = new Book("Programming 1", author1, 999);
        
        System.out.println(book1);
        
        Book book2 = new Book("Technical Writing",
            new Author("Fernalou Anne Leosala", "fernalouleosala@gmail.com", 'F'),
            500, 11);
        
        System.out.println(book2);
        
        book2.setPrice(100);
        book2.setQtyInStock(711);
        
        System.out.println(book2);
        System.out.println(book2.getPrice());
        System.out.println(book2.getQtyInStock());
    }
}
