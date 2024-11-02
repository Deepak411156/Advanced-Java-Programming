/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author Deepak Bhatta Kaji
 */

interface Apple {

    void show();
}

interface Ball {

    void show();
}

public class Multiple implements Apple, Ball {

    public void show() {
        System.out.println("Interface Apple and Ball");
    }

    public static void main(String args[]) {
        Multiple obj = new Multiple();
        obj.show();
    }
}
