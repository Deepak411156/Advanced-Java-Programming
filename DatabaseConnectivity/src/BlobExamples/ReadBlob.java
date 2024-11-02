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
public class ReadBlob {

    public static void main(String[] args) {

        Connection conn = null;
        PreparedStatement stmt = null;
        InputStream inputStream;
        FileOutputStream outputStream;

        String jdbcURL = "jdbc:mysql://localhost:3306/kmc_college";
        String username = "root";
        String password = "bhatta";

        String sql = "SELECT name, file_data FROM files WHERE id=?";

        try {

            conn = DriverManager.getConnection(jdbcURL, username, password);
            stmt = conn.prepareStatement(sql);

            stmt.setInt(1, 1); // Specify the ID of the file to retrieve

            ResultSet result = stmt.executeQuery();
            if (result.next()) {
                String fileName = result.getString("name");
                inputStream = result.getBinaryStream("file_data");

                // Specify the path to save the file
                outputStream = new FileOutputStream("H:\\One Drive KMC\\OneDrive - Kailali Multiple Campus\\Documents\\NetBeansProjects\\DatabaseConnectivity\\src\\BlobExamples\\output_" + fileName + ".png");

                byte[] buffer = new byte[1024];
                int bytesRead = -1;

                // Read the binary stream and write to the file
                while ((bytesRead = inputStream.read(buffer)) != -1) {
                    outputStream.write(buffer, 0, bytesRead);
                }

                outputStream.close();
                inputStream.close();

                System.out.println("File saved: output_" + fileName);
            }

        } catch (SQLException | IOException ex) {
            ex.printStackTrace();
        }
    }
}
