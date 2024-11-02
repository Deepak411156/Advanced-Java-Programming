/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package String;

/**
 *
 * @author Deepak Bhatta Kaji
 */
public class StringObjects {

    public static void main(String[] args) {
        String s1 = "Apple";
        String s2 = "Apple"; //It doesn't create a new instance
        String s = new String("Apple");

        System.out.println("S1=" + System.identityHashCode(s1));
        System.out.println("S2=" + System.identityHashCode(s2));
        System.out.println("S=" + System.identityHashCode(s));

    }
}
