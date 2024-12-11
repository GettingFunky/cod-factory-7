package gr.aueb.cf.ch7;

import java.util.Scanner;

public class VagStringsEx2GPTFullWithNotes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user for a word to encrypt
        System.out.println("Please enter a word to be encrypted:");
        String initialWord = sc.nextLine();

        // Prompt the user for the encryption key
        System.out.println("Please provide a key (positive integer):");
        int keyInput = sc.nextInt() % 26; // Ensure the key is within the range of the alphabet
        sc.nextLine(); // Consume the newline character

        // Encrypt the input word and display the result
        System.out.println("Encrypted word:");
        String encryptedWord = encrypt(initialWord, keyInput);
        System.out.println(encryptedWord);

        // Prompt the user for a word to decrypt
        System.out.println("\nPlease enter a word to be decrypted:");
        String initialDecWord = sc.nextLine();

        // Decrypt the input word and display the result
        System.out.println("Decrypted word:");
        String decryptedWord = decrypt(initialDecWord, keyInput);
        System.out.println(decryptedWord);

        sc.close();
    }

    /**
     * Encrypts a given word using the Caesar cipher algorithm.
     * Each character is shifted to the right by the given key.
     *
     * @param word The word to be encrypted.
     * @param key  The encryption key (number of positions to shift).
     * @return The encrypted word.
     */
    public static String encrypt(String word, int key) {
        StringBuilder encrypted = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);

            // Check if the character is alphabetic
            if (Character.isLowerCase(currentChar)) {
                // Apply Caesar cipher for lowercase letters
                char encryptedChar = (char) (((currentChar - 'a' + key) % 26) + 'a');
                encrypted.append(encryptedChar);
            } else if (Character.isUpperCase(currentChar)) {
                // Apply Caesar cipher for uppercase letters
                char encryptedChar = (char) (((currentChar - 'A' + key) % 26) + 'A');
                encrypted.append(encryptedChar);
            } else {
                // Leave non-alphabetic characters unchanged
                encrypted.append(currentChar);
            }
        }

        return encrypted.toString();
    }

    /**
     * Decrypts a given word encrypted using the Caesar cipher algorithm.
     * Each character is shifted to the left by the given key.
     *
     * @param word The word to be decrypted.
     * @param key  The decryption key (number of positions to shift back).
     * @return The decrypted word.
     */
    public static String decrypt(String word, int key) {
        StringBuilder decrypted = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);

            // Check if the character is alphabetic
            if (Character.isLowerCase(currentChar)) {
                // Apply Caesar cipher for lowercase letters
                char decryptedChar = (char) (((currentChar - 'a' - key + 26) % 26) + 'a');
                decrypted.append(decryptedChar);
            } else if (Character.isUpperCase(currentChar)) {
                // Apply Caesar cipher for uppercase letters
                char decryptedChar = (char) (((currentChar - 'A' - key + 26) % 26) + 'A');
                decrypted.append(decryptedChar);
            } else {
                // Leave non-alphabetic characters unchanged
                decrypted.append(currentChar);
            }
        }

        return decrypted.toString();
    }
}