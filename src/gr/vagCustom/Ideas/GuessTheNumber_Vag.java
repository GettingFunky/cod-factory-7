package gr.vagCustom.Ideas;

import java.util.Scanner;

/**
 * Simple program that generates a random
 * number and lets the user guess it, by
 * constantly giving feedback based on answers
 */

public class GuessTheNumber_Vag {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to \"Guess The Number\" Game ");
        printInitialMenu();
        int gameDifficulty = difficultyInput(sc);
        timeDelay();
        System.out.println("OK done!! Now start guessing");
        int efforts = mainGuesserApp(gameDifficulty, sc);
        System.out.println("You did it!!!!!");
        System.out.printf("The random number was %d. It took you %d tries!!", gameDifficulty, efforts);

    }
    public static void printInitialMenu() {
        System.out.println();
        System.out.println("******************************************************************************");
        System.out.println("Choose game difficulty:");
        System.out.println("1. Easy mode (Numbers 1-10)");
        System.out.println("2. Normal mode (Numbers 1-100)");
        System.out.println("3. Hard mode (Numbers 1-1000");
        System.out.println("4. GOD mode (Numbers 1-10000000");
        System.out.println("Please type any option between 1-4. Press any other key to exit");;
        System.out.println("******************************************************************************");
    }

    public static int difficultyInput(Scanner sc) {
        int randomnumber = 0;
        int userChoice = sc.nextInt();
        if (userChoice == 1) {
            System.out.println("Easy mode Activated");
            randomnumber = randomGenerator(10);
        } else if (userChoice == 2) {
            System.out.println("Normal mode Activated");
            randomnumber = randomGenerator(100);
        } else if (userChoice == 3) {
            System.out.println("Hard mode Activated");
            randomnumber = randomGenerator(1000);
        } else if (userChoice == 4) {
            System.out.println("GOD mode Activated.. Good Luck");
            randomnumber = randomGenerator(1000000);
        } else {
            System.out.println("Exiting... Thanks for playing");
        }
         return randomnumber;

    }

    public static int randomGenerator (int difficulty) {
        return (int) (Math.random() * difficulty);
    }

    public static void timeDelay() {
        try {
            System.out.println();
            System.out.println("Let me think of a number.... Please wait..");
            Thread.sleep(1000);
            System.out.println("33%");
            Thread.sleep(1000);
            System.out.println("66%");
            Thread.sleep(1000);
            System.out.println("99%.....Almost done....");
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static int mainGuesserApp(int randomNumber, Scanner sc) {
        int userGuess = -1;
        int efforts = 1;

        while (randomNumber != userGuess) {

            userGuess = sc.nextInt();

            if (randomNumber < userGuess) {
                System.out.println("Lower!");
                efforts++;
            }
            else if (randomNumber > userGuess) {
                System.out.println("Higher!");
                efforts++;
            }

        }
        return efforts;
    }


}

