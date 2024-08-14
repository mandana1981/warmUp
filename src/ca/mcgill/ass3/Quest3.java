package ca.mcgill.ass3;

/*Write a program to display the (x,y) coordinates up to (9,9) of the upper right quadrant of a Cartesian plane. As
in the previous warm-up question, your solution should use two nested for loops. Your program should also
display the axes, by checking to see if the x-coordinate is zero or if the y-coordinate is zero. Note that when
both the x and y coordinates are zero, you should print a + character.
*/
public class Quest3 {
    public static void main(String[] args) {

        for (int i = 3; i >= 0; i--) {
            for (int j = 0; j <=3; j++) {
                if(i==0 && j==0){
                    System.out.print("+ ");

                }else if(i==0 ){
                    System.out.print("_");
                    }else if(j==0) {
                    System.out.print("|");

                    }else {
                    System.out.printf("(%d,%d)", i, j);
                }

                }
            System.out.println();
            }
        }
    }



