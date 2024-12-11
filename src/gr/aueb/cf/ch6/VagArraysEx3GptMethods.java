package gr.aueb.cf.ch6;

import java.util.Scanner;

public class VagArraysEx3GptMethods {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] array = new int[6]; // Πίνακας για την αποθήκευση των 6 αριθμών

        System.out.println("Please provide 6 integers from 1 to 49");

        // Εισαγωγή αριθμών από τον χρήστη
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter integer " + (i + 1) + " of 6:");
            array[i] = in.nextInt();
            while (!isValidNumber(array[i])) {
                System.out.println("Not an acceptable integer. Values from 1 to 49 are accepted. Try again:");
                array[i] = in.nextInt();
            }
        }

        // Κλήση ελέγχων
        if (!checkEvensOdds(array)) return;
        if (!checkConsecutive(array)) return;
        if (!checkSameEnding(array)) return;
        if (!checkSameDecade(array)) return;

        // Αν όλα τα φίλτρα περαστούν
        System.out.println("Η εξάδα αριθμών είναι αποδεκτή!");
    }

    /**
     * Ελέγχει αν ένας αριθμός είναι έγκυρος (1-49).
     */
    private static boolean isValidNumber(int number) {
        return number >= 1 && number <= 49;
    }

    /**
     * Ελέγχει αν υπάρχουν περισσότεροι από 3 άρτιοι ή περιττοί αριθμοί.
     */
    private static boolean checkEvensOdds(int[] array) {
        int evenCounter = 0;
        int oddCounter = 0;

        for (int num : array) {
            if (num % 2 == 0) {
                evenCounter++;
                if (evenCounter > 3) {
                    System.out.println("Περισσότεροι από 3 άρτιοι αριθμοί");
                    return false; // Δεν περνάει το φίλτρο
                }
            } else {
                oddCounter++;
                if (oddCounter > 3) {
                    System.out.println("Περισσότεροι από 3 περιττοί αριθμοί");
                    return false; // Δεν περνάει το φίλτρο
                }
            }
        }
        return true; // Περνάει το φίλτρο
    }

    /**
     * Ελέγχει αν υπάρχουν πάνω από 3 συνεχόμενοι αριθμοί.
     */
    private static boolean checkConsecutive(int[] array) {
        for (int i = 3; i < array.length; i++) {
            if (array[i] == array[i - 1] + 1 &&
                    array[i - 1] == array[i - 2] + 1 &&
                    array[i - 2] == array[i - 3] + 1) {
                System.out.println("Βρέθηκαν πάνω από 3 συνεχόμενοι αριθμοί");
                return false; // Δεν περνάει το φίλτρο
            }
        }
        return true; // Περνάει το φίλτρο
    }

    /**
     * Ελέγχει αν υπάρχουν πάνω από 3 αριθμοί με τον ίδιο λήγοντα.
     */
    private static boolean checkSameEnding(int[] array) {
        int[] endingCounts = new int[10]; // Πίνακας για τους λήγοντες (0-9)
        for (int num : array) {
            endingCounts[num % 10]++;
        }
        for (int count : endingCounts) {
            if (count > 3) {
                System.out.println("Περισσότεροι από 3 αριθμοί με τον ίδιο λήγοντα");
                return false; // Δεν περνάει το φίλτρο
            }
        }
        return true; // Περνάει το φίλτρο
    }

    /**
     * Ελέγχει αν υπάρχουν πάνω από 3 αριθμοί στην ίδια δεκάδα.
     */
    private static boolean checkSameDecade(int[] array) {
        int[] decadeCounts = new int[5]; // Πίνακας για τις δεκάδες (0-9, 10-19, ..., 40-49)
        for (int num : array) {
            decadeCounts[num / 10]++;
        }
        for (int count : decadeCounts) {
            if (count > 3) {
                System.out.println("Περισσότεροι από 3 αριθμοί στην ίδια δεκάδα");
                return false; // Δεν περνάει το φίλτρο
            }
        }
        return true; // Περνάει το φίλτρο
    }
}
