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
public class DeleteData {

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

            // Delete operation query
            String deleteQuery = "DELETE FROM tbl_students WHERE firstName = 'Kalu' AND lastname = 'Billa'";

            // Execute the delete operation
            int rowsAffected = stmt.executeUpdate(deleteQuery);

            // Check if any rows were deleted
            if (rowsAffected > 0) {
                System.out.println("Delete successful. Rows affected: " + rowsAffected);
            } else {
                System.out.println("No matching records found to delete.");
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
