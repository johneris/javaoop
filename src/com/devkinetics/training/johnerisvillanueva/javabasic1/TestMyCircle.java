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
public class TestMyCircle {
    public static void main(String[] args)  {
        MyCircle c1 = new MyCircle(0, 0, 5);
        MyCircle c2 = new MyCircle(new MyPoint(0,0), 3);
        
        System.out.println(c1);
        System.out.println("area: " + c1.getArea());
        
        System.out.println(c2);
        System.out.println("area: " + c2.getArea());
    }
}
