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
public class Circle extends Shape {
    private double radius;
    
    public Circle() {
        super();
        this.radius = 1.0;
    }
    
    public Circle(double radius) {
        super();
        this.radius = radius;
    }
    
    public Circle(double radius, String color, boolean filled)   {
        super(color, filled);
        this.radius = radius;
    }
    
    public double getRadius()   {
        return radius;
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }
    
    @Override
    public double getPerimeter()    {
        return 2 * Math.PI * radius;
    }
    
    @Override
    public String toString()    {
        return "A Circle with radius=" + radius
                + ", which is a subclass of " + super.toString();
    }
    
}
