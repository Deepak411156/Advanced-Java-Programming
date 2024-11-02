/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package networkprogramming;

import java.net.*;

/**
 *
 * @author Deepak Bhatta Kaji
 */
public class HostInfo {

    public static void main(String args[]) {
        try {
            InetAddress ipaddress = InetAddress.getLocalHost();
            System.out.println("IP address:\n" + ipaddress);
        } catch (Exception e) {
            System.out.println("Unknown Host");
        }
    }
}
