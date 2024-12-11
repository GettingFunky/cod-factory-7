package gr.aueb.cf.ch3;

/**
 * Figures out whether a year is a leap year
 */

import java.util.Scanner;

public class LeapYearVagch3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inpYear = 0;
        int i = 1;

        System.out.println("Please give a year");
        do {

        inpYear = sc.nextInt();

        if (inpYear % 4 != 0) {
            System.out.println("Not a leap year");

        }   else if (inpYear % 100 == 0 && inpYear % 400 != 0) {
            System.out.println("Not a leap year");

        }   else {System.out.println("Leap Year");
        }

        i++;

            System.out.println("Please provide another year");

   } while (i <= 5 );
    }

}