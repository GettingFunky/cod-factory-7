package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Βρίσκει το Most Significant Digit
 */
public class FirstDigitFinder {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum = 0;
        int tempNum = 0;

        System.out.println("Please enter a positive integer");
        inputNum = in.nextInt();

        tempNum = inputNum;

        while (tempNum >= 10) {
            tempNum = tempNum / 10;
        }

        System.out.println();


//        inputNum = in.nextInt();
//
//        tempNum = inputNum;
//
//        while (tempNum >= 10) {
//            tempNum = tempNum /10;
//        }

        System.out.println("The first digit of " + inputNum + " is " + tempNum);
    }
}
