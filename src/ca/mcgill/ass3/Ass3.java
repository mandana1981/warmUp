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

    public static double[] q4(int n) {
        double[] array = new double[n];
        for (int i = 0; i < n; i++) {
            array[i] = (Math.random() * 5);
        }
        return array;
    }


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
    public static int q6(int[] array) {
        int sum = 0;
        for (int element : array) {

            sum = sum + element;
        }
        return sum;
    }

    public static int q7(int[] array) {
        int count = 0;
        for (int element : array) {
            if (element < 0) {
                count += 1;
            }
        }
        return count;
    }

    public static Character[] q8(String string) {

        List<Character> list = new ArrayList<Character>();

        for (int i = 0; i < string.length(); i++) {

            char c = string.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                list.add(c);

            }
        }
        return list.toArray(new Character[0]);
    }

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











