/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.devkinetics.training.johnerisvillanueva.javabasic1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author John Eris
 */
public class MyPolynomial {
    private double[] coeffs;
    
    public MyPolynomial(double... coeffs)   {
        this.coeffs = coeffs;
    }
    
    public MyPolynomial(String filename)    {
        Scanner in = null;
        try {
            in = new Scanner(new File(filename));
        } catch (FileNotFoundException e)   {
            e.printStackTrace();
        }
        int degree = in.nextInt();
        coeffs = new double[degree+1];
        for(int i = 0; i < coeffs.length; ++i)  {
            coeffs[i] = in.nextDouble();
        }
    }
    
    public int getDegree()  {
        return 0;
    }
    
    @Override
    public String toString()    {
        return "";
    }
    
    public double evaluate(double x)    {
        return 0;
    }
    
    public MyPolynomial add(MyPolynomial another)   {
        return this;
    }
    
    public MyPolynomial multiply(MyPolynomial another)  {
        return this;
    }
    
}
