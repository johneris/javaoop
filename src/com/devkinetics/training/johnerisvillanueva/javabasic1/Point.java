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
public class Point {
    private int x;
    private int y;
    
    public Point(int x, int y)  {
        this.x = x;
        this.y = y;
    }
    
    @Override
    public String toString()    {
        return "Point: (" + x + ", " + y + ")";
    }
    
    public int getX()   {
        return x;
    }
    
    public int getY()   {
        return y;
    }
    
    public void setX(int x)  {
        this.x = x;
    }
    
    public void setY(int y) {
        this.y = y;
    }
    
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
