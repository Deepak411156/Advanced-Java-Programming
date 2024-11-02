/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InputOutputStream;

import java.io.IOException;
import java.io.Reader;

/**
 *
 * @author Deepak Bhatta Kaji
 */
public class ExampleFileReader {

    public static void main(String[] args) {
        try {
            Reader fr = new java.io.FileReader("H:\\One Drive KMC\\OneDrive - Kailali Multiple Campus\\Documents\\NetBeansProjects\\BasicJava\\src\\main\\java\\InputOutputStream\\WriterBilli.txt");

            char[] array = new char[100];
            fr.read(array);

            System.out.println("The File has Following Data: \n" + String.valueOf(array));

            fr.close();
        } catch (IOException ex) {
            System.out.println("Error : " + ex.getMessage());
        }
    }
}
