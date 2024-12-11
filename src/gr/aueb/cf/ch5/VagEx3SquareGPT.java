package gr.aueb.cf.ch5;

import java.util.Scanner;

public class VagEx3SquareGPT {

    public static void main(String[] args) {
        int inputNum = getInput();
        int result = square(inputNum);
        displayResult(inputNum, result);
    }

    public static int getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer to get its square:");
        while (!scanner.hasNextInt()) {
            System.out.println("Error: Please enter a valid integer.");
            scanner.next(); // Clear invalid input
        }
        return scanner.nextInt();
    }

    public static void displayResult(int inputNum, int result) {
        System.out.printf("The square of %d is: %d%n", inputNum, result);
    }

    public static int square(int inputNum) {
        return inputNum * inputNum;
    }
}