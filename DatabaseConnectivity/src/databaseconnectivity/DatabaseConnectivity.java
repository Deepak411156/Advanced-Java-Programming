/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package databaseconnectivity;

import java.sql.*;

/**
 *
 * @author Deepak Bhatta Kaji
 */
public class DatabaseConnectivity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kmc_college", "root", "bhatta");
            System.out.println("kmc_college Database Connected");
        } catch (ClassNotFoundException ex) {
            System.out.println("ERROR: Class not Found!" + ex);
        } catch (SQLException ex) {
            System.out.println("ERROR: Problem in SQL!" + ex);
        }

    }

}
