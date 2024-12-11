package gr.aueb.cf.ch6;

import java.util.Scanner;

public class VagArraysEx3Gpt {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] array = new int[6]; // Πίνακας για την αποθήκευση των 6 αριθμών
        int evenCounter = 0; // Μετρητής άρτιων αριθμών
        int oddCounter = 0; // Μετρητής περιττών αριθμών
        boolean hasTooManyConsecutive = false; // Έλεγχος για συνεχόμενους αριθμούς
        boolean hasTooManySameEnding = false; // Έλεγχος για ίδιους λήγοντες
        boolean hasTooManyInSameDecade = false; // Έλεγχος για αριθμούς στην ίδια δεκάδα

        System.out.println("Please provide 6 integers from 1 to 49");

        // Εισαγωγή αριθμών
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter integer " + (i + 1) + " of 6:");
            array[i] = in.nextInt();

            // Έλεγχος αν ο αριθμός είναι εκτός του εύρους [1, 49]
            while (array[i] > 49 || array[i] < 1) {
                System.out.println("Not an acceptable integer. Values from 1 to 49 are accepted. Try again:");
                array[i] = in.nextInt();
            }

            // Ενημέρωση των μετρητών για άρτιους και περιττούς αριθμούς
            if (array[i] % 2 == 0) {
                evenCounter++;
                if (evenCounter > 3) {
                    System.out.println("Περισσότεροι από 3 άρτιοι αριθμοί");
                    return; // Τερματισμός του προγράμματος
                }
            } else {
                oddCounter++;
                if (oddCounter > 3) {
                    System.out.println("Περισσότεροι από 3 περιττοί αριθμοί");
                    return; // Τερματισμός του προγράμματος
                }
            }

            // Έλεγχος για περισσότερους από 3 συνεχόμενους αριθμούς
            if (i >= 3) {
                if (array[i] == array[i - 1] + 1 && array[i - 1] == array[i - 2] + 1 && array[i - 2] == array[i - 3] + 1) {
                    System.out.println("Βρέθηκαν πάνω από 3 συνεχόμενοι αριθμοί");
                    return; // Τερματισμός του προγράμματος
                }
            }
        }

        // Έλεγχος για περισσότερους από 3 αριθμούς με τον ίδιο λήγοντα
        int[] endingCounts = new int[10]; // Πίνακας για τους λήγοντες (0-9)
        for (int num : array) {
            endingCounts[num % 10]++;
        }
        for (int count : endingCounts) {
            if (count > 3) {
                hasTooManySameEnding = true;
                break;
            }
        }
        if (hasTooManySameEnding) {
            System.out.println("Περισσότεροι από 3 αριθμοί με τον ίδιο λήγοντα");
            return; // Τερματισμός του προγράμματος
        }

        // Έλεγχος για περισσότερους από 3 αριθμούς στην ίδια δεκάδα
        int[] decadeCounts = new int[5]; // Πίνακας για τις δεκάδες (0-9, 10-19, ..., 40-49)
        for (int num : array) {
            decadeCounts[num / 10]++;
        }
        for (int count : decadeCounts) {
            if (count > 3) {
                hasTooManyInSameDecade = true;
                break;
            }
        }
        if (hasTooManyInSameDecade) {
            System.out.println("Περισσότεροι από 3 αριθμοί στην ίδια δεκάδα");
            return; // Τερματισμός του προγράμματος
        }

        // Αν περάσουν όλα τα φίλτρα
        System.out.println("Η εξάδα αριθμών είναι αποδεκτή!");
    }
}
