package gr.advent.challenges.Year2015;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;

public class Day06Part2 {

    public static void main(String[] args) {
        String inFilePath = "E:\\Programming\\Advent Of Code\\2015\\Day06\\input.txt";

        // String.split("[ ,]+"); // split on on one or more spaces or commas

        try (BufferedReader reader = new BufferedReader(new FileReader(inFilePath))) {

            String line;
            int[][] lights = new int[1000][1000];
//            String firstLine = reader.readLine();
            String[] tokens;
//            String[] headerTokens = firstLine.split(",");
            int counterLightsOn = 0;

            while ((line = reader.readLine()) != null) {
                tokens = line.split("[ ,]+");
                
                if (Objects.equals(tokens[1], "on")) {
                    for (int i = Math.min(Integer.parseInt(tokens[2]), Integer.parseInt(tokens[5]));
                         i <= Math.max(Integer.parseInt(tokens[2]), Integer.parseInt(tokens[5])); i++) {
                        for (int j = Math.min(Integer.parseInt(tokens[3]), Integer.parseInt(tokens[6]));
                             j <= Math.max(Integer.parseInt(tokens[3]), Integer.parseInt(tokens[6])); j++) {
                            lights[i][j]++;
                        }
                    }
                } else if (Objects.equals(tokens[1], "off")) {
                    for (int i = Math.min(Integer.parseInt(tokens[2]), Integer.parseInt(tokens[5]));
                         i <= Math.max(Integer.parseInt(tokens[2]), Integer.parseInt(tokens[5])); i++) {
                        for (int j = Math.min(Integer.parseInt(tokens[3]), Integer.parseInt(tokens[6]));
                             j <= Math.max(Integer.parseInt(tokens[3]), Integer.parseInt(tokens[6])); j++) {
                            if (lights[i][j] != 0) {
                            lights[i][j]--; }
                        }
                    }
                } else {
                    for (int i = Math.min(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[4]));
                         i <= Math.max(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[4])); i++) {
                        for (int j = Math.min(Integer.parseInt(tokens[2]), Integer.parseInt(tokens[5]));
                             j <= Math.max(Integer.parseInt(tokens[2]), Integer.parseInt(tokens[5])); j++) {
                            lights[i][j] += 2;
                        }
                    }
                }
            }

            for (int[] row : lights) {
                for (int light : row) {
                        counterLightsOn += light;
                    }
                }


            System.out.println(counterLightsOn);


            // 444169 too low
            // 430563 too low
            // 569999 ok
            // 17836115 ok


        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
