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
public class TestMyTime {
    public static void main(String[] args)  {
        MyTime[] time = {
                new MyTime(7, 11, 30),
                new MyTime(23, 59, 59),
                new MyTime(0, 0, 0)
            };
        
        for(MyTime t : time)    {
            System.out.println();
            System.out.println("TIME : " + t);
            System.out.println();
            System.out.println("next hour : " + t.nextHour());
            System.out.println("next minute : " + t.nextMinute());
            System.out.println("next second : " + t.nextSecond());
            System.out.println();
            System.out.println("prev hour : " + t.previousHour());
            System.out.println("prev minute : " + t.previousMinute());
            System.out.println("prev second : " + t.previousSecond());
        }
    }
}
