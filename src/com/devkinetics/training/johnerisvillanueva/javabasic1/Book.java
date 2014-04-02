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
public class Book {
    private String name;
    private Author author;
    private double price;
    private int qtyInStock;
    
    public Book(String name, Author author, double price)   {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = 0;
    }
    
    public Book(String name, Author author, double price, int qtyInStock)   {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }
    
    public String getName() {
        return name;
    }
    
    public Author getAuthor()   {
        return author;
    }
    
    public double getPrice()    {
        return price;
    }
    
    public void setPrice(double price)  {
        this.price = price;
    }
    
    public int getQtyInStock()  {
        return qtyInStock;
    }
    
    public void setQtyInStock(int qtyInStock)   {
        this.qtyInStock = qtyInStock;
    }
    
    public String getAuthorName()   {
        return author.getName();
    }
    
    public String getAuthorEmail()  {
        return author.getEmail();
    }
    
    public char getAuthorGender()   {
        return author.getGender();
    }
    
    @Override
    public String toString() {
        return name + " by " + author;
    }
    
}
