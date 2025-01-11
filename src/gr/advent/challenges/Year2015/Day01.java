package gr.advent.challenges.Year2015;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Day01 {

    public static void main(String[] args) throws IOException {
        try (Scanner in = new Scanner(new File("E:\\Programming\\Advent Of Code\\2015\\Day01\\input.txt"), StandardCharsets.UTF_8);
        ) {
            int floorCounter = 0;
            int position = 0;
            // Read the input file character by character
            while (in.hasNextLine()) {
                String line = in.nextLine();
                for (char c : line.toCharArray()) {
                    if (c == '(') {
                        floorCounter++;
                    } else if (c == ')') {
                        floorCounter--;
                    }
                    position++;
                    if (floorCounter == -1) {
                        break;
                    }
                }
                System.out.println(floorCounter);
                System.out.println(position);

            }
        }catch (IOException e) {
            System.err.println("Error reading or writing files: " + e.getMessage());
        }
    }
        }
