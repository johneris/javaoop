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
public class Cylinder extends Circle    {
    private double height;
    
    public Cylinder()   {
        super();
        height = 1.0;
    }
    
    public Cylinder(double height)  {
        super();
        this.height = height;
    }
    
    public Cylinder(double radius, double height)   {
        super(radius);
        this.height = height;
    }
    
    public double getHeight()   {
        return height;
    }
    
    public double getVolume()   {
        return getArea()*height;
    }
    
    @Override
    public String toString()    {
        return "Cylinder: subclass of " + super.toString()
                + " height=" + height;
    }
    
}
