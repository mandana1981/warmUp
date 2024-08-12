package ca.mcgill.ass2;

public class Ass2 {
    public static void main(String[] args) {
        //swap(4, 5);
        //System.out.println(quest3(2,3,1));
        //quest4p1();
        //quest4p3(1,9);
        //System.out.println(quest8("ban","bgl"));
        System.out.println(quest9("ahmad",'j','g'));

    }

    public static void swap(int a, int b) {
        System.out.println("a is: " + a + " and b is: " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a is: " + a + " and b is: " + b);
    }

    public static boolean quest3(int x, int y, int z) {
        if (z == 3 || z == x + y) {
            return true;
        } else {
            return false;
        }
    }

    public static void quest4p1() {
        double r = (Math.random()) * 10;
        System.out.println("double random is: " + r);
        int a = (int) r;
        System.out.println("integer random is: " + a);
    }

    public static void quest4p3(int x, int y) {
        int r = (int) ((Math.random()) * y) + x;
        System.out.println("int random between " + x + " and " + y + " is: " + r);
    }

    public static String quest7(String s) {
        int x = s.length();

        return s.substring(0, x / 2);
    }

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


