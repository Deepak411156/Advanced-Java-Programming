/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InputOutputStream;

import java.io.FileInputStream;
import java.io.InputStream;

/**
 *
 * @author Deepak Bhatta Kaji
 */
public class ExampleInputStream {

    public static void main(String[] args) {
        try {
            InputStream input = new FileInputStream("H:\\One Drive KMC\\OneDrive - Kailali Multiple Campus\\Documents\\NetBeansProjects\\BasicJava\\src\\main\\java\\InputOutputStream\\Billi.txt");
            int countSize = input.available();
            byte[] array = new byte[countSize];
            input.read(array);

            String fileContent = new String(array);
            System.out.println("The File has Following Data: \n" + fileContent);

            input.close();
        } catch (Exception ex) {
            System.out.println("Error : " + ex.getMessage());
        }
    }
}
