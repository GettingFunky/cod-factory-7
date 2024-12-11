package gr.aueb.cf.ch2;

import java.util.Scanner;

public class FahreneitToCelsius {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputFahreneit = 0;
        int celsius;

        System.out.println("Παρακαλώ δώστε βαθμούς Fahreneit ώστε να μετατραπούν σε βαθμούς Κελσίου");

        inputFahreneit = in.nextInt();
        celsius = 5 * (inputFahreneit - 32) / 9;

        System.out.printf("Οι %d βαθμοί Fahreneit ισούνται με %d βαθμούς Κελσίου", inputFahreneit, celsius);
    }
}
