package ca.mcgill.ass4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*Create a new method in your program which takes your ArrayList of Strings, and writes it to a file. Use
the FileWriter and BufferedWriter classes in order to access the file and write the Strings. In the output
file, there should be one String per line, just like the original file you loaded the ArrayList from.*/
public class Q4 {
    public static void main(String[] args) {
        ArrayList<String> lines = new ArrayList<>();
        lines.add("i am mandana");
        lines.add("i am 43");
        lines.add("i am married");
        String filePath="E:/JavaProjects/warmUp/output.txt";
        try
                (BufferedWriter br=new BufferedWriter(new FileWriter(filePath))){
        for(String line:lines){
            br.write(line);
            br.newLine();
        }
        br.close();

    }catch (IOException e){
        e.printStackTrace();}
        System.out.println("written to file");
    }

}
