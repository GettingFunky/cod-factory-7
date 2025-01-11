package gr.advent.challenges.Year2015;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Day05 {

    public static void main(String[] args) throws IOException {
        try (Scanner in = new Scanner(new File("E:\\Programming\\Advent Of Code\\2015\\Day05\\input.txt"), StandardCharsets.UTF_8);
        ) {
//            int vowelCounter = 0;
            char[] storeCharMap = new char[16];
            String[] storeStringMap = new String[16];
            boolean isConsecutive = false;
            boolean hasForbiddenLetters = false;
            int niceStringCounter = 0;

            int index = 0; // Δείκτης για τον πίνακα
            while (in.hasNextLine()) {
                String line = in.nextLine();
                for (char c : line.toCharArray()) {
                    storeCharMap[index] = c;
                    storeStringMap[index] = String.valueOf(c);
//                    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
//                        vowelCounter++;
//                    }

                    index++;
                }
                for (int i = 2; i <storeCharMap.length; i++) {
                    if (Objects.equals(storeStringMap[i], storeStringMap[i - 2])) {
                        isConsecutive = true;
                    }
                    if ((storeStringMap[i - 1] + storeStringMap[i]).equals("ab") ||
                            (storeStringMap[i - 1] + storeStringMap[i]).equals("cd") ||
                            (storeStringMap[i - 1] + storeStringMap[i]).equals("pq") ||
                            (storeStringMap[i - 1] + storeStringMap[i]).equals("xy")) {
                        hasForbiddenLetters = true;
                    }
                }
                if (vowelCounter >= 3 && (isConsecutive) && (!hasForbiddenLetters)) {
                    niceStringCounter++;
                }
                isConsecutive = false;
                hasForbiddenLetters = false;
                index = 0;
                vowelCounter = 0;
            }
            System.out.println(niceStringCounter);

        }
        catch (IOException e) {
            System.err.println("Error reading or writing files: " + e.getMessage());
        }
    }
}