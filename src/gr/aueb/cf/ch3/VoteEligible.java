package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Calculates if someone is eligible to vote
 */

public class VoteEligible {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int votingAge = 18;
        int userAge = 0;
        boolean isAdult = false;

        System.out.println("Please enter your age:");
        userAge = in.nextInt();

        isAdult = userAge >= votingAge;

        System.out.printf("User can vote: %b", isAdult);


    }
}
