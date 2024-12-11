package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Converts years(age) to days
 */
public class YearsToDays {

    public static void main(String[] args) {
        int yearsInput = 0;
        int days = 0;
        final int DAYS_PER_YEAR = 365;

        System.out.println("Παρακαλώ δώστε αριθμό ετών για να μετατραπούν σε ημέρες");
        Scanner in = new Scanner(System.in);
        yearsInput = in.nextInt();
        days = yearsInput * DAYS_PER_YEAR;

        System.out.printf("Η μετατροπή %d ετών σε ημέρες είναι: %d", yearsInput, days);
    }
}
