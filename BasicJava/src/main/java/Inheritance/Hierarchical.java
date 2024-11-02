/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author Deepak Bhatta Kaji
 */
//Hierarchical Inheritance
//Parent class
class Employee {

    double salary = 30000;

    void displaySalary() {
        System.out.println("Employee Salary: Rs." + salary);
    }
}
// child class

class FullTimeEmployee extends Employee {

    double bonus = 0.50;

    void incrementSalary() {
        salary = salary + (salary * bonus);
    }
}
// child class

class InternEmployee extends Employee {

    double bonus = 0.25;

    void incrementSalary() {
        salary = salary + (salary * bonus);
    }
}

public class Hierarchical {

    public static void main(String[] args) {
        // object created
        FullTimeEmployee emp1 = new FullTimeEmployee();
        InternEmployee emp2 = new InternEmployee();
        
        System.out.println("Salary of a full-time employee:");
        System.out.println("Salary Before Getting Bonus : ");
        emp1.displaySalary();
        System.out.println("Salary After Getting Bonus : ");
        emp1.incrementSalary();
        emp1.displaySalary();
        
        System.out.println("********************************");
        
        System.out.println("Salary of an intern employee:");
        System.out.println("Salary Before Getting Bonus : ");
        emp2.displaySalary();
        System.out.println("Salary After Getting Bonus : ");
        emp2.incrementSalary();
        emp2.displaySalary();
    }
}
