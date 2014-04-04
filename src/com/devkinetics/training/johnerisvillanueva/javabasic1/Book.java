/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.devkinetics.training.johnerisvillanueva.javabasic1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author John Eris
 */
public class Book {
    private String name;
    private List<Author> authors;
    private double price;
    private int qtyInStock;
    
    public Book(String name, double price)   {
        this.name = name;
        this.authors = new ArrayList<Author>();
        this.price = price;
        this.qtyInStock = 0;
    }
    
    public Book(String name, double price, int qtyInStock)   {
        this.name = name;
        this.authors = new ArrayList<Author>();
        this.price = price;
        this.qtyInStock = qtyInStock;
    }
    
    public String getName() {
        return name;
    }
    
    public List<Author> getAuthors()   {
        return authors;
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
    
    @Override
    public String toString() {
        return name + " by " + authors.size() + " authors";
    }
    
    public void printAuthors()  {
        for(Author a : authors) {
            System.out.println(a);
        }
    }
    
    public void addAuthor(Author author)    {
        authors.add(author);
    }
    
}
