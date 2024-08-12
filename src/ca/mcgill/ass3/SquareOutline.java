package ca.mcgill.ass3;


    public class SquareOutline {
        public static void main(String[] args) {
            printSquareOutline(7); // Change the number to any odd number to test
        }

        public static void printSquareOutline(int length) {
            for (int i = 0; i < length; i++) {
                for (int j = 0; j < length; j++) {
                    // For odd lines, print all '*'
                    if (i % 2 == 0) {
                        System.out.print("*");
                    } else {
                        // For even lines, print '*' at the start and end, and ' ' in between
                        if (j == 0 || j == length - 1) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                }
                System.out.println(); // Move to the next line after each row is printed
            }
        }
    }


