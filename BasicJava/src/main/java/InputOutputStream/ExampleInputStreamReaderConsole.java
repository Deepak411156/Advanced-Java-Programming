/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InputOutputStream;

import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Deepak Bhatta Kaji
 */
public class ExampleInputStreamReaderConsole {

    public static void main(String[] args) {
        try {

            InputStreamReader input = new InputStreamReader(System.in);

            System.out.println("Enter the Text : ");
            int byteData = input.read();
            while (byteData != -1) {
                char c = (char) byteData;
                System.out.println("Byte: " + c);
                byteData = input.read();
            }
            System.out.println("The character encoding of input: \n" + input.getEncoding());
            input.close();
        } catch (IOException ex) {
            System.out.println("Error : " + ex.getMessage());
        }
    }
}
