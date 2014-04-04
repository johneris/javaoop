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
public class Line {
    private Point begin;
    private Point end;
    
    public Line(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }
    
    public Line(int beginX, int beginY, int endX, int endY) {
        begin = new Point(beginX, beginY);
        end = new Point(endX, endY);
    }
    
    @Override
    public String toString()    {
        return "Line: begin(" + begin.getX() + ", " + begin.getY() + ")"
                + " end(" + end.getX() + ", " + end.getY() + ")";
    }
    
    public Point getBegin() {
        return begin;
    }
    
    public Point getEnd()   {
        return end;
    }
    
    public void setBegin(Point begin)   {
        this.begin = begin;
    }
    
    public void setEnd(Point end)   {
        this.end = end;
    }
    
    public int getBeginX()  {
        return begin.getX();
    }
    
    public int getBeginY()  {
        return begin.getY();
    }
    
    public int getEndX()    {
        return end.getX();
    }
    
    public int getEndY()    {
        return end.getY();
    }
    
    public void setBeginX(int beginX)   {
        begin.setX(beginX);
    }
    
    public void setBeginY(int beginY)   {
        begin.setY(beginY);
    }
    
    public void setBeginXY(int beginX, int beginY)  {
        begin.setXY(beginX, beginY);
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
        int xDiff = begin.getX() - end.getX();
        int yDiff = begin.getY() - end.getY();
        return (int) Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }
    
    public double getGradient() {
        int xDiff = begin.getX() - end.getX();
        int yDiff = begin.getY() - end.getY();
        return Math.atan2(yDiff, xDiff);
    }
}
