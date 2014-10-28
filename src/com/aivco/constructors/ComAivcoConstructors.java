/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aivco.constructors;

/**
 *today 5 of august 2014
 * Practicing on constructors,just called a class that extends a parent,that has a constructor 
 * that accepts parameter.From this example was able to view the JVM calling the parent class 
 * constructor before calling child class constructor.From this i verified the theory,that in cases
 * where the parent constructor accepts a parameter it is mandatory that we make a call to super and 
 * pass in that parameter unless the compiler will issue and error
 * 
 */
public class ComAivcoConstructors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Constructorextend cse=new Constructorextend("example");
        // TODO code application logic here
   cse.getA();//this invocation was done to test calling super from a method.In class ConstructorExe
   //I made a call to super.the method name in its parent class,that gave me access to the parent method.
    }
    
}
