package ca.mcgill.ass3;

import java.util.Scanner;

public class Quest10 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("when should I stop counting to: ");
        int n=scanner.nextInt();
        System.out.println("which step should I use? ");
        Scanner s=new Scanner(System.in);
        int m=s.nextInt();
        System.out.println("I am counting to "+n+" with the step of "+m);
        for(int i=1;i<=n;i=i+m){
            System.out.print(i+" ");
        }
    }
}
