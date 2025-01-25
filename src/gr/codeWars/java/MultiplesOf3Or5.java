package gr.codeWars.java;

//If we list all the natural numbers below 10 that are
// multiples of 3 or 5, we get 3, 5, 6 and 9.
// The sum of these multiples is 23.
//
//Finish the solution so that it returns the sum of all
// the multiples of 3 or 5 below the number passed in.
//
//Note: If the number is a multiple of both 3 and 5, only count it once.

import java.util.Scanner;

public class MultiplesOf3Or5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please provide a valid integer");
        int userInput = in.nextInt();
        int result = 0;

        for (int i = 1; i <= userInput; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.print(i + " ");
                result += i;
            }
        }

            System.out.println("The sum of all multiples is: " + result);


    }
}
