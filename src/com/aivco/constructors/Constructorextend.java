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
public class Constructorextend extends ConstructorExe{
  public Constructorextend(String a){
      super(a);
      System.out.println("i am in child");
  
  }
  @Override
 public int getA(){
  
     
 return super.getA();}
 
}
