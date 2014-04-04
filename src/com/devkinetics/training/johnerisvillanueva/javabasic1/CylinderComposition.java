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
public class CylinderComposition {
    private Circle base;
    private double height;
    
    public CylinderComposition()   {
        base = new Circle();
        height = 1.0;
    }
    
    public CylinderComposition(double height)  {
        base = new Circle();
        this.height = height;
    }
    
    public CylinderComposition(double radius, double height)   {
        base = new Circle(radius);
        this.height = height;
    }
    
    public double getHeight()   {
        return height;
    }
    
    public double getVolume()   {
        return base.getArea()*height;
    }
    
    public double getRadius()   {
        return base.getRadius();
    }
    
    public double getArea() {
        return base.getArea();
    }
    
    @Override
    public String toString()    {
        return "Cylinder is composed of " + base.toString()
                + " height=" + height;
    }
}
