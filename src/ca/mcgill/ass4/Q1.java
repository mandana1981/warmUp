package ca.mcgill.ass4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/*Write a program that opens a .txt, reads the contents of the file line by line, and prints the content of
each line. To do this, you should look up how to use the BufferedReader or FileReader class.Remember to use the try and catch blocks to handle errors like trying to open an non-existent file. A sample file for
testing file reading is found in the provided files as dictionary.txt.*/

public class Q1 {
    public static void main(String[] args) {
        String filePath = "D:/LearningJava/tamrin.txt/";

        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line= br.readLine()) !=null){
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}