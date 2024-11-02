/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InputOutputStream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

/**
 *
 * @author Deepak Bhatta Kaji
 */
public class ExampleStreamTokenizer {

    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("H:\\One Drive KMC\\OneDrive - Kailali Multiple Campus\\Documents\\NetBeansProjects\\BasicJava\\src\\main\\java\\InputOutputStream\\tokenizer.txt");
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println("Hello! Please take this 20000/-"); // Writing to file
            printWriter.close();

            StreamTokenizer tokenizer = new StreamTokenizer(new FileReader("H:\\One Drive KMC\\OneDrive - Kailali Multiple Campus\\Documents\\NetBeansProjects\\BasicJava\\src\\main\\java\\InputOutputStream\\tokenizer.txt"));
            while (tokenizer.nextToken() != StreamTokenizer.TT_EOF) {
                if (tokenizer.ttype == StreamTokenizer.TT_WORD) {
                    System.out.println("Word: " + tokenizer.sval);
                } else if (tokenizer.ttype == StreamTokenizer.TT_NUMBER) {
                    System.out.println("Number: " + tokenizer.nval);
                } else if (tokenizer.ttype == StreamTokenizer.TT_EOF) {
                    System.out.println("End of file reached");
                }
            }
        } catch (IOException ex) {
            System.out.println("Error : " + ex.getMessage());
        }
    }
}
