package gr.ChristmasRevCF;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * Numerous custom apps of Chapter 10, for practicing purposes
 */

public class Ch10VagExercisesTheory {

    static Scanner sc = new Scanner(System.in) ;
    static  StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        List<Integer> digitsList = new ArrayList<>();
        int userNum = 0;
        int digitsCount = 0;
        int digit = 0;
        int sumLoop = 0;
        boolean isArmstrongNumber = false;

        System.out.println("Please enter a positive number to find out whether it's an Armstrong number or not");
        userNum = getPositiveInteger();
        sc.nextLine();

        int userTempNum = userNum;

        while (userTempNum != 0) {
            digitsList.add(userTempNum % 10);
            userTempNum = userTempNum / 10;
            digitsCount++;
    }
        for (int item : digitsList) {
            sumLoop = sumLoop + (int) Math.pow(item, digitsCount);
        }

        isArmstrongNumber = (sumLoop == userNum);

        System.out.printf("Number %d is Armstrong Number: %b \n", userNum,isArmstrongNumber);

        System.out.println("*".repeat(20));
        System.out.println("All Caps Mode");
        System.out.println("Write any sentence to turn it into ALL CAPS");
        System.out.println("*".repeat(20));
        allCapsVag();

        System.out.println();
        System.out.println("*".repeat(20));
        System.out.println("Star Maker Random App");
        System.out.println("Give any number to generate stars in a single line");
        System.out.println("Press 667 to exit");
        System.out.println("*".repeat(20));
        starsGenerator();
        sc.nextLine();

        System.out.println();
        System.out.println("*".repeat(20));
        System.out.println("Cryptography App");
        System.out.println("Enter the message to be encrypted");
        System.out.println("*".repeat(20));
        encryptionVag();

        System.out.println();
        System.out.println("*".repeat(20));
        System.out.println("Circular shift right App");
        System.out.println("*".repeat(20));
        System.out.println("Enter the array length to be randomly populated");
        circularShiftRight();

        System.out.println();
        System.out.println("*".repeat(20));
        System.out.println("Missing Element");
        System.out.println("*".repeat(20));
        System.out.println("Let's take for example an array that looks like this:");
        System.out.println("[1, 2, 3, 5]");
        System.out.println("Missing Element: " + missingElement());


    }

    public static int getPositiveInteger() {
        while (true) {
            try {
                int userNum = sc.nextInt();
                if (userNum <= 0) {
                    System.out.println("Please provide a positive integer");
                    continue;
                }
                return userNum;
            } catch (InputMismatchException e) {
                System.out.println("Provide a valid integer");
                sc.nextLine();
            }
        }
    }

    public static String getString() {
        while (true) {
            try {
                return sc.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Provide a valid message");
                sc.nextLine();
            }
        }
    }

    public static int getRandomInteger() {
        return (int)(Math.random() * 999) + 1;
    }

    public static void allCapsVag()  {
        String sentence;
        char ch;
        sentence = sc.nextLine();
        for (int i = 0; i < sentence.length(); i++) {
            ch = sentence.charAt(i);
            if (Character.isLetter(ch)) {
                ch = Character.toUpperCase(ch);
            }
            sb.append(ch);
        }
        for (int i = 0; i < sb.length(); i++) {
            System.out.print(sb.charAt(i));
        }
    }

    public static void starsGenerator() {
        int userNum = 0;
        while (userNum != 667) {
            userNum = getPositiveInteger();
            System.out.println("*".repeat(userNum));
        }
        System.out.println("Thanks for using Stars Generator");
    }

    public static void encryptionVag() {
        String userMessage = getString();
        System.out.println("Provide an encryption key");
        int encryptionKey = getPositiveInteger();
        int asciiPrevious = 0;
        int asciiCurrent = 0;
        int asciiSum = 0;

        for (int i = 0; i < userMessage.length(); i++ ) {
            asciiCurrent = userMessage.charAt(i);
            asciiSum = asciiCurrent + asciiPrevious;
            System.out.print(asciiSum % encryptionKey + " ");
            asciiPrevious = asciiCurrent;
        }
        System.out.print("-1");
    }

    public static void circularShiftRight() {
        int arrayUserLength = getPositiveInteger();
        int[] arr = new int[arrayUserLength];
        int[] shiftedArr = new int[arrayUserLength];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = getRandomInteger();
            System.out.print(arr[i] + " ");
        }
        System.out.println("Specify how much the array should be shifted");
        int shiftUserNum = getPositiveInteger();

        System.out.printf("New array, shifted %d position(s)\n", shiftUserNum);

        for (int i = 0; i < arr.length; i++) {
            shiftedArr[(i + shiftUserNum) % arrayUserLength] = arr[i];
    }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(shiftedArr[i] + " ");
}
    }

    public static int missingElement() {
        int[] testArray = {1, 2, 3, 5};
        int missingArray = 0;
        for (int i = 1; i < testArray.length; i++) {
            if (testArray[i] != testArray[i-1] + 1 ) {
                missingArray = testArray[i] - 1;
                break;
            }
        }
        return missingArray;
    }
}


