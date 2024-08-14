package ca.mcgill.ass3;

import java.util.Scanner;
/*For this question you have to generalize the last question. The user will give you the number they want the
computer to count up to and the step by which it will do so.
When should I stop counting to?
25 <----
Which step should I use?
3 <----
I am counting to 25 with a step of 3:
1 4 7 10 13 16 19 22 25
*/
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
