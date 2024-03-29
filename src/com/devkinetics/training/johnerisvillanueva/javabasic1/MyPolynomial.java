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
        return coeffs.length-1;
    }
    
    @Override
    public String toString()    {
        String poly = "";
        for(int degree = coeffs.length-1; degree >= 0; degree--)    {
            if(coeffs[degree] == 0) continue;
            if(degree != coeffs.length-1)
                poly += (coeffs[degree] > 0 ? " + " : " - ");
            poly += Math.floor(coeffs[degree]*100) / 100;
            if(degree >= 2) poly += "x^" + degree;
            else if(degree == 1)    poly += "x";
        }
        return poly;
    }
    
    public double evaluate(double x)    {
        double ans = 0;
        for(int degree = 0; degree < coeffs.length; degree++)    {
            ans += Math.pow((coeffs[degree] * x), degree);
        }
        return ans;
    }
    
    public MyPolynomial add(MyPolynomial another)   {
        int size =  coeffs.length > another.getDegree()+1 ? 
                    coeffs.length : another.getDegree()+1;
        double[] ans = new double[size];
        
        for(int degree = 0; degree < ans.length; degree++)   {
            double add = 0;
            if(degree <= this.getDegree())      add += coeffs[degree];
            if(degree <= another.getDegree())   add += another.coeffs[degree];
            ans[degree] = add;
        }
        
        return new MyPolynomial(ans);
    }
    
    public MyPolynomial multiply(MyPolynomial another)  {
        int size = getDegree() + another.getDegree() + 1;
        double[] ans = new double[size];
        
        for(int deg1 = 0; deg1 < coeffs.length; deg1++)    {
            for(int deg2 = 0; deg2 < another.coeffs.length; deg2++) {
                double num = coeffs[deg1] * another.coeffs[deg2];
                ans[deg1+deg2] += num;
            }
        }
        
        return new MyPolynomial(ans);
    }
    
}
