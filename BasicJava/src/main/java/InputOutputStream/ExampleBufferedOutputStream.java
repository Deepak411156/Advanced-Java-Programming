/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InputOutputStream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Deepak Bhatta Kaji
 */
public class ExampleBufferedOutputStream {

    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("H:\\One Drive KMC\\OneDrive - Kailali Multiple Campus\\Documents\\NetBeansProjects\\BasicJava\\src\\main\\java\\InputOutputStream\\BufferBilli.txt");

            BufferedOutputStream bos = new BufferedOutputStream(fos);

            String data = "Hello Billi, How are you?";
            byte[] array = data.getBytes();
            bos.write(array);

            bos.close();
        } catch (IOException ex) {
            System.out.println("Error : " + ex.getMessage());
        }
    }
}
