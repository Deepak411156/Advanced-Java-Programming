/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Relationship;

/**
 *
 * @author Deepak Bhatta Kaji
 */
// This is the Car class
// This is the Car class
//class Car {
//
//    private String make;
//    private String model;
//
//    // Constructor
//    public Car(String make, String model) {
//        this.make = make;
//        this.model = model;
//    }
//
//    // Getters
//    public String getMake() {
//        return make;
//    }
//
//    public String getModel() {
//        return model;
//    }
//}
//
//// This is the Person class
//class Person {
//
//    private String name;
//    private int age;
//    private Car car; // This class has-a relationship with Car
//
//    // Constructor
//    public Person(String name, int age, Car car) {
//        this.name = name;
//        this.age = age;
//        this.car = car;
//    }
//
//    // Getters
//    public String getName() {
//        return name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public Car getCar() {
//        return car;
//    }
//}
//
//// This is the main class
//public class HasARelationship {
//
//    public static void main(String[] args) {
//        // Creating an object of class Car
//        Car myCar = new Car("Toyota", "Corolla");
//
//        // Creating an object of class Person
//        Person myPerson = new Person("Deepak Bhatta", 29, myCar);
//
//        // Accessing the details of the person and the car
//        System.out.println("Person Details:");
//        System.out.println("Name: " + myPerson.getName());
//        System.out.println("Age: " + myPerson.getAge());
//        System.out.println("Car Details:");
//        System.out.println("Make: " + myPerson.getCar().getMake());
//        System.out.println("Model: " + myPerson.getCar().getModel());
//    }
//}

class Engine {

    int power;
}

class Car {

    Engine e; // Class Engine object as a member variable of class Car
    String brand;
    String color;

    // Constructor to initialize Engine object
    public Car() {
        e = new Engine(); // Instantiate Engine object within the Car constructor
    }

    void showDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Engine HP: " + e.power);
    }
}

public class HasARelationship {

    public static void main(String[] args) {
        Car c = new Car();
        c.e.power = 169;
        c.brand = "Toyota Corolla";
        c.color = "Red";
        c.showDetails();
    }
}

