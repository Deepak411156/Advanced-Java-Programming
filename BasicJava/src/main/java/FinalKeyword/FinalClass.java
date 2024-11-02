/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FinalKeyword;

/**
 *
 * @author Deepak Bhatta Kaji
 */
//final class myFinalClass {
 class myFinalClass {

    void myMethod() {
        System.out.println("We are in the final class we just created");
    }
}

class subClass extends myFinalClass {

    void myMethod() {
        System.out.println("We are in the subclass");
    }
}

class FinalClass {

    public static void main(String arg[]) {
        myFinalClass obj = new subClass();
        obj.myMethod();
    }
}
