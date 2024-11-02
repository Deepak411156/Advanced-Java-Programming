/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InputOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 *
 * @author Deepak Bhatta Kaji
 */
public class ExampleOutputStreamConsole {

    public static void main(String args[]) {
        try {

            FileOutputStream file = new FileOutputStream("H:\\One Drive KMC\\OneDrive - Kailali Multiple Campus\\Documents\\NetBeansProjects\\BasicJava\\src\\main\\java\\InputOutputStream\\OutputStreamWriter_new.txt");
            OutputStreamWriter OSW = new OutputStreamWriter(file);

            OSW.write("Hello World\n");
            OSW.write(97); //a
            OSW.write(98); //b
            OSW.write(99); //c
            OSW.write(49); //1
            OSW.write(50); //2
            OSW.write(51); //3
            OSW.write(10);// Space
            OSW.write('A');
            OSW.write('B');
            OSW.write('C');
            OSW.write('1');
            OSW.write('2');
            OSW.write('3');
            OSW.write('\n');
            
            OSW.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
