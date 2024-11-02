/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QueryExecution;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.SQLException;

/**
 *
 * @author Deepak Bhatta Kaji
 */
public class RowSetExample {

    public static void main(String[] args) {
        try {
            // Create JdbcRowSet instance using RowSetProvider
            JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();

            // Set connection details
            rowSet.setUrl("jdbc:mysql://localhost:3306/kmc_college");
            rowSet.setUsername("root");
            rowSet.setPassword("bhatta");

            // Set the query to be executed
            rowSet.setCommand("SELECT * FROM tbl_students");

            // Execute the query
            rowSet.execute();
            System.out.println("Id\tFirst Name\tMiddle Name\tLast Name\tEmail\t\t\t\tPassword");

            // Process the result set
            while (rowSet.next()) {
                System.out.println(
                        rowSet.getInt("id") + "\t"
                        + rowSet.getString("firstName") + "\t\t"
                        + rowSet.getString("middleName") + "\t\t"
                        + rowSet.getString("lastName") + "\t\t"
                        + rowSet.getString("email") + "\t\t"
                        + rowSet.getString("password") + "\t"
                );
            }

            // Closing the RowSet
            rowSet.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
