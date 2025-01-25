package gr.codeWars.java;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 *
 *You live in the city of Cartesia where all roads are laid out in a perfect grid.
 * You arrived ten minutes too early to an appointment, so you decided to take the
 * opportunity to go for a short walk. The city provides its citizens with a
 * Walk Generating App on their phones -- everytime you press the button
 * it sends you an array of one-letter strings representing directions to walk
 * (eg. ['n', 's', 'w', 'e']). You always walk only a single block for each
 * letter (direction) and you know it takes you one minute to traverse one city block,
 * so create a function that will return true if the walk the app gives you will take you
 * exactly ten minutes (you don't want to be early or late!) and will, of course,
 * return you to your starting point. Return false otherwise.
 * 
 * Note: you will always receive a valid array containing a random assortment of
 * direction letters ('n', 's', 'e', or 'w' only). It will never give you an
 * empty array (that's not a walk, that's standing still!).
 */
public class TakeTenMinutesWalk {

    public static void main(String[] args) {

        char[] instructions = {'n', 's', 'e', 'w', 'n', 's', 'e', 'w', 'n', 'n'}; // Example input

        if (isValidWalk(instructions)) {
            System.out.println("Valid walk!");
        } else {
            System.out.println("Invalid walk!");
        }
    }

    public static boolean isValidWalk(char[] instructions) {
        // Check if the walk is exactly 10 minutes (10 instructions)
        if (instructions.length != 10) {
            return false;
        }


        int[] storeCharMap = new int[10];
        int pivot = 0;

        int index = 0; // Δείκτης για τον πίνακα

        for (char c : instructions) {
            if (c == 'e') {
                storeCharMap[index] = pivot + 1;
            } else if (c == 'w') {
                storeCharMap[index] = pivot - 1;
            } else if (c == 'n') {
                storeCharMap[index] = pivot + 100;
            } else if (c == 's') {
                storeCharMap[index] = pivot - 100;
            }

            pivot = storeCharMap[index];
            index++;
        }
        return pivot == 0;
    }
}
