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
public class CircleGObject implements GeometricObject {
    protected double radius;
    
    public CircleGObject(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double getPerimeter()    {
        return 2 * Math.PI * radius;
    }
    
    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }
}
