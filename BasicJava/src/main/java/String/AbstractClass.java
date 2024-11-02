/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package String;

/**
 *
 * @author Deepak Bhatta Kaji
 */
abstract class Bike {

    abstract void run();
}

class AbstractClass extends Bike {

    void run() {
        System.out.println("running safely..");
    }

    public static void main(String args[]) {
        Bike obj = new AbstractClass();
        obj.run();
    }
}
