package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Calculates number of leaps from X to Y
 * taking leap size into account
 */
public class FrogJumsAppVag {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int startingPoint = 0;
        int endingPoint = 0;
        int leapSize = 0;
        int numberOfLeaps = 0;

        System.out.println("Παρακαλώ δώστε σημείο αφετηρίας");
        startingPoint = in.nextInt();
        System.out.println("Παρακαλώ δώστε σημείο προορισμού");
        endingPoint = in.nextInt();
        System.out.println("Παρακαλώ δώστε μήκος του κάθε άλματος");
        leapSize = in.nextInt();

        numberOfLeaps = (int) Math.ceil((endingPoint - startingPoint) / (double) leapSize);

        System.out.printf("Απαιτούνται %d άλματα για να διανυθει η απόσταση από το %d στο %d"
                , numberOfLeaps, startingPoint, endingPoint);

    }
}