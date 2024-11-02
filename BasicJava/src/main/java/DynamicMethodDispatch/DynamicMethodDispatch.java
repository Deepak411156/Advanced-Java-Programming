/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DynamicMethodDispatch;

/**
 *
 * @author Deepak Bhatta Kaji
 */
class A {

    void show() {
        System.out.println("Hi, This Parent Class A");
    }
}

class B extends A {

    @Override
    void show() {
        System.out.println("Hi, This Sub Class B of Parent Class A");
    }
}

class C extends A {

    @Override
    void show() {
        System.out.println("Hi, This Sub Class C of Parent Class A");
    }
}

public class DynamicMethodDispatch {

    public static void main(String args[]) {

        A obj = new A();
        obj.show();

        obj = new B();
        obj.show();
        
        obj = new C();
        obj.show();

    }
}
