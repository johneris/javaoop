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
public class TestBall {
    public static void main(String[] args)  {
        Ball ball = new Ball(7, 11, 5, 10, 45);
        
        for(int i = 1; i <= 5; i++)    {
            System.out.println(ball);
            ball.move();
        }
        System.out.println("reflect horizontal");
        ball.reflectHorizontal();
        for(int i = 1; i <= 5; i++)    {
            System.out.println(ball);
            ball.move();
        }
        System.out.println("reflect vertical");
        ball.reflectVertical();
        for(int i = 1; i <= 5; i++)    {
            System.out.println(ball);
            ball.move();
        }
    }
}
