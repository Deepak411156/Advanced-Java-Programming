/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BlobExamples;

import java.io.*;
import java.sql.*;

/**
 *
 * @author Deepak Bhatta Kaji
 */
public class WriteBlob {

    public static void main(String[] args) {

        Connection conn = null;
        PreparedStatement stmt = null;
        FileInputStream fis = null;

        String jdbcURL = "jdbc:mysql://localhost:3306/kmc_college";
        String username = "root";
        String password = "bhatta";

        String filePath = "H:\\One Drive KMC\\OneDrive - Kailali Multiple Campus\\Desktop\\My Image DBK.png";

        String sql = "INSERT INTO files (name, file_data) VALUES (?, ?)";

        try {

            conn = DriverManager.getConnection(jdbcURL, username, password);
            stmt = conn.prepareStatement(sql);
            fis = new FileInputStream(filePath);

            stmt.setString(1, "Sample Image");
            stmt.setBinaryStream(2, fis, fis.available());

            int rowsInserted = stmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new file was inserted successfully!");
            }

        } catch (SQLException | IOException ex) {
            ex.printStackTrace();
        }
    }
}
