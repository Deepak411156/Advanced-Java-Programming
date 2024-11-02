/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InputOutputStream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 *
 * @author Deepak Bhatta Kaji
 */
public class ExampleFileWriter {

    public static void main(String[] args) {
        try {
            Writer fw = new FileWriter("H:\\One Drive KMC\\OneDrive - Kailali Multiple Campus\\Documents\\NetBeansProjects\\BasicJava\\src\\main\\java\\InputOutputStream\\WriterBilli.txt");

            String data = "Hello Billi, How are you?";
            fw.write(data);

            fw.close();
        } catch (IOException ex) {
            System.out.println("Error : " + ex.getMessage());
        }
    }
}
