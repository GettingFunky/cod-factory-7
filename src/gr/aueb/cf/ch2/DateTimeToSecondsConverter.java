package gr.aueb.cf.ch2;

import java.util.Scanner;

public class DateTimeToSecondsConverter {

    public static void main(String[] args) {
        int days = 0;
        int hours = 0;
        int minutes = 0;
        int seconds = 0;
        int totalSec = 0;
        Scanner in = new Scanner(System.in) ;

        System.out.println("Dwste arithmo imerwn, wrwn, leptwn kai defteroleptwn");
        days = in.nextInt();
        hours = in.nextInt();
        minutes = in.nextInt();
        seconds = in.nextInt();
        totalSec = days * 24 * 3600 + hours * 3600 + minutes * 60 + seconds ;

        System.out.printf("To synolo twn defteroleptwn einai %,d seconds", totalSec);
    }
}
