package gr.ChristmasRevCF;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ch4VagExercises {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userNum = getValidPositiveNum(sc, "Provide an Integer to initiate the Stars App");

        System.out.println();
        System.out.println("*****************************************************************");
        System.out.println("1. N stars horizontally");
        System.out.println("*****************************************************************");
        System.out.println();

        nStarsHorizontally(userNum);

        System.out.println();
        System.out.println("*****************************************************************");
        System.out.println("2. N stars vertically");
        System.out.println("*****************************************************************");
        System.out.println();

        nStarsVertically(userNum);

        System.out.println();
        System.out.println("*****************************************************************");
        System.out.println("3. N stars horizontally and vertically");
        System.out.println("*****************************************************************");
        System.out.println();

        nStarsHorizAndVertically(userNum);

        System.out.println();
        System.out.println("*****************************************************************");
        System.out.println("4. N stars gradually Ascending");
        System.out.println("*****************************************************************");
        System.out.println();

        nStarsGradualAsc(userNum);

        System.out.println();
        System.out.println("*****************************************************************");
        System.out.println("5. N stars gradually Descending");
        System.out.println("*****************************************************************");
        System.out.println();

        nStarsGradualDesc(userNum);

    }

    public static int getValidPositiveNum(Scanner sc, String prompt) {
        while(true) {
            try {
                System.out.println(prompt);
                int input = sc.nextInt(); // Read input once
                if (input <= 0) {
                    System.out.println("Please provide a positive number.");
                    continue; // Loop again for new input
                }
                return input; // Return the valid number
            } catch (InputMismatchException e) {
                System.out.println("Provide a valid integer");
                sc.next(); // Clear invalid input
            }
        }
    }


    public static void nStarsHorizontally(int userNum) {
        for (int i = 1; i <= userNum; i++) {
            System.out.print("*");
        }
    }

    public static void nStarsVertically(int userNum) {
        for (int i = 1; i <= userNum; i++) {
            System.out.println("*");
        }
    }

    public static void nStarsHorizAndVertically(int userNum) {
        for (int i = 1; i <= userNum; i++) {
            for (int j = 1; j <= userNum; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void nStarsGradualAsc(int userNum) {
        for (int i = 1; i <= userNum; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void nStarsGradualDesc(int userNum) {
        for (int i = 1; i <= userNum; i++) {
            for (int j = userNum; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
