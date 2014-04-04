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
        return false;
    }
    
    public boolean equals(double real, double imag) {
        return (this.real == real && this.imag == imag);
    }
    
    public boolean equals(MyComplex another)    {
        return (this.real == another.real && this.imag == another.imag);
    }
    
    public double magnitude()   {
        return Math.sqrt(real*real + imag*imag);
    }
    
    public double argumentInRadians()   {
        return Math.atan2(imag, real);
    }
    
    public int argumentInDegrees()  {
        return (int)Math.atan2(imag, real);
    }
    
    public MyComplex conjugate()    {
        return new MyComplex(real, -imag);
    }
    
    public MyComplex add(MyComplex another) {
        double real = this.real + another.real;
        double imag = this.imag + another.imag;
        return new MyComplex(real, imag);
    }
    
    public MyComplex subtract(MyComplex another) {
        double real = this.real - another.real;
        double imag = this.imag - another.imag;
        return new MyComplex(real, imag);
    }
    
    public MyComplex multiplyWith(MyComplex another) {
        double real = this.real * another.real - this.imag * another.imag;
        double imag = this.real * another.imag + this.imag * another.real;
        return new MyComplex(real, imag);
    }
    
    public MyComplex divideBy(MyComplex another) {
        double scale = real*real + imag*imag;
        MyComplex reciprocal = new MyComplex(real / scale, -imag / scale);
        return new MyComplex(reciprocal.real * real, reciprocal.imag * imag);
    }
}
