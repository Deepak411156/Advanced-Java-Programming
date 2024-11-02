/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InputOutputStream;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;
/**
 *
 * @author Deepak Bhatta Kaji
 */
public class ExampleInputStreamReader {

    public static void main(String[] args) {
        try {

            FileInputStream file = new FileInputStream("H:\\One Drive KMC\\OneDrive - Kailali Multiple Campus\\Documents\\NetBeansProjects\\BasicJava\\src\\main\\java\\InputOutputStream\\OutputStreamWriter.txt");

            InputStreamReader input = new InputStreamReader(file);

            char[] array = new char[500];

            input.read(array);

            System.out.println("The File has Following Data: \n" + String.valueOf(array));
            System.out.println("The character encoding of input: \n" + input.getEncoding());
            input.close();
        } catch (IOException ex) {
            System.out.println("Error : " + ex.getMessage());
        }
    }
}
