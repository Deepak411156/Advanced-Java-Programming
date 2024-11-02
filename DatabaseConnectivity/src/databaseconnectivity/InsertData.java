/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package databaseconnectivity;

import java.sql.*;
/**
 *
 * @author Deepak Bhatta Kaji
 */


public class InsertData {

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;

        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish a connection to the database
            String url = "jdbc:mysql://localhost:3306/kmc_college"; 
            String user = "root";
            String password = "bhatta";
            conn = DriverManager.getConnection(url, user, password);

            // Create SQL insert query
            String str = "INSERT INTO tbl_students (firstName, middleName, lastName, email, password) " +
                         "VALUES ('Kalu', '', 'Billa', 'kalubilla@gmail.com', '12345')";

            // Create a statement object
            stmt = conn.createStatement();

            // Execute the query
            stmt.executeUpdate(str);
            System.out.println("Data inserted successfully");

        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found: " + e);
        } catch (SQLException e) {
            System.out.println("SQL Exception: " + e);
        } finally {
            // Close the connection and statement to free resources
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                System.out.println("Error closing resources: " + e);
            }
        }
    }
}
