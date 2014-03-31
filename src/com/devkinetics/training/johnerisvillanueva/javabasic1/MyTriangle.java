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
public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;
    
    public MyTriangle(int x1, int y1, int x2, int y2, 
            int x3, int y3) {
        this.v1 = new MyPoint(x1, y1);
        this.v2 = new MyPoint(x2, y2);
        this.v3 = new MyPoint(x3, y3);
    }
    
    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }
    
    @Override
    public String toString()    {
        return "Triangle @ " + this.v1 + ", " +
            this.v2 + ", " + this.v3;
    }
    
    public double getPerimeter()    {
        double perimeter;
        perimeter = this.v1.distance(this.v2);
        perimeter += this.v2.distance(this.v3);
        perimeter += this.v3.distance(this.v1);
        return perimeter;
    }
    
    public void printType() {
        double line1 = this.v1.distance(this.v2);
        double line2 = this.v2.distance(this.v3);
        double line3 = this.v3.distance(this.v1);
        if(line1 == line2 &&  line2 == line3)   {
            System.out.println("equilateral");
        } else if(line1 != line2 &&  line2 != line3 && line3 != line1)   {
            System.out.println("scalene");
        } else  {
            System.out.println("isosceles");
        }
    }
    
}
