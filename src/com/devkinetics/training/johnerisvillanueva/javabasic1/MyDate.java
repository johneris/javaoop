/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.devkinetics.training.johnerisvillanueva.javabasic1;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author John Eris
 */
public class MyDate {
    private int year;
    private int month;
    private int day;
    
    private static String[] strMonths = {
            "Jan", "Feb", "Mar", "Apr", "May", "Jun",
            "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
        };
    
    private static String[] strDays =   {
            "Sunday", "Monday", "Tuesday", "Wednesday",
            "Thursday", "Friday", "Saturday"
        };
    
    private static int[] daysInMonths = {
            31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
        };
    
    public static boolean isLeapYear(int year)  {
        return ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
    }
    
    public static boolean isValidDate(int year, int month, int day) {
        if(!(year >= 1 && year <= 9999))    return false;
        if(!(month >= 1 && month <= 12))     return false;
        if( isLeapYear(year) && month == 2) {
            if(!(day >= 1 && day <= 29))    return false;
        } else  {
            if(!(day >= 1 && day <= daysInMonths[month-1]))    return false;
        }
        return true;
    }
    
    public static int getDayOfWeek(int year, int month, int day)    {
        if((year+"").length() < 4)  {
            return -1;
        }
        int cent = ((year+"").charAt(0) - '0')*1000 + 
                   ((year+"").charAt(1) - '0')*100;
        if(cent == 1700)    cent = 4;
        if(cent == 1800)    cent = 2;
        if(cent == 1900)    cent = 0;
        if(cent == 2000)    cent = 6;
        if(cent == 2100)    cent = 4;
        if(cent == 2200)    cent = 2;
        if(cent == 2300)    cent = 0;
        if(cent == 2400)    cent = 6;
        
        int last2DigitYear =    ((year+"").charAt(2) - '0')*10 + 
                                ((year+"").charAt(3) - '0');
        
        int monthTable = 0;
        if(month == 1)  {
            if(isLeapYear(year))    monthTable = 6;
            else monthTable = 0;
        }
        if(month == 2)  {
            if(isLeapYear(year))    monthTable = 2;
            else monthTable = 3;
        }
        if(month == 3)  monthTable = 3;
        if(month == 4)  monthTable = 6;
        if(month == 5)  monthTable = 1;
        if(month == 6)  monthTable = 4;
        if(month == 7)  monthTable = 6;
        if(month == 8)  monthTable = 2;
        if(month == 9)  monthTable = 5;
        if(month == 10)  monthTable = 0;
        if(month == 11)  monthTable = 3;
        if(month == 12)  monthTable = 5;
        
        int dayOfWeek = (cent + last2DigitYear + (last2DigitYear/4) +
                monthTable + day) % 7;
        
        return dayOfWeek;
    }
    
    public MyDate(int year, int month, int day) {
        setDate(year, month, day);
    }
    
    public void setDate(int year, int month, int day)    {
        if(!isValidDate(year, month, day))
            throw new IllegalArgumentException("Invalid year, month, or day!");
        this.year = year;
        this.month = month;
        this.day = day;
    }
    
    public int getYear()    {
        return year;
    }
    
    public int getMonth()   {
        return month;
    }
    
    public int getDay() {
        return day;
    }
    
    public void setYear(int year)   {
        if(!(year >= 1 && year <= 9999))    {
            System.out.println("Invalid year!");
            return;
        }
        this.year = year;
    }
    
    public void setMonth(int month) {
        if(!(month >= 1 && month <= 12))     {
            System.out.println("Invalid month!");
            return;
        }
        this.month = month;
    }
    
    public void setDay(int day) {
        if( isLeapYear(year) && month == 2) {
            if(!(day >= 1 && day <= 29))    {
                System.out.println("Invalid day!");
                return;
            }
        } else  {
            if(!(day >= 1 && day <= daysInMonths[month-1]))    {
                System.out.println("Invalid day!");
                return;
            }
        }
        this.day = day;
    }
        
    @Override
    public String toString()    {
        String dayOfWeek = getDayOfWeek(year, month, day) == -1 ? 
                        "" : strDays[getDayOfWeek(year, month, day)];
        return dayOfWeek +
                " " + day + " " + strMonths[month-1] + 
                " " + year;
    }
    
    public MyDate nextDay() {
        int y, m, d;
        y = year;
        m = month;
        d = day;
        d++;
        if( isLeapYear(year) && month == 2) {
            if(!(d >= 1 && d <= 29))    {
                // not a valid day
                d = 1;
                m++;
            }
        } else  {
            if(!(d >= 1 && d <= daysInMonths[month-1]))    {
                // not a valid day
                d = 1;
                m++;
            }
        }
        if(!(m >= 1 && m <= 12))    {
            // not a valid month
            m = 1;
            y++;
        }
        if(!(y >= 1 && y <= 9999))    {
            // not a valid year
            throw new IllegalStateException("Year out of range!");
        }
        return new MyDate(y, m, d);
    }
    
    public MyDate nextMonth() {
        int y, m, d;
        y = year;
        m = month;
        d = day;
        m++;
        if(!(m >= 1 && m <= 12))    {
            // not a valid month
            m = 1;
            y++;
        }
        if(!(y >= 1 && y <= 9999))    {
            // not a valid year
            throw new IllegalStateException("Year out of range!");
        }
        while(!isValidDate(y, m, d))   d--;
        return new MyDate(y, m, d);
    }
    
    public MyDate nextYear() {
        int y, m, d;
        y = year;
        m = month;
        d = day;
        y++;
        if(!(y >= 1 && y <= 9999))    {
            // not a valid year
            throw new IllegalStateException("Year out of range!");
        }
        return new MyDate(y, m, d);
    }
    
    public MyDate previousDay() {
        int y, m, d;
        y = year;
        m = month;
        d = day;
        d--;
        if( isLeapYear(year) && month == 2) {
            if(m == -1)    {
                d = 29;
                m--;
            }
        } else  {
            if(m == -1)    {
                d = daysInMonths[month-1];
                m--;
            }
        }
        if(!(m >= 1 && m <= 12))    {
            // not a valid month
            m = 12;
            y--;
        }
        if(!(y >= 1 && y <= 9999))    {
            // not a valid year
            throw new IllegalStateException("Year out of range!");
        }
        return new MyDate(y, m, d);
    }
    
    public MyDate previousMonth() {
        int y, m, d;
        y = year;
        m = month;
        d = day;
        m--;
        if(!(m >= 1 && m <= 12))    {
            // not a valid month
            m = 12;
            y--;
        }
        if(!(y >= 1 && y <= 9999))    {
            // not a valid year
            throw new IllegalStateException("Year out of range!");
        }
        while(!isValidDate(y, m, d))   d--;
        return new MyDate(y, m, d);
    }
    
    public MyDate previousYear() {
        int y, m, d;
        y = year;
        m = month;
        d = day;
        y--;
        if(!(y >= 1 && y <= 9999))    {
            // not a valid year
            throw new IllegalStateException("Year out of range!");
        }
        return new MyDate(y, m, d);
    }
    
}
