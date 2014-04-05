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
public class DiscountRate {
    private static double serviceDiscountPremium = 0.2;
    private static double serviceDiscountGold = 0.15;
    private static double serviceDiscountSilver = 0.1;
    private static double productDiscountPremium = 0.1;
    private static double productDiscountGold = 0.1;
    private static double productDiscountSilver = 0.1;
    
    public static double getServiceDiscountRate(String type)   {
        if(type.equalsIgnoreCase("premium"))  return serviceDiscountPremium;
        if(type.equalsIgnoreCase("gold"))     return serviceDiscountGold;
        if(type.equalsIgnoreCase("silver"))   return serviceDiscountSilver;
        return 0;
    }
    
    public static double getProductDiscountRate(String type)   {
        if(type.equalsIgnoreCase("premium"))  return productDiscountPremium;
        if(type.equalsIgnoreCase("gold"))     return productDiscountGold;
        if(type.equalsIgnoreCase("silver"))   return productDiscountSilver;
        return 0;
    }
}
