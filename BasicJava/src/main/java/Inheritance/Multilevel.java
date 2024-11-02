/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author Deepak Bhatta Kaji
 */
//Multi-Level Inheritance
class Bike {

    public Bike() {
        System.out.println("Segment: 1000cc");
    }

    public void BikeType() {
        System.out.println("Bike Type: Sports");
    }
}

class NinJa extends Bike {

    public NinJa() {
        System.out.println("Make NinJa");
    }

    public void brand() {
        System.out.println("Manufacturer: Kawasaki");
    }

    public void speed() {
        System.out.println("Max Speed: 290Kmph");
    }
}

class NinJa1000R extends NinJa {

    public NinJa1000R() {
        System.out.println("NinJa Model: 1000R");
    }

    @Override
    public void speed() {
        System.out.println("Max Speed: 280Kmph");
    }
}

public class Multilevel {

    public static void main(String args[]) {
        NinJa1000R obj = new NinJa1000R();
        obj.BikeType();
        obj.brand();
        obj.speed();
    }
}
