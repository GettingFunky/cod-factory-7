package gr.codeWars.java;

//Your goal in this kata is to implement a difference function,
// which subtracts one list from another and returns the result.
//
//It should remove all values from list a, which are present in list b keeping their order.
//Kata.arrayDiff(new int[] {1, 2}, new int[] {1}) => new int[] {2}

//If a value is present in b, all of its occurrences must be removed from the other:
// Kata.arrayDiff(new int[] {1, 2, 2, 2, 3}, new int[] {2}) => new int[] {1, 3}
//

import java.util.ArrayList;

public class ArrayDiff {

    public static int[] arrayDiff(int[] a, int[] b) {
        // Δημιουργούμε μία λίστα για να αποθηκεύσουμε τα αποτελέσματα
        ArrayList<Integer> result = new ArrayList<>();

        // Διατρέχουμε το array `a`
        for (int num : a) {
            // Αν το στοιχείο ΔΕΝ υπάρχει στο `b`, το προσθέτουμε στη λίστα αποτελεσμάτων
            if (!contains(b, num)) {
                result.add(num);
            }
        }

        // Μετατρέπουμε τη λίστα σε array
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    // Βοηθητική μέθοδος για να ελέγξουμε αν ένα στοιχείο υπάρχει στο array `b`
    private static boolean contains(int[] b, int num) {
        for (int value : b) {
            if (value == num) {
                return true; // Αν υπάρχει, επιστρέφουμε true
            }
        }
        return false; // Αν δεν υπάρχει, επιστρέφουμε false
    }
}

