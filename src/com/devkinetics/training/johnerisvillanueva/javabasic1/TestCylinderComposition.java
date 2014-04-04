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
public class TestCylinderComposition {
    public static void main(String[] args)  {
        CylinderComposition[] cylinders = {
            new CylinderComposition(), 
            new CylinderComposition(10.0), 
            new CylinderComposition(2.0, 10.0)
        };
        
        for(CylinderComposition c : cylinders) {  
            System.out.println("Test override toString() " + c);
            System.out.println("Cylinder: "
                    + " radius=" + c.getRadius()
                    + " height=" + c.getHeight()
                    + " base area=" + c.getArea()
                    + " volume=" + c.getVolume());
            System.out.println();
        }
    }
}
