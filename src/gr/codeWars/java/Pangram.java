package gr.codeWars.java;

import java.util.HashSet;

public class Pangram {

    public boolean check(String sentence) {
        // Create a HashSet to store unique letters
        HashSet<Character> letters = new HashSet<>();

        // Loop through each character in the sentence
        for (char c : sentence.toCharArray()) {
            if (Character.isLetter(c)) {
                // Convert the letter to lowercase (case-insensitive)
                letters.add(Character.toLowerCase(c));
            }

            // If we have all 26 letters, return true
            if (letters.size() == 26) {
                return true;
            }
        }

        // If after the loop we don't have all 26 letters, return false
        return false;
    }
}
