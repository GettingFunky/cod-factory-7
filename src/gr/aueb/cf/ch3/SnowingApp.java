package gr.aueb.cf.ch3;

import java.util.Scanner;

public class SnowingApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputTemp;
        boolean isTempBelowZero = false;
        boolean isItRaining = false;
        boolean isItSnowing;

        System.out.println("Is it raining? Please answer with a simple true/false");

        isItRaining = in.nextBoolean();

        System.out.println("Please give a temperature");
        inputTemp = in.nextInt();
        isTempBelowZero = inputTemp < 0;
        isItSnowing = isItRaining && isTempBelowZero;

        System.out.printf("Current snowing state: %b", isItSnowing);

        in.close();
    }
}
