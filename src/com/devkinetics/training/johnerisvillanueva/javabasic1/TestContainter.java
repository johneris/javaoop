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
public class TestContainter {
    public static void main(String[] args)  {
        Ball ball = new Ball(50, 50, 5, 10, 30);
        Container box = new Container(0, 0, 100, 100);
        
        for(int step = 1; step <= 100; step++)    {
            ball.move();
            box.collidesWith(ball);
            System.out.println(ball);
        }
    }
}
