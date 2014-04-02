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
public class Circle {
    private double radius;
    private String color;
    
    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }
    
    public Circle(double radius) {
        this.radius = radius;
        this.color = "red";
    }
    
    public Circle(double radius, String color)   {
        this.radius = radius;
        this.color = color;
    }
    
    public double getRadius()   {
        return radius;
    }
    
    public String getColor()    {
        return color;
    }
    
    public double getArea() {
        return radius*radius*Math.PI;
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public void setColor(String color)  {
        this.color = color;
    }
    
    @Override
    public String toString()    {
        return "Circle: radius=" + radius + " color=" + color;
    }
    
}
