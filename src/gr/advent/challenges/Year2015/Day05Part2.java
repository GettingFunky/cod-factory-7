package gr.advent.challenges.Year2015;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Day05Part2 {

    public static void main(String[] args) throws IOException {
        int niceStringCounter = 0;

        try (Scanner in = new Scanner(new File("E:\\Programming\\Advent Of Code\\2015\\Day05\\input.txt"), StandardCharsets.UTF_8)) {
            while (in.hasNextLine()) {
                String line = in.nextLine();

                // Check both conditions for the "nice" string
                if (hasRepeatingLetterWithGap(line) && hasPairAppearingTwice(line)) {
                    niceStringCounter++;
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading or writing files: " + e.getMessage());
        }

        System.out.println("Number of nice strings: " + niceStringCounter);
    }

    private static boolean hasPairAppearingTwice(String line) {
        // Check for any pair of two letters that appears at least twice without overlapping
        for (int i = 0; i < line.length() - 1; i++) {
            String pair = line.substring(i, i + 2);
            // Check if this pair appears later in the string
            if (line.indexOf(pair, i + 2) != -1) {
                return true;
            }
        }
        return false;
    }

    private static boolean hasRepeatingLetterWithGap(String line) {
        // Check for a letter that repeats with one letter between them
        for (int i = 0; i < line.length() - 2; i++) {
            if (line.charAt(i) == line.charAt(i + 2)) {
                return true;
            }
        }
        return false;
    }
}
