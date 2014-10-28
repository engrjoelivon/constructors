/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aivco.constructors;

/**
 *
 * @author macbook
 */
public class ConstructorExe {
    private int a;
    private static int count; 
    public ConstructorExe(String a){
        System.out.println("i am in parent "+ a + " is the parameter that was passed in");
    }
    public ConstructorExe(){
       
    }

    /**
     * @return the a
     */
    public int getA() {
        System.out.println("i am in get a of parent");
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(int a) {
        count++;
        this.a = a;
        
    }
    public static void checkS()
    {
        
    }
}
