/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.devkinetics.training.johnerisvillanueva.javabasic1;

import java.util.Date;

/**
 *
 * @author John Eris
 */
public class Visit {
    private Customer customer;
    private Date date;
    private double serviceExpense;
    private double productExpense;
    
    public Visit(String name, Date date)    {
        customer = new Customer(name);
        this.date = date;
    }
    
    public Visit(Customer customer, Date date)    {
        this.customer = customer;
        this.date = date;
    }
    
    public String getName() {
        return customer.getName();
    }
    
    public double getServiceExpense()   {
        return serviceExpense -
                (DiscountRate.getServiceDiscountRate(customer.getMemberType()) * serviceExpense);
    }
    
    public void setServiceExpense(double ex)    {
        serviceExpense = ex;
    }
    
    public double getProductExpense()   {
        return  productExpense -
                (DiscountRate.getProductDiscountRate(customer.getMemberType()) * productExpense);
    }
    
    public void setProductExpense(double ex)    {
        productExpense = ex;
    }
    
    public double getTotalExpense() {
        return getProductExpense() + getServiceExpense();
    }
    
    @Override
    public String toString()    {
        return "Visit: " + customer.getName() + " " + date
                + "\n product expenses: " + this.getProductExpense()
                + "\n service expenses: " + this.getServiceExpense()
                + "\ntotal expenses= " + this.getTotalExpense();
    }
}
