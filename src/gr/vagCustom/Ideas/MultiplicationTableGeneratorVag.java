package gr.vagCustom.Ideas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiplicationTableGeneratorVag {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("*************************************************");
        System.out.println(" Welcome to the Multiplication Table Generator");
        System.out.println("*************************************************");

        int numberToMultiply = getValidNumber(sc, "Enter the number to generate its multiplication table: ");
        int startRange = getValidNumber(sc, "Enter the starting range: ");
        int endRange = getValidNumber(sc, "Enter the ending range: ");

        while (startRange > endRange) {
            System.out.println("Starting range must be less than or equal to ending range. Please re-enter.");
            startRange = getValidNumber(sc, "Enter the starting range: ");
            endRange = getValidNumber(sc, "Enter the ending range: ");
        }

        System.out.printf("Generating multiplication table of %d from %d to %d...\n", numberToMultiply, startRange, endRange);
        timeDelay(2000);

        generateMultiplicationTable(numberToMultiply, startRange, endRange);

        System.out.println("Thank you for using the Multiplication Table Generator!");
    }

    public static int getValidNumber(Scanner sc, String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
                sc.next(); // Clear invalid input
            }
        }
    }

    public static void timeDelay(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            System.out.println("Unexpected error during delay.");
        }
    }

    public static void generateMultiplicationTable(int number, int start, int end) {
        System.out.println("*****************************");
        System.out.printf("Multiplication Table of %d\n", number);
        System.out.println("*****************************");
        for (int i = start; i <= end; i++) {
            System.out.printf("%d * %d = %d\n", number, i, number * i);
        }
    }
}
