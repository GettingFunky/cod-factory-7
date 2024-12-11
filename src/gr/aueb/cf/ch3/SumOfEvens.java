package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Calculates the sum of all positive even numbers up to the given number
 */
public class SumOfEvens {

    public static void main(String[] args) {
        int i = 1;
        int j = 0;
        int userNum = 0;
        int sumOdd = 0;
        int sumEven = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Give Upper Limit");
        userNum = in.nextInt();

        while (i <= userNum) {
            sumOdd = sumOdd + i;
            i = i + 2;
        }

        while (j <= userNum) {
            sumEven = sumEven + j;
            j = j + 2;
        }


        System.out.printf("The sum of all odd integer numbers until %d is %d\n", userNum, sumOdd);
        System.out.printf("The sum of all even integer numbers until %d is %d", userNum, sumEven);


    }
}
