/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basicPackageConcept.numberchecker;

import basicPackageConcept.numberchecker.NumberUtil;

public class Main {
    public static void main(String[] args) {
        int num = 10;

        if (NumberUtil.isEven(num)) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }
    }
}
