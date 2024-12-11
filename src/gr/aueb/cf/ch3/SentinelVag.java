package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Calculate the positives count
 */
public class SentinelVag {

    public static void main(String[] args) {
        int posSum = 0;
        int posCount = 0;
        int inputNum = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Δώστε οποιονδήποτε ακέραιο για πρόσθεση. Για τερματισμό δώστε αρνητικό αριθμό:");

        inputNum = in.nextInt();

        while (inputNum >= 0) {
            posSum = posSum + inputNum;
            posCount++;
            inputNum = in.nextInt();

        }
        System.out.printf("Δώσατε αρνητικό, ύστερα από %d προσπάθειες έγινε τερματισμός " +
                "προγράμματος, με ένα σύνολο %d!", posCount, posSum);
    }
}
