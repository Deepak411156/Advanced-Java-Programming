/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myjavabeans;

/**
 *
 * @author Deepak Bhatta Kaji
 */
public class BeanDemo {
    
    public static void main(String[] args) {
        JavaBeans jb = new JavaBeans();
        
        jb.setUserName("Billi");
        System.out.println("User Name : " +jb.getUserName());
        
        jb.setAge(22);
        System.out.println("Age : " +jb.getAge());
    }
    
}
