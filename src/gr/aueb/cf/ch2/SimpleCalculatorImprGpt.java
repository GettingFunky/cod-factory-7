package gr.aueb.cf.ch2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * getIntInput method: Handles integer input and catches invalid entries, ensuring the user provides valid integers.
 * Guard against division by zero: Added a check for division and modulo operations.
 * Modularized methods: Each operation is split into a separate method for better code organization.
 * Try-with-resources: Automatically closes the Scanner after use, improving resource management.
 * These improvements make the code easier to maintain and more robust for real-world use.
 */
public class SimpleCalculatorImprGpt {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Please enter two integers for calculation:");

            int number1 = getIntInput(in, "First number: ");
            int number2 = getIntInput(in, "Second number: ");

            System.out.printf("Addition: %d\n", add(number1, number2));
            System.out.printf("Subtraction: %d\n", subtract(number1, number2));
            System.out.printf("Multiplication: %d\n", multiply(number1, number2));

            if (number2 != 0) {
                System.out.printf("Division: %d\n", divide(number1, number2));
                System.out.printf("Modulo: %d\n", modulo(number1, number2));
            } else {
                System.out.println("Division by zero is undefined.");
            }

            System.out.printf("Power: %d\n", power(number1, number2));
            System.out.printf("Max: %d\n", Math.max(number1, number2));
            System.out.printf("Min: %d\n", Math.min(number1, number2));
        }
    }

    private static int getIntInput(Scanner in, String prompt) {
        System.out.print(prompt);
        while (true) {
            try {
                return in.nextInt();
            } catch (InputMismatchException e) {
                System.out.print("Invalid input. Please enter an integer: ");
                in.next(); // Clear invalid input
            }
        }
    }

    private static int add(int a, int b) {
        return a + b;
    }

    private static int subtract(int a, int b) {
        return a - b;
    }

    private static int multiply(int a, int b) {
        return a * b;
    }

    private static int divide(int a, int b) {
        return a / b;
    }

    private static int modulo(int a, int b) {
        return a % b;
    }

    private static int power(int a, int b) {
        return (int) Math.pow(a, b);
    }
}
