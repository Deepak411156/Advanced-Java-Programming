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
public class CreateTable {

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

            // Create table query
            String createTableQuery = "CREATE TABLE tbl_students ("
                    + "id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, "
                    + "firstName VARCHAR(30), "
                    + "middleName VARCHAR(20), "
                    + "lastName VARCHAR(30), "
                    + "email VARCHAR(50), "
                    + "password VARCHAR(50), "
                    + "isActive BIT DEFAULT 1 "
                    + ")";

            // Execute the create table query
            stmt.executeUpdate(createTableQuery);
            System.out.println("Table 'tbl_students' created successfully.");

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
