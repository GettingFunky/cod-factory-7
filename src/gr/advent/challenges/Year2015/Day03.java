package gr.advent.challenges.Year2015;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

public class Day03 {

    public static void main(String[] args) throws IOException {
        try (Scanner in = new Scanner(new File("E:\\Programming\\Advent Of Code\\2015\\Day03\\input.txt"), StandardCharsets.UTF_8);
        ) {
            int counterInitial = 0;
            int pivotA = 0;
            int pivotB = 0;

            while (in.hasNextLine()) {
                String line = in.nextLine();
                for (char c : line.toCharArray()) {
                    counterInitial++;
                }
            }

            System.out.println(counterInitial);

            in.close();
            Scanner in2 = new Scanner(new File("E:\\Programming\\Advent Of Code\\2015\\Day03\\input.txt"), StandardCharsets.UTF_8);
            int[] storeCharMap = new int[counterInitial];

            int index = 0; // Δείκτης για τον πίνακα
            while (in2.hasNextLine()) {
                String line = in2.nextLine();
                for (char c : line.toCharArray()) {
                    if (index % 2 == 0) {
                        if (c == '>') {
                            storeCharMap[index] = pivotA + 1;
                        } else if (c == '<') {
                            storeCharMap[index] = pivotA - 1;
                        } else if (c == '^') {
                            storeCharMap[index] = pivotA + 1000;
                        } else if (c == 'v') {
                            storeCharMap[index] = pivotA - 1000;
                        }
                        pivotA = storeCharMap[index];
                    }   else {
                            if (c == '>') {
                                storeCharMap[index] = pivotB + 1;
                            } else if (c == '<') {
                                storeCharMap[index] = pivotB - 1;
                            } else if (c == '^') {
                                storeCharMap[index] = pivotB + 1000;
                            } else if (c == 'v') {
                                storeCharMap[index] = pivotB - 1000;
                        }
                        pivotB = storeCharMap[index];
                    }
                        index++; // Μετακινήσου στην επόμενη θέση του πίνακα
                    }
                }

            System.out.println();
            for (int j : storeCharMap) {
                System.out.print(j);
            }


            long uniqueChars = Arrays.stream(storeCharMap)
                    .distinct() // Διατήρηση μόνο μοναδικών τιμών
                    .count();   // Μέτρηση των μοναδικών τιμών
            System.out.println();
            System.out.println("Πλήθος μοναδικών χαρακτήρων: " + uniqueChars);

            //2566 too high
            //2565 OK
            //B
            //1315 too low
            //2572 too low
            //2573 too low
            //2639 ok


        }

         catch (IOException e) {
            System.err.println("Error reading or writing files: " + e.getMessage());
        }
    }
}