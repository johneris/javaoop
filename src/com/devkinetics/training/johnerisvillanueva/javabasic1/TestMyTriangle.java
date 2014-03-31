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
public class TestMyTriangle {
    public static void main(String[] args)  {
        MyTriangle triangle = new MyTriangle(0, 3, 3, 0, 0, 0);
        System.out.println(triangle);
        System.out.println(triangle.getPerimeter());
        triangle.printType();
    }
}
