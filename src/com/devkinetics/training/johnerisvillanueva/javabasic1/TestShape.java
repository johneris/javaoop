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
public class TestShape {
    public static void main(String[] args)  {
        Shape shape = new Shape();
        Circle circle = new Circle(11, "blue", true);
        Rectangle rectangle = new Rectangle(7, 11, "orange", false);
        Square square = new Square(11, "cyan", true);
        
        System.out.println(shape);
        System.out.println("Color: " + shape.getColor());
        System.out.println("Filled: " + shape.isFilled());
        System.out.println();
        
        System.out.println(circle);
        System.out.println("Color: " + circle.getColor());
        System.out.println("Filled: " + circle.isFilled());
        System.out.println("Area: " + circle.getArea());
        System.out.println("Circumference: " + circle.getPerimeter());
        System.out.println();
        
        System.out.println(rectangle);
        System.out.println("Color: " + rectangle.getColor());
        System.out.println("Filled: " + rectangle.isFilled());
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
        System.out.println();
        
        System.out.println(square);
        System.out.println("Color: " + square.getColor());
        System.out.println("Filled: " + square.isFilled());
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());
        System.out.println();
    }
}
