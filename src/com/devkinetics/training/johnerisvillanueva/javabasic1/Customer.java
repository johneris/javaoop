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
public class Customer {
    private String name;
    private boolean member;
    private String memberType;
    
    public Customer(String name)    {
        this.name = name;
        this.member = false;
        this.memberType = "";
    }
    
    public String getName() {
        return name;
    }
    
    public boolean isMember()   {
        return member;
    }
    
    public void setMember(boolean member)   {
        this.member = member;
    }
    
    public String getMemberType()   {
        return memberType;
    }
    
    public void setMemberType(String memberType)    {
        this.memberType = memberType;
        this.member = true;
    } 
    
    @Override
    public String toString()    {
        return "Customer: " + name;
    }
}
