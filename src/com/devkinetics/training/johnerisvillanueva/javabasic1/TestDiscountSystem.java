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
public class TestDiscountSystem {
    public static void main(String[] args)  {
        Customer customer = new Customer("John Eris Villanueva");
        customer.setMemberType("premium");
        Visit visit = new Visit(
                customer, new Date(1, 1, 2012)
            );
        visit.setProductExpense(100);
        visit.setServiceExpense(200);
        
        System.out.println(visit);
    }
}
