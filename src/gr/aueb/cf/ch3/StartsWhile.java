//package gr.aueb.cf.ch3;
//
//import java.util.Scanner;
//
///**
// * Prints 10 horizontal stars
// */
//public class StartsWhile {

//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int i = 1;
//        int j = 10;
//        int input_i = 0;
//
//        System.out.println("Δώσε αριθμό από αστεράκια");
//        input_i = in.nextInt();
//        while (i <= input_i) {
//            System.out.print("*");
//            i++;
//        }
//
//        System.out.println();
//
//        System.out.println("Δώσε αριθμό από αστεράκια");
//        j = in.nextInt();
//        while (j >= 1) {
//            System.out.print("*");
//            j--;
//        }
//    }
//}

package gr.aueb.cf.ch3;

import java.util.Scanner;

    /**
     * Prints x horizontal stars
     */
    public class StartsWhile {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int i = 1;
            int temp = 0;

            System.out.println("Δώσε αριθμό από αστεράκια");
            i = in.nextInt();
            temp = i;

            while (i >= 1) {
                System.out.print("*");
                i--;
            }

            System.out.println();

            while (temp >= 1) {
                System.out.print("*");
                temp--;
            }
        }
    }
