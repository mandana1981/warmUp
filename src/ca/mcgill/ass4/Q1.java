package ca.mcgill.ass4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

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