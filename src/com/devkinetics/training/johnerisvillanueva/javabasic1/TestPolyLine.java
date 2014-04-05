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
public class TestPolyLine {
    public static void main(String[] args)  {
        PolyLine l1 = new PolyLine();
        System.out.println(l1);
        l1.appendPoint(new Point (7, 11));
        l1.appendPoint(1, 2);
        l1.appendPoint(3, 4);
        System.out.println(l1);
    }
}
