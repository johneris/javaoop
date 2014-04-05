/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.devkinetics.training.johnerisvillanueva.javabasic1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author John Eris
 */
public class PolyLine {
    private List<Point> points;
    
    public PolyLine()   {
        points = new ArrayList<Point>();
    }
    
    public PolyLine(List<Point> points)   {
        this.points = points;
    }
    
    public void appendPoint(int x, int y)   {
        points.add(new Point(x, y));
    }
    
    public void appendPoint(Point p)    {
        points.add(p);
    }
    
    @Override
    public String toString()    {
        StringBuilder sb = new StringBuilder();
        for(Point aPoint : points)  {
            sb.append(aPoint.toString() + " ");
        }
        return sb.toString();
    }
}
