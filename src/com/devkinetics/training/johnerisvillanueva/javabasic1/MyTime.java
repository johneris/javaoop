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
public class MyTime {
    private int hour;
    private int minute;
    private int second;
    
    public MyTime(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }
    
    public void setTime(int hour, int minute, int second)   {
        if(!(hour >= 0 && hour <= 23 && minute >= 0 && minute <= 59 && second >= 0 && second <= 59))
            throw new IllegalArgumentException("Invalid hour, minute, or second!");
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    
    public int getHour()    {
        return hour;
    }
    
    public int getMinute()  {
        return minute;
    }
    
    public int getSecond()  {
        return second;
    }
    
    public void setHour(int hour)   {
        if(!(hour >= 0 && hour <= 23))
            throw new IllegalArgumentException("Invalid hour!");
        this.hour = hour;
    }
    
    public void setMinute(int minute)   {
        if(!(minute >= 0 && minute <= 59))
            throw new IllegalArgumentException("Invalid minute!");
        this.minute = minute;
    }
    
    public void setSecond(int second)   {
        if(!(second >= 0 && second <= 59))
            throw new IllegalArgumentException("Invalid second!");
        this.second = second;
    }
    
    @Override
    public String toString()    {
        return (hour >= 10 ? "" + hour : "0" + hour) 
                + (minute >= 10 ? "" + minute : "0" + minute) 
                + (second >= 10 ? "" + second : "0" + second);
    }
    
    public MyTime nextSecond()  {
        return this;
    }
    
    public MyTime nextMinute()  {
        return this;
    }
    
    public MyTime nextHour()    {
        return this;
    }
    
    public MyTime previousSecond()  {
        return this;
    }
    
    public MyTime previousMinute()  {
        return this;
    }
    
    public MyTime previousHour()    {
        return this;
    }
    
}
