package ca.mcgill.ass3;


    public class SquareOutline {
        public static void main(String[] args) {
            printSquareOutline(7);
        }

        public static void printSquareOutline(int length) {
            for (int i = 0; i < length; i++) {
                for (int j = 0; j < length; j++) {

                    if (i % 2 == 0) {
                        System.out.print("*");
                    } else {

                        if (j == 0 || j == length - 1) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                }
                System.out.println();
            }
        }
    }


