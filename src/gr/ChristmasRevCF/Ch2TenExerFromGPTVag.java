package gr.ChristmasRevCF;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 1. ATM Euros App
 * Write a program that simulates cash withdrawal from an ATM. The program will:
 * Read the amount to withdraw from the user.
 * Calculate the number of 500, 100, 50, 20, 10 euro bills needed.
 * Print the number of each type of bill and the remaining amount in 1-euro coins.
 *
 * 2. Sum of Digits
 * Write a program that:
 * Reads a positive integer from the user.
 * Calculates the sum of its digits.
 * Displays the result.
 * Example:
 * Input: 1234
 * Output: 10 (1 + 2 + 3 + 4)
 *
 * 3. Counter App
 * Write a program that:
 * Allows the user to count different types of items (e.g., books, pencils).
 * Supports increment, decrement, reset, and display functions for the counter.
 * Provides the user with a menu to perform these operations.
 *
 * 4. Time to Seconds Conversion
 * Write a program that:
 * Reads hours, minutes, and seconds from the user.
 * Calculates and displays the total number of seconds.
 * Example:
 * Input: 2 hours, 30 minutes, 45 seconds
 * Output: 9045 seconds
 *
 * 5. Frog Jumps App
 * Write a program that:
 * Reads the distance X the frog needs to jump and the distance D it covers in one jump.
 * Calculates and displays the minimum number of jumps the frog needs to cover the distance.
 * Example:
 * Input: Distance = 15, Jump = 5
 * Output: 3 jumps
 *
 * 6. Price with VAT Calculation
 * Write a program that:
 * Reads the net price of a product.
 * Calculates and displays the final price with a VAT of 24%.
 * Example:
 * Input: Net price = 100
 * Output: Final price = 124
 *
 * 7. Two Dice
 * Write a program that:
 * Simulates rolling two dice using Math.random().
 * Displays the numbers rolled on the dice and their sum.
 * If the sum is 7 or 11, display a message that the user has won.
 *
 * 8. Fahrenheit to Celsius Conversion
 * Write a program that:
 * Reads a temperature in Fahrenheit.
 * Converts the temperature to Celsius using the formula:
 * C = 5/9(F - 32)
 * Displays the temperature in Celsius.
 * Example:
 * Input: 100 Fahrenheit
 * Output: 37 Celsius
 *
 * 9. Display Date
 * Write a program that:
 * Reads 3 integers from the user (day, month, year).
 * Displays the date in the format DD/MM/YY.
 * Example:
 * Input: 5, 12, 2022
 * Output: 05/12/22
 *
 * 10. Maximum Number Finder
 * Write a program that:
 * Reads three integers from the user.
 * Displays the largest number.
 * Example:
 * Input: 5, 9, 2
 * Output: 9
 */


public class Ch2TenExerFromGPTVag {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userChoice = 0;
        int hoursUser = 0;
        int minutesUser = 0;
        int secondsUser = 0;


        System.out.println();
        System.out.println("*****************************************************************");
        System.out.println("1. ATM Euros App");
        System.out.println("*****************************************************************");

        userChoice = getValidPositiveNum(sc, "Please provide the amount of Euros to withdraw, to calculate the Euro bills required");
        atmEuros(userChoice);

        System.out.println();
        System.out.println("*****************************************************************");
        System.out.println("2. Sum of Digits");
        System.out.println("*****************************************************************");

        userChoice = getValidPositiveNum(sc, "Please provide a positive integer, to sum its digits");
        sumOfDigits(userChoice);

        System.out.println();
        System.out.println("*****************************************************************");
        System.out.println("3. Counter App");
        System.out.println("*****************************************************************");

        counterApp(sc);

        System.out.println();
        System.out.println("*****************************************************************");
        System.out.println("4. Time to Seconds Conversion");
        System.out.println("*****************************************************************");

        timeToSeconds(sc);

        System.out.println();
        System.out.println("*****************************************************************");
        System.out.println("5. Frog Jumps App");
        System.out.println("*****************************************************************");

        frogJump(sc);

        System.out.println();
        System.out.println("*****************************************************************");
        System.out.println("6. Price with VAT Calculation");
        System.out.println("*****************************************************************");

        userChoice = getValidPositiveNum(sc, "Please provide the net price of a product to display the final " +
                "price with 24% VAT");
        priceVat(userChoice);

        System.out.println();
        System.out.println("*****************************************************************");
        System.out.println("7. Two Dices");
        System.out.println("*****************************************************************");

        twoDices();

        System.out.println();
        System.out.println("*****************************************************************");
        System.out.println("8. Fahrenheit to Celsius Conversion");
        System.out.println("*****************************************************************");

        userChoice = getValidPositiveNum(sc, "Please provide a temperature in Fahrenheit, to be converted to Celsius");

        temperatureConverter(userChoice);

        System.out.println();
        System.out.println("*****************************************************************");
        System.out.println("9. Display Date");
        System.out.println("*****************************************************************");

        displayDate(sc) ;

        System.out.println();
        System.out.println("*****************************************************************");
        System.out.println("10. Maximum Number Finder");
        System.out.println("*****************************************************************");

        maxNumFinder(sc) ;

        System.out.println();
        System.out.println("*****************************************************************");
        System.out.println("Thank you for using the 10 in 1 application");
        System.out.println("*****************************************************************");
    }

    public static int getValidNum(Scanner sc, String prompt) {
        while(true) {
            try {
                System.out.println(prompt);
                return sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Provide a valid integer");
                sc.next(); // Clear invalid input
            }
        }
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

    public static int getValidPositiveNumOrZero(Scanner sc, String prompt) {
        while(true) {
            try {
                System.out.println(prompt);
                int input = sc.nextInt(); // Read input once
                if (input < 0) {
                    System.out.println("Please provide a positive number or zero.");
                    continue; // Loop again for new input
                }
                return input; // Return the valid number
            } catch (InputMismatchException e) {
                System.out.println("Provide a valid integer");
                sc.next(); // Clear invalid input
            }
        }
    }

    public static int randomDice() {
        return (int) (Math.random() * 6 + 1);
    }

    public static void timeDelay(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void atmEuros(int userChoice) {
        int bills500 = userChoice / 500;
        int bills100 = (userChoice % 500) / 100 ;
        int bills50 = (userChoice % 100) / 50 ;
        int bills20 = (userChoice % 50) / 20 ;
        int bills10 = (userChoice % 20) / 10 ;
        int change = userChoice % 10 ;
        System.out.println("Withdrawing");
        System.out.printf("%d bills of 500 Euros \n", bills500);
        System.out.printf("%d bills of 100 Euros \n", bills100);
        System.out.printf("%d bills of 50 Euros \n", bills50);
        System.out.printf("%d bills of 20 Euros \n", bills20);
        System.out.printf("%d bills of 10 Euros \n", bills10);
        System.out.printf("%d 1-euro coins \n", change);
    }

    public static void sumOfDigits(int userChoice) {
        int tempNum = userChoice;
        int sum = 0;
        do {
            sum = sum + (tempNum % 10);
            tempNum = tempNum / 10;
        } while (tempNum != 0) ;
        System.out.printf("The sum of %d is %d \n", userChoice, sum);
    }

    public static void counterApp(Scanner sc) {
        System.out.println("Start Adding or subtracting numbers");
        System.out.println("Type 0 for reset");
        System.out.println("Alternatively type -1 to exit the program");
        int sum = 0;
        while (true) {
            int userNum = getValidNum(sc, "Provide a valid integer");
            if (userNum == 0 ) {
                System.out.println("Resetting the sum, which was " + sum);
                System.out.println("New sum is now 0");
                sum = 0 ;
            }
            else if (userNum == -1) {
                System.out.println("Exiting the program");
                break;
            }
            else {
                sum = sum + userNum;
                System.out.println("Current sum is " + sum);
            }
        }
        System.out.println("Total count is " + sum);
    }

    public static void timeToSeconds(Scanner sc) {
        int hoursUser = getValidPositiveNumOrZero(sc, "Please provide the amount of hours to be converted to seconds (step 1/3)");
        int minutesUser = getValidPositiveNumOrZero(sc, "Please provide the amount of minutes to be converted to seconds (step 2/3)");
        int secondsUser = getValidPositiveNumOrZero(sc, "Please provide how many seconds to be added (step 3/3)");
        int totalTime = hoursUser * 3600 + minutesUser * 60 + secondsUser;
        System.out.printf("Total seconds of %d hours, %d minutes, %d seconds: \n", hoursUser, minutesUser, secondsUser);
        System.out.printf("%d seconds", totalTime);
    }

    public static void frogJump(Scanner sc) {
        System.out.println("Let's suppose that we have a frog!");
        System.out.println("The frog needs to cover a certain distance, but it can only make a certain leap each time");
        int frogDistance = getValidPositiveNum(sc, "Please provide the distance that the frog needs to cover");
        int frogJump = getValidPositiveNum(sc, "Please provide the distance that the frog covers in one leap");
        int numberOfJumps = (int) Math.ceil((double) frogDistance / frogJump);
        System.out.printf("The frog need to jump %d times to cover the distance of %d \n", numberOfJumps, frogDistance);
    }

    public static void priceVat(int userChoice) {
        final float VAT = 1.24f;
        float finalPrice = userChoice * VAT;
        System.out.printf("The final price with 24 percent VAT added is %,.2f \n", finalPrice);
    }

    public static void twoDices() {
        System.out.println("This time you don't have to do anything... Lady Luck will decide..");
        timeDelay(3000);
        System.out.println("Get ready to roll the dices.....");
        timeDelay(2000);
        System.out.println("If you get a total of 7 or 11 you win. Let's go!");
        timeDelay(3000);
        System.out.println("Rolling.......");
        int diceFirst = randomDice();
        int diceSecond = randomDice();
        timeDelay(2500);
        System.out.printf("You get %d and %d \n", diceFirst, diceSecond);
        if (diceFirst + diceSecond == 7) {
            System.out.println("You get 7! You win!!");
        }
        else if (diceFirst + diceSecond == 11) {
            System.out.println("You get 11! You win!!");
        }
        else {
            System.out.printf("You get %d \n", (diceFirst + diceSecond));
            System.out.println("You didn't get 7 or 11.. Better luck next time!");
        }

    }

    public static void temperatureConverter(int userChoice) {
        int celsius = 5 * (userChoice - 32) / 9;
        System.out.printf("%d Fahrenheit degrees are converted to %d Celsius degrees \n", userChoice, celsius);
    }

    public static void displayDate(Scanner sc) {
        int ddUser = getValidPositiveNum(sc, "Please provide current day of the year, e.g. 1 or 22 or 31 etc");
        int mmUser = getValidPositiveNum(sc, "Please provide current month of the year, e.g 2 or 12 etc");
        int yyUser = getValidPositiveNum(sc, "Please provide the current year, eg 2024 or 2025 etc");
        int formattedYear = yyUser % 100;

        System.out.printf("%02d/%02d/%2d\n", ddUser, mmUser, formattedYear);


    }

        public static void maxNumFinder(Scanner sc) {
            System.out.println("Let's find the maximum number among 3 integers");
            int num1 = getValidNum(sc, "Please provide the first integer");
            int num2 = getValidNum(sc, "Please provide the second integer");
            int num3 = getValidNum(sc, "Please provide the third and last integer");
            int maxNum = Math.max(num1, Math.max(num2, num3));
            System.out.printf("Max number among %d, %d, and %d, is: %d \n", num1, num2, num3, maxNum);
    }
}
