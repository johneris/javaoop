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
public class TestCircle {
    public static void main(String[] args)  {
        Circle c1 = new Circle();
        System.out.println("The circle has radius of "
                + c1.getRadius() + " and area of " + c1.getArea());
        
        Circle c2 = new Circle(2.0);
        System.out.println(c2);
        
        Circle c3 = new Circle();
        c3.setRadius(5.0);
        c3.setColor("blue");
        System.out.println(c3);
    }
}
