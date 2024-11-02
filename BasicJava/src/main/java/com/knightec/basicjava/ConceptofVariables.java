/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.knightec.basicjava;

/**
 *
 * @author Deepak Bhatta Kaji
 */
public class ConceptofVariables {

    static int m = 100;//static variable 
    int data = 50; // instance variable

    // Modified method to return 'n'
    int method() {
        int n = 90; // local variable
        return n;
    }

    public static void main(String args[]) {
        ConceptofVariables obj = new ConceptofVariables(); // Creating an object of class A

        // Accessing static variable
        System.out.println("Static variable m: " + ConceptofVariables.m);

        // Accessing instance variable
        System.out.println("Instance variable data: " + obj.data);

        int nValue = obj.method();
        System.out.println("Local variable n: " + nValue);
    }
}
