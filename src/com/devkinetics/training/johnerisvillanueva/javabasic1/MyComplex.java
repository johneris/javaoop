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
public class MyComplex {
    private double real;
    private double imag;
    
    public MyComplex(double real, double imag)  {
        this.real = real;
        this.imag = imag;
    }
    
    public double getReal() {
        return this.real;
    }
    
    public void setReal(double real)    {
        this.real = real;
    }
    
    public double getImag() {
        return this.imag;
    }
    
    public void setImag(double imag)    {
        this.imag = imag;
    }
    
    public void setValue(double real, double imag)  {
        this.real = real;
        this.imag = imag;
    }
    
    @Override
    public String toString()    {
        return "(" + this.real + " + " + this.imag + "i)";
    }
    
    public boolean isReal() {
        return (this.imag == 0);
    }
    
    public boolean isImaginary() {
        return !isReal();
    }
    
    public boolean equals(double real, double imag) {
        return (this.real == real && this.imag == imag);
    }
    
    public boolean equals(MyComplex another)    {
        return (this.real == another.real && this.imag == another.imag);
    }
    
    public double magnitude()   {
        return 0;
    }
    
    public double argumentInRadians()   {
        return 0;
    }
    
    public int argumentInDegrees()  {
        return 0;
    }
    
    public MyComplex conjugate()    {
        return this;
    }
    
    public MyComplex add(MyComplex another) {
        return this;
    }
    
    public MyComplex subtract(MyComplex another) {
        return this;
    }
    
    public MyComplex multiplyWith(MyComplex another) {
        return this;
    }
    
    public MyComplex divideBy(MyComplex another) {
        return this;
    }
}
