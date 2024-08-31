package ca.mcgill.ass4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Q2 {
    public static void main(String[] args) {
        ArrayList<String> lineList = new ArrayList<>();
        String filePath = "D:/LearningJava/tamrin.txt/";
        try{
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String line ;
        while((line = br.readLine()) != null){
            lineList.add(line);
        }
        for(String s : lineList){
            System.out.println(s);
        }
        }catch (IOException e){
        e.printStackTrace();}
    }
}
