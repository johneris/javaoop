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
        Author author2 = new Author("Fernalou Anne Leosala", 
                "fernalouleosala@gmail.com", 'F');
        
        Book book1 = new Book("Programming 1", 999);
        Book book2 = new Book("Technical Writing", 500, 11);
        
        book1.addAuthor(author1);
        
        book2.addAuthor(author1);
        book2.addAuthor(author2);
        
        
        System.out.println(book1);
        book1.printAuthors();
        
        System.out.println("\n" + book2);
        book2.printAuthors();
        
        book2.setPrice(100);
        book2.setQtyInStock(711);
        
        System.out.println("\n" + book2);
        System.out.println("Price: " + book2.getPrice());
        System.out.println("qtyInStock: " + book2.getQtyInStock());
        
    }
}
