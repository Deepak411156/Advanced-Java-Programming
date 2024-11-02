/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.knightec.basicjava;

/**
 *
 * @author Deepak Bhatta Kaji
 */
public class TernaryOperator {

    public static void main(String[] args) {
        int a = 20, b = 10, c = 30, result;

        result = ((a > b) ? (a > c) ? a : c : (b > c) ? b : c);
        System.out.println("Max of three numbers = " + result);
    }
}
