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
public class CreateDatabase {

    public static void main(String[] args) {
        Connection conn = null;
        Statement stat = null;

        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish a connection to MySQL server (without specifying a database)
            String url = "jdbc:mysql://localhost:3306/"; // No specific database here
            String user = "root";
            String password = "bhatta";
            conn = DriverManager.getConnection(url, user, password);

            // Create a statement object
            stat = conn.createStatement();

            // Create database query
            String createDatabaseQuery = "CREATE DATABASE IF NOT EXISTS nast_college";

            // Execute the create database query
            stat.executeUpdate(createDatabaseQuery);
            System.out.println("Database 'kmc_college' created successfully.");

        } catch (ClassNotFoundException e) {
            System.out.println("ERROR: JDBC Driver not found: " + e);
        } catch (SQLException e) {
            System.out.println("ERROR: SQL Exception: " + e);
        } finally {
            // Close the connection and statement to free resources
            try {
                if (stat != null) {
                    stat.close();
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
