package ca.mcgill.ass2;

/*Create a file called Counting.java, and in this file, declare a class called Counting. This program takes as input
from the user (using args) a positive integer and counts up until that number. eg:
> run Counting 10
I am counting until 10: 1 2 3 4 5 6 7 8 9 10*/

public class Ass2Q5 {
    public static void main(String[] args) {
        System.out.println("I am counting untill: "+ args[0]);
        int x=Integer.parseInt(args[0]);
        for (int i = 1; i < x; i++) {
            System.out.print(i+" ");
        }

    }
}
