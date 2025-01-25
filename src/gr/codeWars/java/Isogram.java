package gr.codeWars.java;

import java.util.Scanner;

/**
 * An isogram is a word that has no repeating letters, consecutive or non-consecutive.
 * Implement a function that determines whether a string that contains only letters is an isogram.
 * Assume the empty string is an isogram. Ignore letter case.
 *
 * Example: (Input --> Output)
 *
 * "Dermatoglyphics" --> true
 * "aba" --> false
 * "moOse" --> false (ignore letter case)
 */
public class Isogram {

    /**
     * Determines if a string is an isogram (no repeating letters).
     *
     * @param str the input string
     * @return true if the string is an isogram, false otherwise
     */
    public static boolean isIsogram(String str) {
        // Convert to uppercase to make the check case-insensitive
        String upperStr = str.toUpperCase();

        // Array to track occurrences of each letter (ASCII 65-90 for A-Z)
        int[] frequency = new int[26];

        for (char c : upperStr.toCharArray()) {
            if (Character.isLetter(c)) {
                int index = c - 'A'; // Map character to array index (e.g., 'A' -> 0, 'B' -> 1)
                if (frequency[index] > 0) {
                    // If letter appears more than once, it's not an isogram
                    return false;
                }
                frequency[index]++;
            }
        }

        // If no repeating letters were found, it's an isogram
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user for input
        System.out.println("Enter a word to check if it is an isogram:");
        String userInput = sc.nextLine();

        // Call the isIsogram function and display the result
        if (isIsogram(userInput)) {
            System.out.println("\"" + userInput + "\" is an isogram.");
        } else {
            System.out.println("\"" + userInput + "\" is not an isogram.");
        }
    }
}
