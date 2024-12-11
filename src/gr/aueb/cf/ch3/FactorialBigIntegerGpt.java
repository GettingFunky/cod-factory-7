package gr.aueb.cf.ch3;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Calculates factorial of a number using BigInteger for large values.
 */
public class FactorialBigIntegerGpt {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum = 0;
        BigInteger facto = BigInteger.ONE; // Initialize to 1 as BigInteger
        int i = 1;

        System.out.println("Please insert input number");
        inputNum = in.nextInt();

        // Calculate factorial using BigInteger
        while (i <= inputNum) {
            facto = facto.multiply(BigInteger.valueOf(i));
            System.out.println(facto); // Optional: prints each step of factorial calculation
            i++;
        }

        System.out.printf("The factorial of %d is: %d", inputNum, facto);
    }
}
