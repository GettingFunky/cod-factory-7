package gr.aueb.cf.ch3;

import java.util.Scanner;

public class BingoAppVag {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int BINGO = 10;
        int inputNum = 0;
        int count = 0;

        System.out.println("Please guess a number between 1-20");
        inputNum = in.nextInt();

        while (inputNum != BINGO) {
            System.out.println("Not a good guess! Please try again");
            count++;
            inputNum = in.nextInt();
        }
        System.out.println("You found it after " + count + " tries! Congratulations");
    }
}
