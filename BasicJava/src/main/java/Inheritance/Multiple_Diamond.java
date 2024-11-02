/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author Deepak Bhatta Kaji
 */
// Interface representing a generic car
interface Car {

    void drive();
}

interface CNG_Car extends Car {

    int CNG_MILEAGE = 20;

    @Override
    default void drive() {
        System.out.println("Driving CNG car with mileage: " + CNG_MILEAGE);
    }
}

interface Petrol_Car extends Car {

    int PETROL_MILEAGE = 15;

    @Override
    default void drive() {
        System.out.println("Driving petrol car with mileage: " + PETROL_MILEAGE);
    }
}

// Hybrid_Car interface extends both CNG_Car and Petrol_Car
interface Hybrid_Car extends CNG_Car, Petrol_Car {

    @Override
    default void drive() {
        // You can choose which implementation to use here
        CNG_Car.super.drive(); // Using CNG_Car implementation
        Petrol_Car.super.drive(); // Or using Petrol_Car implementation
    }
}

public class Multiple_Diamond {

    public static void main(String[] args) {
        Hybrid_Car hybridCar = new Hybrid_Car() {
        }; // Instance of Hybrid_Car interface
        hybridCar.drive(); // Calls the drive() method from Petrol_Car interface
    }
}
