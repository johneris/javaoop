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
public class TestMyDate {
    public static void main(String[] args)  {
        MyDate[] dates = {
                new MyDate(2012, 7, 11),
                new MyDate(2012, 8, 31),
                new MyDate(2013, 12, 31)
            };
        
        for(MyDate date : dates)    {
            System.out.println();
            System.out.println("DATE : " + date);
            System.out.println();
            System.out.println("next year : " + date.nextYear());
            System.out.println("next month : " + date.nextMonth());
            System.out.println("next day : " + date.nextDay());
            System.out.println();
            System.out.println("prev year : " + date.previousYear());
            System.out.println("prev month : " + date.previousMonth());
            System.out.println("prev day : " + date.previousDay());
        }
    }
}
