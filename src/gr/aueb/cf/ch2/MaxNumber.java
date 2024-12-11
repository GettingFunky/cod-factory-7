package gr.aueb.cf.ch2;

import java.util.Scanner;

public class MaxNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1, num2, num3, num4, num5, highestNum, lowestNum = 0;

        System.out.println("Δώστε 5 ακέραιους αριθμούς ώστε να υποδείξω τον μεγαλύτερο και τον μικρότερο");
        num1 = in.nextInt();
        num2 = in.nextInt();
        num3 = in.nextInt();
        num4 = in.nextInt();
        num5 = in.nextInt();
        highestNum = Math.max(num1,Math.max(num2, Math.max(num3, Math.max(num4, num5))));
        lowestNum = Math.min(num1,Math.min(num2, Math.min(num3, Math.min(num4, num5))));

        System.out.printf("Ο μεγαλύτερος αριθμός είναι ο %d, ενώ ο μικρότερος ο %d", highestNum, lowestNum);
    }
}
