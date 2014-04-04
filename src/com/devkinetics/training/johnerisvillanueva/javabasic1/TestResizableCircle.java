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
public class TestResizableCircle {
    public static void main(String[] args)  {
        ResizableCircle c = new ResizableCircle(10);
        System.out.println("circle with radius " + c.radius);
        System.out.println("area: " + c.getArea());
        System.out.println("perimeter: " + c.getPerimeter());
        c.resize(50);
        System.out.println("resize to 50%");
        System.out.println("circle with radius " + c.radius);
        System.out.println("area: " + c.getArea());
        System.out.println("perimeter: " + c.getPerimeter());
    }
}
