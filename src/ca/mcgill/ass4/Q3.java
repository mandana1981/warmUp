package ca.mcgill.ass4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/*Modify your program so that, after reading all the content in the file, it prints how many words are
inside the text file. To do this, you should use the split method of the String class. Assume the only
character that separates words is whitespace " ".
*/
public class Q3 {
    public static void main(String[] args) {
        String filePath = "D:/LearningJava/tamrin.txt/";
        int count=0;

        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line= br.readLine()) !=null){
                String[] words = line.split(" ");
                count += words.length;
            }
            System.out.println("count is : " + count);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    }

