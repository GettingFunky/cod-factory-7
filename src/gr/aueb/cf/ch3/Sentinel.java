package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Calculate the positives count
 */
public class Sentinel {

    public static void main(String[] args) {
        int posSum = 0;
        int posCount = 0;
        int inputNum = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Δώστε μια σειρά αριθμών:");

        inputNum = in.nextInt();

        while (inputNum >=0) {
            posSum += inputNum;
            posCount++;
            System.out.printf("Δώσατε θετικό. Τρέχον άθροισμα %d. Δώστε ξανά κάποιον αριθμό\n", posSum);
            inputNum = in.nextInt();
        }
        System.out.printf("Δώσατε αρνητικό, ύστερα από %d προσπάθειες έγινε τερματισμός προγράμματος!", posCount);
    }
}
