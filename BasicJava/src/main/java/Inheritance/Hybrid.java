/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author Deepak Bhatta Kaji
 */
//Hybrid Inheritance
class A {

    public void Prints() {
        System.out.println("A is the Parent Class to all B,C,D");
    }
}

class B extends A {

    @Override
    public void Prints() {
        System.out.println("B has Single Inheritance with A and shares Hierarchy with C");
    }
}

class C extends A {

    @Override
    public void Prints() {
        System.out.println("C has Single Inheritance with A and shares Hierarchy with B");
    }
}

class D extends C {

    @Override
    public void Prints() {
        System.out.println("D has Single Inheritance with C and Multi-Level inheritance with A");
    }
}

public class Hybrid {

    public static void main(String args[]) {
        A obj1 = new A();
        B obj2 = new B();
        C obj3 = new C();
        D obj4 = new D();
        obj1.Prints();
        obj2.Prints();
        obj3.Prints();
        obj4.Prints();
    }
}
