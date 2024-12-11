package gr.aueb.cf.ch2;

import java.util.Scanner;

public class DateFormat {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int day, month, year = 0;

        System.out.println("Please provide 3 day, month and year");

        day = in.nextInt();
        month = in.nextInt();
        year = in.nextInt();

        System.out.printf("Η ημερομηνία είναι: %02d/%02d/%02d", day, month, year % 100);
    }
}
