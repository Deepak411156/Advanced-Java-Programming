/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InputOutputStream;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author Deepak Bhatta Kaji
 */
public class ExampleRandomAccessFile {

    public static void main(String[] args) {
        try {
            RandomAccessFile file = new RandomAccessFile("H:\\One Drive KMC\\OneDrive - Kailali Multiple Campus\\Documents\\NetBeansProjects\\BasicJava\\src\\main\\java\\InputOutputStream\\randomfile.txt", "rw");

            // Writing to the file
            file.writeBytes("Hello, this is line 1.\n");
            file.writeBytes("This is line 2.\n");

            // Reading from the file
            file.seek(0); // Move the pointer to the beginning of the file
            String line = file.readLine();
            while (line != null) {
                System.out.println(line);
                line = file.readLine();
            }
            file.seek(7); // Position after "Hello,"
            long filePointer = file.getFilePointer();
            byte[] remainingContent = new byte[(int) (file.length() - filePointer)];
            file.readFully(remainingContent); // Read the remaining content after the insertion point

            // Move the file pointer back to the insertion point
            file.seek(filePointer);

            // Write "This is line 2."
            file.writeBytes("Knightec Nepal ");

            // Write the remaining content back
            file.write(remainingContent);
        } catch (IOException ex) {
            System.out.println("Error : " + ex.getMessage());
        }
    }
}
