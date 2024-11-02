/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.knightec.basicjava;

/**
 *
 * @author Deepak Bhatta Kaji
 */
public class NonPrimitiveDataTypes {
      String str="";
	
	public static void main(String[] args) {
		
		String name = "CSIT Smart Class!";
		String wish = "Hello, ";
		
		NonPrimitiveDataTypes obj = new NonPrimitiveDataTypes();
		
		System.out.println("str = " + obj.str);
		
		System.out.println(wish.concat(name));		
	}
}
