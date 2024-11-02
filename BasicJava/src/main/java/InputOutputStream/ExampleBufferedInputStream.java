/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InputOutputStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

/**
 *
 * @author Deepak Bhatta Kaji
 */
public class ExampleBufferedInputStream {

    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("H:\\One Drive KMC\\OneDrive - Kailali Multiple Campus\\Documents\\NetBeansProjects\\BasicJava\\src\\main\\java\\InputOutputStream\\BufferBilli.txt");

            BufferedInputStream bis = new BufferedInputStream(fis);

            int i = bis.read();
            // System.out.println("First Character of file : "+ (char) i);

            while (i != -1) {
                System.out.print((char) i);
                i = bis.read();
            }
            bis.close();
        } catch (Exception ex) {
            System.out.println("Error : " + ex.getMessage());
        }
    }
}
