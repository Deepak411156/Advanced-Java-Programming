/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculator;
import calculator.Addition;

/**
 *
 * @author deepakbhattakaji
 */
public class BasicAddition {
    public static void main(String[] args) {
        BasicAddition aa = new BasicAddition();
        int a=10,b=20,c=30;
        int result = Addition.add(a,b);
        System.out.println("The two addition is "+result);
        
        int result3 = Addition.add(a,b,c);
        System.out.println("The three addition is "+result3);
        
        int result2 = Addition.sub(a, b);
        System.out.println("The two Subtraction is : "+result2);
    }
    
}
