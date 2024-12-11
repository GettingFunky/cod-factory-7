package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Calculates factorial of a number
 */
public class Factorial {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum = 0;
        int facto = 1;
        int i = 1;

        System.out.println("Please insert input number");
        inputNum = in.nextInt();

        while (i <= inputNum) {
            facto = facto * i;
            System.out.println(facto);
            i++;
        }
//
//        while (i <= inputNum) {
//            facto = facto * i;
//            i++;
//        }

        System.out.printf("The factorial of %d is: %d",inputNum, facto);
}
}