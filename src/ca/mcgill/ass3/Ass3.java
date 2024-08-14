package ca.mcgill.ass3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ass3 {
    public static void main(String[] args) {
       //matrixSimple(5);
        //q1(7);
        // q2(3,6);
        //System.out.println(Arrays.toString(q4(4)));
        //int[] array = {-1, -2, 7, 6};
        //System.out.println(q5(array));
        //System.out.println(q7(array));
        //System.out.println(Arrays.toString(q8("ali")));
        //System.out.println(quest8("kangaroo"));
        //System.out.println(Arrays.toString(quest8("kangaroo")));

    }

    public static void matrixSimple(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

   /* Create a method to print the following image. This method must have one parameter, which is the length
    of the sides in number of *’s. This method should use only two for loops, and use if statements within the for
    loops to decide whether to draw a space or a star. You can assume the parameter is an odd number.*/

    public static void q1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i % 2 == 0) {
                    System.out.print("*");
                } else {
                    if (j == 0 || j == n - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }

                }


            }
            System.out.println();
        }
    }

    /*Change the method you just created to have two parameters, so that you can create rectangles. The first
parameter will be the height of the rectangle, and the second parameter will be the width of the rectangle*/

    public static void q2(int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i % 2 == 0) {
                    System.out.print("* ");
                } else {
                    if (j == 0 || j == m - 1) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }

                }
            }
            System.out.println();
        }
    }

    /*Write a method generateRandomArray() that takes as input an integer n and returns an array of size
n. The elements of the array should be random doubles between 0 (included) and 5 (excluded). You can use
Math.random() to do this.*/

    public static double[] q4(int n) {
        double[] array = new double[n];
        for (int i = 0; i < n; i++) {
            array[i] = (Math.random() * 5);
        }
        return array;
    }

    /*Write a method getLargestElement() that takes an array of integers as input and returns the largest element
inside the array. For example, if the input is: int[] arr= {1, 5, -3, 15, 4}; then getLargestElement(arr) should
return 15.*/

    public static int q5(int[] array) {
        int max = array[0];
        for (int element : array) {
            if (element > max) {
                max = element;
            }

        }
        return max;
    }


    //        for (int i = 0; i < array.length; i++) {
//            if (array[i]>max) {
//                max = array[i];
//            }
//        }return max;
    // }
    //}

    /*Write a method getSum() that takes an array of integers as input and returns the sum of all the elements inside
the array. For example, if the input is:
int[] arr= {1, 5,-3, 15, 4};*/

    public static int q6(int[] array) {
        int sum = 0;
        for (int element : array) {

            sum = sum + element;
        }
        return sum;
    }

    /*Write a method countNegatives() that takes an array of integers as input and returns the number of negative
numbers inside the array. For example, if the input is:
int[] arr= {1,5,-3, 15, -13}; */

    public static int q7(int[] array) {
        int count = 0;
        for (int element : array) {
            if (element < 0) {
                count += 1;
            }
        }
        return count;
    }


    /*Write a method getVowels() that takes a String as input and returns an array characters containing all the
vowels from the given string. For example, if the input is:
String s = "kangaroo";
then getVowels(s) should return {‘a’, ‘a’, ‘o’, ‘o’}*/

    public static char[] quest8(String string) {
        String vowels="aeiouAEIOU";
        StringBuilder stringBuilder=new StringBuilder();
        for (char c: string.toCharArray()) {
            if(vowels.indexOf(c)!=-1){
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString().toCharArray();

    }




}











