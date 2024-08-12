package ca.mcgill.ass2;

public class Ass2Q5 {
    public static void main(String[] args) {
        System.out.println("I am counting untill: "+ args[0]);
        int x=Integer.parseInt(args[0]);
        for (int i = 1; i < x; i++) {
            System.out.print(i+" ");
        }

    }
}
