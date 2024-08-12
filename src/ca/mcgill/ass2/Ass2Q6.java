package ca.mcgill.ass2;

public class Ass2Q6 {
    public static void main(String[] args) {
        System.out.println("I am counting untill: "+ args[0]+" with a step size of:  "+args[1]);
        int x=Integer.parseInt(args[0]);
        int y=Integer.parseInt(args[1]);
        for(int i=1;i<x;i=i+y){
            System.out.print(i+"   ");

        }
    }
}
