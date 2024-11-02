/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author Deepak Bhatta Kaji
 */
class Student {

    void Play() {
        System.out.println("Playing Fooball...");
    }
}

class Bob extends Student {

    void Study() {
        System.out.println("Studing CSIT...");
    }
}

public class Single {

    public static void main(String args[]) {
        Bob d = new Bob();
        d.Study();
        d.Play();
    }
}
