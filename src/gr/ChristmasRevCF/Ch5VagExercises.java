package gr.ChristmasRevCF;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ch5VagExercises {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        while(true) {
            System.out.println();
            int starsCount = getValidPositiveNum(sc, "Provide number of stars to initiate the Stars App");

            printMenu();
            System.out.println();
            int userNum = getValidPositiveNum(sc, "Provide an Integer from the Menu");


            if (userNum == 6) {
                System.out.println("Exiting Program...");
                break;
            }
            switch (userNum) {
                case 1:
                    System.out.println();
                    System.out.println("*****************************************************************");
                    System.out.println("1. N stars horizontally");
                    System.out.println("*****************************************************************");
                    System.out.println();

                    nStarsHorizontally(starsCount);
                    break;
                case 2:
                    System.out.println();
                    System.out.println("*****************************************************************");
                    System.out.println("2. N stars vertically");
                    System.out.println("*****************************************************************");
                    System.out.println();

                    nStarsVertically(starsCount);
                    break;
                case 3:
                    System.out.println();
                    System.out.println("*****************************************************************");
                    System.out.println("3. N stars horizontally and vertically");
                    System.out.println("*****************************************************************");
                    System.out.println();

                    nStarsHorizAndVertically(starsCount);
                    break;
                case 4:
                    System.out.println();
                    System.out.println("*****************************************************************");
                    System.out.println("4. N stars gradually Ascending");
                    System.out.println("*****************************************************************");
                    System.out.println();

                    nStarsGradualAsc(starsCount);
                    break;
                case 5:
                    System.out.println();
                    System.out.println("*****************************************************************");
                    System.out.println("5. N stars gradually Descending");
                    System.out.println("*****************************************************************");
                    System.out.println();

                    nStarsGradualDesc(starsCount);
                    break;
                default:
                    System.out.println("Error in choice ");
                    break;

            }

    }
        System.out.println();
        System.out.println("*****************************************************************");
        System.out.println("Fahrenheit to Celsius Conversion");
        System.out.println("*****************************************************************");

        int userChoice = getValidPositiveNum(sc, "Please provide a temperature in Fahrenheit, to be converted to Celsius");

        temperatureConverter(userChoice);

        System.out.println();
        System.out.println("*****************************************************************");
        System.out.println("Square");
        System.out.println("*****************************************************************");

        userChoice = getValidPositiveNum(sc, "Please provide a number to calculate its square");

        squareNum(userChoice);

        System.out.println();
        System.out.println("*****************************************************************");
        System.out.println("Prime Number Finder");
        System.out.println("*****************************************************************");

        userChoice = getValidPositiveNum(sc, "Please provide a number to find if it is Prime");

        System.out.printf("Your number is prime: %s", isPrime(userChoice) ? "true" : "false");

        System.out.println();
        System.out.println("*****************************************************************");
        System.out.println("Maximum Number Finder");
        System.out.println("*****************************************************************");

        maxNumFinder(sc) ;

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

    public static void printMenu() {
        System.out.println("Επιλέξτε ένα από τα παρακάτω:");
        System.out.println("1. Οριζόντια Αστεράκια");
        System.out.println("2. Κάθετα Αστεράκια");
        System.out.println("3. nxm Αστεράκια");
        System.out.println("4. Ascending Αστεράκια");
        System.out.println("5. Descending Αστεράκια");
        System.out.println("6. Έξοδος");
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
            nStarsHorizontally(userNum);
            System.out.println();
        }
    }

    public static void nStarsGradualAsc(int userNum) {
        for (int i = 1; i <= userNum; i++) {
            nStarsHorizontally(i);
            System.out.println();
        }
    }

    public static void nStarsGradualDesc(int userNum) {
        for (int i = userNum; i >= 1; i--) {
            nStarsHorizontally(i);
            System.out.println();
        }
    }

    public static void temperatureConverter(int userChoice) {
        int celsius = 5 * (userChoice - 32) / 9;
        System.out.printf("%d Fahrenheit degrees are converted to %d Celsius degrees \n", userChoice, celsius);
    }

    public static void squareNum(int userChoice) {
        System.out.printf("Square of %d is: %d\n", userChoice, userChoice * userChoice);
    }

    public static boolean isPrime(int userNum) {
        boolean isPrime = true;
        for (int i = 2; i < userNum; i++) {
            if (userNum % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }


    public static void maxNumFinder(Scanner sc) {
        System.out.println("Let's find the maximum number among 3 integers");
        int num1 = getValidPositiveNum(sc, "Please provide the first integer");
        int num2 = getValidPositiveNum(sc, "Please provide the second integer");
        int num3 = getValidPositiveNum(sc, "Please provide the third and last integer");
        int maxNum = Math.max(num1, Math.max(num2, num3));
        System.out.printf("Max number among %d, %d, and %d, is: %d \n", num1, num2, num3, maxNum);
    }
}
