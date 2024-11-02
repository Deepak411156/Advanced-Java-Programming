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
public class UpdatableResultSet {

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        String jdbcURL = "jdbc:mysql://localhost:3306/kmc_college";
        String username = "root";
        String password = "bhatta";

        try {
            conn = DriverManager.getConnection(jdbcURL, username, password);
            // Create a Statement with updatable ResultSet
            stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE); // Execute query and get an updatable ResultSet
            rs = stmt.executeQuery("SELECT id, firstName, lastName FROM tbl_students");

            // Update the last name of the first row
            if (rs.first()) {
                System.out.println("Before update: " + rs.getInt("id") + ", " + rs.getString("firstName") + ", " + rs.getString("lastName"));

                // Modify the last name
                rs.updateString("lastName", "Bhatta");

                // Commit the change to the database
                rs.updateRow();

                System.out.println("After update: " + rs.getInt("id") + ", " + rs.getString("firstName") + ", " + rs.getString("lastName"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
