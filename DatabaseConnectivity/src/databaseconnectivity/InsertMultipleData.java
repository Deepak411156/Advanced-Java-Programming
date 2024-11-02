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
public class InsertMultipleData {

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

            // Create a statement object
            stmt = conn.createStatement();

            // Add multiple insert statements to the batch
            stmt.addBatch("INSERT INTO tbl_students (firstName, middleName, lastName, email, password) "
                    + "VALUES ('Harish', '', 'Bhatta', 'harry2001@gmail.com', '123456')");

            stmt.addBatch("INSERT INTO tbl_students (firstName, middleName, lastName, email, password) "
                    + "VALUES ('Dinesh', 'Chandra', 'Bhatta', 'dns_bhatta@gmail.com', '12345')");

            stmt.addBatch("INSERT INTO tbl_students (firstName, middleName, lastName, email, password) "
                    + "VALUES ('Pushpa', '', 'Bhatta', 'pusu07@gmail.com', '2145')");

            stmt.addBatch("INSERT INTO tbl_students (firstName, middleName, lastName, email, password) "
                    + "VALUES ('Hemanti', '', 'Bhatta', 'hemu20@gmail.com', '147')");

            // Execute all the insert queries as a batch
            int[] results = stmt.executeBatch();

            // Check the results
            System.out.println("Inserted rows: " + results.length);

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
