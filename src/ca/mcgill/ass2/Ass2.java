package ca.mcgill.ass2;

public class Ass2 {
    public static void main(String[] args) {
        //swap(4, 5);
        //System.out.println(quest3(2,3,1));
        //quest4p1();
        //quest4p3(1,9);
        //System.out.println(quest8("ban","bgl"));
        //System.out.println(quest9("ahmad",'j','g'));

    }
/*Write a method swap which takes as input two int values x and y. Your method should do 3 things:
1. Print the value of x and y
2. Swap the values of the variables x and y, so that whatever was in x is now in y and whatever was in y is
now in x
3. Print the value of x and y again*/

    public static void swap(int a, int b) {
        System.out.println("a is: " + a + " and b is: " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a is: " + a + " and b is: " + b);
    }
    /*Write a method that takes three integers x, y, and z as input. This method returns true if z is equal to 3 or if z is
equal to the sum of x and y, and false otherwise.*/

    public static boolean quest3(int x, int y, int z) {
        if (z == 3 || z == x + y) {
            return true;
        } else {
            return false;
        }
    }
    /*Let’s write a method incrementally:
1. Start by writing a method called getRandomNumber that takes no inputs, and returns a random double
between 0 (included) and 10 (excluded)*/

    public static void quest4p1() {
        double r = (Math.random()) * 10;
        System.out.println("double random is: " + r);
        int a = (int) r;
        System.out.println("integer random is: " + a);
    }
    /*Now, modify it so that it returns a random int between 0 and 10 (still excluded).
3. Finally, let the method take two integers min and max as inputs, and return a random integer greater
than or equal to min and less than max*/

    public static void quest4p3(int x, int y) {
        int r = (int) ((Math.random()) * y) + x;
        System.out.println("int random between " + x + " and " + y + " is: " + r);
    }
    /*Write a method getFirstHalf() that takes as input a String and returns a String composed of the first half of the
characters from the specified String. For example, getFirstHalf("cucumber") returns the String "cucu", while
getFirstHalf("apple") returns the String "ap" (thus, if the number of characters is odd, you should round down). */

    public static String quest7(String s) {
        int x = s.length();

        return s.substring(0, x / 2);
    }
    /*Write a method alphaString() which takes two Strings as input and returns the String between the two that
comes first in the alphabet. For example, alphaString("banana", "apple") returns the String "apple", while
alphaString("snake", "squirrel") returns the String "snake". */

    public static String quest8(String s1, String s2) {
        if (s1.compareTo(s2) >0) {
            return s2;
        }else {
            return s1;
        }
        //        Character x = s1.charAt(0);
//        Character y = s2.charAt(0);
//        if (x.compareTo(y) > 0) {
//            return s2;
//        }
//        if (x.compareTo(y) < 0) {
//            return s1;
//        }
//        if (x.equals(y)) {
//            Character z = s1.charAt(1);
//            Character w = s2.charAt(1);
//            if (z.compareTo(w) > 0) {
//                return s2;
//            } else
//                return s1;
//
//        }
//        return null;

        }
        /*Write a method replaceAll() which takes as input a String and two characters. The method returns the String
composed by the same characters of the given String where all occurrences of the first given character are
Page 3
replaces by the second given character. For example, replaceAll("squirrel", ’r’ , ’s’) returns the String
"squissel", while replaceAll("squirrel", ’t’, ’a’) returns the String "squirrel".
*/
        public static String quest9(String s,Character a,Character b) {
        String sa=String.valueOf(a);
        String sb=String.valueOf(b);
        if (s.contains(sa)){
            String s1=s.replace(a,b);
            return s1;
        }else {
            return s;
        }


    }



    }


