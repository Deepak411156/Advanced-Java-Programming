/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QueryExecution;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.SQLException;

/**
 *
 * @author Deepak Bhatta Kaji
 */
public class CachedRowSetExample {

    public static void main(String[] args) {
        Connection conn = null;
        try {
            // Manually create a database connection
            MysqlDataSource dataSource = new MysqlDataSource();
            dataSource.setUrl("jdbc:mysql://localhost:3306/kmc_college");
            dataSource.setUser("root");
            dataSource.setPassword("bhatta");

            // Get a connection from the DataSource
            conn = (Connection) dataSource.getConnection();

            // Disable auto-commit for this connection
            conn.setAutoCommit(false);

            // Create CachedRowSet instance using RowSetProvider
            CachedRowSet cachedRowSet = RowSetProvider.newFactory().createCachedRowSet();

            // Set connection details
            cachedRowSet.setUrl("jdbc:mysql://localhost:3306/kmc_college");
            cachedRowSet.setUsername("root");
            cachedRowSet.setPassword("bhatta");

            // Set the query to retrieve data
            cachedRowSet.setCommand("SELECT * FROM tbl_students");

            // Execute the query and fetch data into CachedRowSet
            cachedRowSet.execute();
            System.out.println("Id\tFirst Name\tMiddle Name\tLast Name\tEmail\tPassword");

            // Process the CachedRowSet data (in a disconnected mode)
            while (cachedRowSet.next()) {
                System.out.println(
                        cachedRowSet.getInt("id") + "\t"
                        + cachedRowSet.getString("firstName") + "\t\t"
                        + cachedRowSet.getString("middleName") + "\t\t"
                        + cachedRowSet.getString("lastName") + "\t\t"
                        + cachedRowSet.getString("email") + "\t\t"
                        + cachedRowSet.getString("password") + "\t"
                );
            }

            // Modifying data in CachedRowSet
            cachedRowSet.absolute(1); // Go to the first row
            cachedRowSet.updateString("lastName", "Bhatta Kaji");
            cachedRowSet.updateRow(); // Save changes

            // Reconnect and synchronize changes to the database
            cachedRowSet.acceptChanges(conn); // Pass the connection for updating

            // Commit changes manually
            conn.commit();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
