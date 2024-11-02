/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ResultSetExamples;

import java.sql.*;

/**
 *
 * @author Deepak Bhatta Kaji
 */
public class ScrollableResultSet {

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        String jdbcURL = "jdbc:mysql://localhost:3306/kmc_college";
        String username = "root";
        String password = "bhatta";

        try {
            conn = DriverManager.getConnection(jdbcURL, username, password);
            // Create a Statement with scrollable ResultSet
            stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY); // Execute query and get a scrollable ResultSet
            rs = stmt.executeQuery("SELECT id, firstName, lastName FROM tbl_students");

            // Move cursor to the last row
            if (rs.last()) {
                System.out.println("Last row data: " + rs.getInt("id") + ", " + rs.getString("firstName") + ", " + rs.getString("lastName"));
            }

            // Move cursor to the first row
            if (rs.first()) {
                System.out.println("First row data: " + rs.getInt("id") + ", " + rs.getString("firstName") + ", " + rs.getString("lastName"));
            }

            // Move cursor to the 3rd row
            if (rs.absolute(5)) {
                System.out.println("5th row data: " + rs.getInt("id") + ", " + rs.getString("firstName") + ", " + rs.getString("lastName"));
            }

            // Move cursor backward (previous row)
            if (rs.previous()) {
                System.out.println("Previous row data: " + rs.getInt("id") + ", " + rs.getString("firstName") + ", " + rs.getString("lastName"));
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
