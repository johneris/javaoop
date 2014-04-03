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
public class TestMyPolynomial {
    public static void main(String[] args)    {
        MyPolynomial p1 = new MyPolynomial(1.1, 2.2, 3.3);
        MyPolynomial p2 = new MyPolynomial(1.1, 2.2, 3.3, 4.4, 5.5);
        
        double[] coeffs = {7, 11, 0, 1, 2};
        MyPolynomial p3 = new MyPolynomial(coeffs);
        
        System.out.println("Polynomial 1: " + p1);
        System.out.println("Polynomial 2: " + p2);
        System.out.println("Polynomial 3: " + p3);
        
        System.out.println();
        System.out.println("evaluate p1 where x = 11 : " + p1.evaluate(11));
        System.out.println("evaluate p2 where x = 7 : " + p2.evaluate(7));
        System.out.println("evaluate p3 where x = 2 : " + p2.evaluate(2));
        
        System.out.println();
        System.out.println("p1 + p2 = " + p1.add(p2));
        System.out.println("p1 * p2 = " + p1.multiply(p2));
        
    }
}
