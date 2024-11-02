/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.knightec.basicjava;

/**
 *
 * @author Deepak Bhatta Kaji
 */
public class ImplicitConversion {

    public static void main(String[] args) {
        int x = 7;
//automatically converts the integer type into long type  
        long y = x;
//automatically converts the long type into float type  
        float z = y;
        System.out.println("Before conversion, int value " + x);
        System.out.println("After conversion, long value " + y);
        System.out.println("After conversion, float value " + z);
    }
}
