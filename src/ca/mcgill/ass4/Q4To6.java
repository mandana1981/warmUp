package ca.mcgill.ass4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Q4To6 {
    public static void main(String[] args) {
        ArrayList<String> lines = new ArrayList<>();
        lines.add("i am mandana and i have 43 years old");
        lines.add("my name is mandana");
        lines.add("my name is mandana soleimani nia");
        //System.out.println("first print is: " + lines);
        //String filePath = "E:/JavaProjects/warmUp/output.txt";
        //writeArrayInFile(lines, filePath);
       // sortArrays(lines);
        //System.out.println("second print is: " + lines);
        System.out.println("new sorted is: " + sortQ6(lines,20,40));



    }

    /*Create a new method in your program which takes your ArrayList of Strings, and writes it to a file. Use
the FileWriter and BufferedWriter classes in order to access the file and write the Strings. In the output
file, there should be one String per line, just like the original file you loaded the ArrayList from.*/

    public static void writeArrayInFile(ArrayList<String> lines, String filePath) {

        try
                (BufferedWriter br = new BufferedWriter(new FileWriter(filePath))) {
            for (String line : lines) {
                br.write(line);
                br.newLine();
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("written to file");
    }
    /*Create a new method in your program which takes as input your ArrayList of Strings, and sort all the
elements. The sorting criterion will be the length of the string. In other words, after calling this method,
the shortest string must be located in the first position, the second shortest in the second position and
so on.
*/

    public static void sortArrays(ArrayList<String> lines) {
        //Comparator<String> is an interface that defines a method for comparing two objects of type String.
        //The compare method is the single abstract method in this interface.
        Collections.sort(lines, new Comparator<String>() {
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        });


    }

    /*Create a new method in your program which takes as input a sorted ArrayList (see the previous question
for details about the sorting criterion) and two ints. The two ints will represent a range of values. This
method should return an ArrayList with all the Strings whose length is inside that range. For example, if
your original ArrayList is equal to {"aa","aaa","aaaa","aaaaa"} and the two ints are 3 and 4, your method
must return the ArrayList{"aaa","aaaa"} (because the length of the returned Strings is within 3 and 4).*/

    public static ArrayList<String> sortQ6(ArrayList<String> list, int a, int b) {
        ArrayList<String> newList = new ArrayList<>();
        for (String str : list) {
            int x = str.length();
            if (x > a && x < b) {
                newList.add(str);
            }

        }
        return newList;

    }


}






