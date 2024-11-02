/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InputOutputStream;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.nio.charset.Charset;

/**
 *
 * @author Deepak Bhatta Kaji
 */
public class ExampleOutputStreamWriter {

    public static void main(String[] args) {
        try {

            FileOutputStream file = new FileOutputStream("H:\\One Drive KMC\\OneDrive - Kailali Multiple Campus\\Documents\\NetBeansProjects\\BasicJava\\src\\main\\java\\InputOutputStream\\OutputStreamWriter.txt");
            String data = "Hello Billi, How are you?";

            OutputStreamWriter output1 = new OutputStreamWriter(file);
            OutputStreamWriter output2 = new OutputStreamWriter(file, Charset.forName("UTF16"));
            output1.write(data);
            System.out.println("Character encoding of output1: " + output1.getEncoding());
            System.out.println("Character encoding of output2: " + output2.getEncoding());
            output1.close();
            output2.close();
        } catch (IOException ex) {
            System.out.println("Error : " + ex.getMessage());
        }
    }
}
