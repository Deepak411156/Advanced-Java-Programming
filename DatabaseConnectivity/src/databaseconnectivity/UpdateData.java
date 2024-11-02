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
public class UpdateData {

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

            // Update operation query
            String updateQuery = "UPDATE tbl_students "
                    + "SET lastName = 'Bhatta Kaji', password = 'csit_123' "
                    + "WHERE id = 1";

            // Execute the update
            int rowsAffected = stmt.executeUpdate(updateQuery);

            // Check if any rows were updated
            if (rowsAffected > 0) {
                System.out.println("Update successful. Rows affected: " + rowsAffected);
            } else {
                System.out.println("No matching records found to update.");
            }

        } catch (ClassNotFoundException e) {
            System.out.println("ERROR: JDBC Driver not found: " + e);
        } catch (SQLException e) {
            System.out.println("ERROR: SQL Exception: " + e);
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
                System.out.println("ERROR: Closing resources: " + e);
            }
        }
    }
}
