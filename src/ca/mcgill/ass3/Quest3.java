package ca.mcgill.ass3;

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



