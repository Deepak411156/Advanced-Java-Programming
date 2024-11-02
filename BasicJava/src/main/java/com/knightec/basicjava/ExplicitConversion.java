/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.knightec.basicjava;

/**
 *
 * @author Deepak Bhatta Kaji
 */
public class ExplicitConversion {

    public static void main(String args[]) {
        double d = 166.66;
//converting double data type into long data type  
        long l = (long) d;
//converting long data type into int data type  
        int i = (int) l;
        System.out.println("Before conversion: " + d);
//fractional part lost  
        System.out.println("After conversion into long type: " + l);
//fractional part lost  
        System.out.println("After conversion into int type: " + i);
    }
}
