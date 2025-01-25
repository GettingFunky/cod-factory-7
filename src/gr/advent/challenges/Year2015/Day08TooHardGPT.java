package gr.advent.challenges.Year2015;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Day08TooHardGPT {

    public static void main(String[] args) {
        try (
                Scanner in = new Scanner(new File("E:\\Programming\\Advent Of Code\\2015\\Day08\\input.txt"), StandardCharsets.UTF_8)
        ) {
            int totalCodeChars = 0;    // Total number of characters in the code representation
            int totalMemoryChars = 0; // Total number of characters in memory representation

            while (in.hasNextLine()) {
                String line = in.nextLine();
                totalCodeChars += line.length(); // Add code representation length
                totalMemoryChars += getMemoryLength(line); // Add in-memory representation length
            }

            // Calculate the difference
            int difference = totalCodeChars - totalMemoryChars;

            // Output results
            System.out.println("Total characters in code: " + totalCodeChars);
            System.out.println("Total characters in memory: " + totalMemoryChars);
            System.out.println("Difference: " + difference);

        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }

    /**
     * Calculates the in-memory length of a string literal.
     *
     * @param line The string literal, including quotes and escape sequences.
     * @return The length of the string in memory.
     */
    private static int getMemoryLength(String line) {
        int length = 0;
        for (int i = 1; i < line.length() - 1; i++) { // Skip the surrounding quotes
            char c = line.charAt(i);

            if (c == '\\') { // Handle escape sequences
                if (line.charAt(i + 1) == '\\' || line.charAt(i + 1) == '"') {
                    // Escaped backslash or quote
                    i++;
                } else if (line.charAt(i + 1) == 'x') {
                    // Hexadecimal escape (e.g., \x27)
                    i += 3;
                }
            }
            length++;
        }
        return length;
    }
}