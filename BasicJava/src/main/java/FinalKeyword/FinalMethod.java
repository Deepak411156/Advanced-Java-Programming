/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FinalKeyword;

/**
 *
 * @author Deepak Bhatta Kaji
 */

class FinalExample {
    // defining a final method inside the parent class.
    public final void display() {
        System.out.println("This is a final method.");
    }
}

public class FinalMethod extends FinalExample {
    // overriding the final method of the parent class.

    public final void display1() {
   // public final void display1() {
        System.out.println("Overriding the final method.");
    }

    public static void main(String args[]) {

        FinalMethod obj = new FinalMethod();
        obj.display1();
    }
}

