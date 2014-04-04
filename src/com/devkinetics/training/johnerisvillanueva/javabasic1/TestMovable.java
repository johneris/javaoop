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
public class TestMovable {
    public static void main(String[] args)  {
        Movable m1 = new MovablePoint(5, 6, 10, 11);
        System.out.println(m1);
        m1.moveLeft();
        System.out.println(m1);
        
        Movable m2 = new MovableCircle(2, 1, 2, 20, 5);
        System.out.println(m2);
        m2.moveRight();
        System.out.println(m2);
    }
}
