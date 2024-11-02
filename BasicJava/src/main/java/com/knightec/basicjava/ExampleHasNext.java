/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.knightec.basicjava;

import java.util.Scanner;

/**
 *
 * @author Deepak Bhatta Kaji
 */
public class ExampleHasNext {

    public static void main(String[] args) {
        System.out.println("Enter some numbers to add: ");
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (scanner.hasNext()) {
            count = count + scanner.nextInt();
            System.out.println(count);
            if (count > 100) {
                System.out.println("Max exceeded!");
                break;
            }
        }
    }
}
