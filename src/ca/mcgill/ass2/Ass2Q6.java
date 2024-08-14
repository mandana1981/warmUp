package ca.mcgill.ass2;

/*For this question you have to generalize the last question. The user will give you the number they want the
computer to count up to and the step size by which it will do so.
> run Counting 25 3
I am counting to 25 with a step size of 3:
1 4 7 10 13 16 19 22 25 */

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
