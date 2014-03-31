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
public class MyCircle {
    private MyPoint center;
    private int radius;
    
    public MyCircle(int x, int y, int radius)   {
        this.center = new MyPoint(x, y);
        this.radius = radius;
    }
    
    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }
    
    public int getRadius()  {
        return this.radius;
    }
    
    public void setRadius(int radius)   {
        this.radius = radius;
    }
    
    public MyPoint getCenter()  {
        return this.center;
    }
    
    public void setCenter(MyPoint center)   {
        this.center = center;
    }
    
    public int getCenterX() {
        return this.center.getX();
    }
    
    public int getCenterY() {
        return this.center.getY();
    }
    
    public void setCenterXY(int x, int y)   {
        this.center.setXY(x, y);
    }
    
    @Override
    public String toString()    {
        return "Circle @ " + this.center + " radius=" + this.radius;
    }
    
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }
}
