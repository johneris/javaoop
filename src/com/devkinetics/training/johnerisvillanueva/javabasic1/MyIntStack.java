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
public class MyIntStack {
    private int[] contents;
    private int tos;
    
    public MyIntStack(int capacity) {
        contents = new int[capacity];
        tos = -1;
    }
    
    public void push(int element)   {
        if(isFull())    {
            int[] temp = new int[tos+1];
            System.arraycopy(contents, 0, temp, 0, contents.length);
            contents = new int[tos+2];
            System.arraycopy(temp, 0, contents, 0, temp.length);
        }
        contents[++tos] = element;
    }
    
    public int pop()    {
        return contents[tos--];
    }
    
    public int peek()   {
        return contents[tos];
    }
    
    public boolean isEmpty()    {
        return tos < 0;
    }
    
    public boolean isFull() {
        return tos == contents.length-1;
    }
    
    public void printArray()   {
        for(int i = 0; i <= tos; i++) {
            System.out.print(contents[i] + " ");
        }
    }
}
