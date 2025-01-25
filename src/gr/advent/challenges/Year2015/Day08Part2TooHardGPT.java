package gr.advent.challenges.Year2015;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Day08Part2TooHardGPT {

    public static void main(String[] args) {
        try (
                Scanner in = new Scanner(new File("E:\\Programming\\Advent Of Code\\2015\\Day08\\input.txt"), StandardCharsets.UTF_8)
        ) {
            int totalCodeChars = 0;    // Total number of characters in the code representation
            int totalEncodedChars = 0; // Total number of characters in the encoded representation

            while (in.hasNextLine()) {
                String line = in.nextLine();
                totalCodeChars += line.length(); // Add code representation length
                totalEncodedChars += getEncodedLength(line); // Add encoded representation length
            }

            // Calculate the difference
            int difference = totalEncodedChars - totalCodeChars;

            // Output results
            System.out.println("Total characters in code: " + totalCodeChars);
            System.out.println("Total characters in encoded: " + totalEncodedChars);
            System.out.println("Difference: " + difference);

        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }

    /**
     * Calculates the length of the encoded representation of a string literal.
     *
     * @param line The string literal, including quotes and escape sequences.
     * @return The length of the encoded string representation.
     */
    private static int getEncodedLength(String line) {
        int encodedLength = 2; // Start with 2 for the surrounding double quotes

        for (char c : line.toCharArray()) {
            if (c == '"' || c == '\\') {
                // Escaped double quote or backslash adds an extra character
                encodedLength += 2;
            } else {
                // Normal characters add 1
                encodedLength += 1;
            }
        }

        return encodedLength;
    }
}
