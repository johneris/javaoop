/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.devkinetics.training.johnerisvillanueva.javabasic1;

import java.util.Scanner;

/**
 *
 * @author John Eris
 */
public class MyComplexApp {
    public static void main(String[] args)  {
        MyComplex complex1;
        MyComplex complex2;
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter complex number 1 (real and"
                + " imaginary part): ");
        complex1 = new MyComplex(in.nextDouble(), in.nextDouble());
        
        System.out.print("Enter complex number 2 (real and"
                + " imaginary part): ");
        complex2 = new MyComplex(in.nextDouble(), in.nextDouble());
        
        System.out.println();
        System.out.println("Number 1 is: " + complex1);
        System.out.println(complex1 + " is " + 
                (complex1.isReal() ? "" : "NOT") + 
                " a pure real number");
        System.out.println(complex1 + " is " + 
                (complex1.isImaginary() ? "" : "NOT") + 
                " a pure imaginary number");
        
        System.out.println();
        System.out.println("Number 2 is: " + complex2);
        System.out.println(complex2 + " is " + 
                (complex2.isReal() ? "" : "NOT") + 
                " a pure real number");
        System.out.println(complex2 + " is " + 
                (complex2.isImaginary() ? "" : "NOT") + 
                " a pure imaginary number");
        
        System.out.println();
        System.out.println(complex1 + " is " + (complex1.equals(complex2) ? "" : "NOT") +
                " equal to " + complex2);
        System.out.println(complex1 + " + " + complex2 + " = " + complex1.add(complex2));
        System.out.println(complex1 + " - " + complex2 + " = " + complex1.subtract(complex2));
        System.out.println(complex1 + " * " + complex2 + " = " + complex1.multiplyWith(complex2));
        System.out.println(complex1 + " / " + complex2 + " = " + complex1.divideBy(complex2));
        System.out.println(complex1 + " magnitude : " + complex1.magnitude());
        System.out.println(complex1 + " conjugate : " + complex1.conjugate());
    } 
}
