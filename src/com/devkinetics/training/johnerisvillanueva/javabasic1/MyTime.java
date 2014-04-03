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
        return (hour >= 10 ? "" + hour : "0" + hour) + ":"
                + (minute >= 10 ? "" + minute : "0" + minute) + ":"
                + (second >= 10 ? "" + second : "0" + second);
    }
    
    public MyTime nextSecond()  {
        int h = 0, m = 0, s = 0;
        h = this.hour;
        m = this.minute;
        s = this.second;
        s++;
        if(s == 60) {
            s = 0;
            m++;
        }
        if(m == 60) {
            m = 0;
            h++;
        }
        if(h == 24) {
            h = 0;
        }
        return new MyTime(h, m, s);
    }
    
    public MyTime nextMinute()  {
        int h = 0, m = 0, s = 0;
        h = this.hour;
        m = this.minute;
        s = this.second;
        m++;
        if(m == 60) {
            m = 0;
            h++;
        }
        if(h == 24) {
            h = 0;
        }
        return new MyTime(h, m, s);
    }
    
    public MyTime nextHour()    {
        int h = 0, m = 0, s = 0;
        h = this.hour;
        m = this.minute;
        s = this.second;
        h++;
        if(h == 24) {
            h = 0;
        }
        return new MyTime(h, m, s);
    }
    
    public MyTime previousSecond()  {
        int h = 0, m = 0, s = 0;
        h = this.hour;
        m = this.minute;
        s = this.second;
        s--;
        if(s == -1) {
            s = 59;
            m--;
        }
        if(m == -1) {
            m = 59;
            h--;
        }
        if(h == -1) {
            h = 23;
        }
        return new MyTime(h, m, s);
    }
    
    public MyTime previousMinute()  {
        int h = 0, m = 0, s = 0;
        h = this.hour;
        m = this.minute;
        s = this.second;
        m--;
        if(m == -1) {
            m = 59;
            h--;
        }
        if(h == -1) {
            h = 23;
        }
        return new MyTime(h, m, s);
    }
    
    public MyTime previousHour()    {
        int h = 0, m = 0, s = 0;
        h = this.hour;
        m = this.minute;
        s = this.second;
        h--;
        if(h == -1) {
            h = 23;
        }
        return new MyTime(h, m, s);
    }
    
}