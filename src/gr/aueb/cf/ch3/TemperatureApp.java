package gr.aueb.cf.ch3;

import java.util.Scanner;

public class TemperatureApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputTemp;
        boolean isTempBelowZero = false;

        System.out.println("Please give a temperature");
        inputTemp = in.nextInt();
        isTempBelowZero = inputTemp < 0;

        System.out.printf("Temperature Below Zero: %b", isTempBelowZero);

    }
}
