/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InputOutputStream;

import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 *
 * @author Deepak Bhatta Kaji
 */
public class ExampleOutputStream {

    public static void main(String[] args) {
        try {
            String data = "Hello Welcome to JAVA World!";
            OutputStream output = new FileOutputStream("H:\\One Drive KMC\\OneDrive - Kailali Multiple Campus\\Documents\\NetBeansProjects\\BasicJava\\src\\main\\java\\InputOutputStream\\Billi.txt");
            byte[] array = data.getBytes();
            output.write(array);

            output.close();
        } catch (Exception ex) {
            System.out.println("Error : " + ex.getMessage());
        }
    }
}
