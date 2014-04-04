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
public class Ball {
    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;
    
    public Ball(int x, int y, int radius, int speed, int direction) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDelta = (float) (speed * Math.cos(direction));
        this.yDelta = (float) (-speed * Math.sin(direction));
    }
    
    public float getX() {
        return x;
    }
    
    public void setX(float x)  {
        this.x = x;
    }
    
    public float getY() {
        return y;
    }
    
    public void setY(float y)  {
        this.y = y;
    }
    
    public int getRadius() {
        return radius;
    }
    
    public void setRadius(int radius)  {
        this.radius = radius;
    }
    
    public float getXDelta() {
        return xDelta;
    }
    
    public void setXDelta(float xDelta)  {
        this.xDelta = xDelta;
    }
    
    public float getYDelta() {
        return yDelta;
    }
    
    public void setYDelta(float yDelta)  {
        this.yDelta = yDelta;
    }
    
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public void move()  {
        x += xDelta;
        y += yDelta;
    }
    
    public void reflectHorizontal() {
        xDelta = -xDelta;
    }
    
    public void reflectVertical()   {
        yDelta = -yDelta;
    }
    
    @Override
    public String toString()    {
        return "Ball at (" + x + ", " + y + ") of velocity (" 
                + xDelta + ", " + yDelta + ")" ;
    }
    
}
