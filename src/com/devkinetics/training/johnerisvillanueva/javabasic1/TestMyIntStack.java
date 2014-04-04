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
public class TestMyIntStack {
    public static void main(String[] args)  {
        MyIntStack stack = new MyIntStack(2);
        
        stack.push(1);
        stack.printArray();
        System.out.println();
        
        stack.push(2);
        stack.printArray();
        System.out.println();
        
        stack.push(3);
        stack.printArray();
        System.out.println();
        
        stack.pop();
        stack.printArray();
        System.out.println();
        
        stack.push(4);
        stack.printArray();
        System.out.println();
        
        System.out.println("peek : " + stack.peek());
        System.out.println("isFull: " + stack.isFull());
        System.out.println("isEmpty: " + stack.isEmpty());
    }
    
     
}
