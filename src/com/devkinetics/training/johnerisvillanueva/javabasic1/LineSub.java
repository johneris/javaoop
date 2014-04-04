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
public class LineSub extends Point {
    Point end;
    
    public LineSub(int beginX, int beginY, int endX, int endY)  {
        super(beginX, beginY);
        this.end = new Point(endX, endY);
    }
    
    public LineSub(Point begin, Point end)    {
        super(begin.getX(), begin.getY());
        this.end = end;
    }
    
    @Override
    public String toString()    {
        return "Line: begin(" + super.getX() + ", " + super.getY() + ")"
                + " end(" + end.getX() + ", " + end.getY() + ")";
    }
    
    public Point getBegin() {
        return new Point(super.getX(), super.getY());
    }
    
    public Point getEnd()   {
        return end;
    }
    
    public void setBegin(Point begin)   {
        super.setXY(begin.getX(), begin.getY());
    }
    
    public void setEnd(Point end)   {
        this.end = end;
    }
    
    public int getBeginX()  {
        return super.getX();
    }
    
    public int getBeginY()  {
        return super.getY();
    }
    
    public int getEndX()    {
        return end.getX();
    }
    
    public int getEndY()    {
        return end.getY();
    }
    
    public void setBeginX(int beginX)   {
        super.setX(beginX);
    }
    
    public void setBeginY(int beginY)   {
        super.setY(beginY);
    }
    
    public void setBeginXY(int beginX, int beginY)  {
        super.setXY(beginX, beginY);
    }
    
    public void setEndX(int endX)   {
        end.setX(endX);
    }
    
    public void setEndY(int endY)   {
        end.setY(endY);
    }
    
    public void setEndXY(int endX, int endY)    {
        end.setXY(endX, endY);
    }
    
    public int getLength()  {
        int xDiff = super.getX() - end.getX();
        int yDiff = super.getY() - end.getY();
        return (int) Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }
    
    public double getGradient() {
        int xDiff = super.getX() - end.getX();
        int yDiff = super.getY() - end.getY();
        return Math.atan2(yDiff, xDiff);
    }
}
