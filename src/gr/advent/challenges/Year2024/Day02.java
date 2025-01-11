package gr.advent.challenges.Year2024;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static java.lang.Integer.valueOf;

public class Day02 {

    public static void main(String[] args) throws FileNotFoundException {
        File fd = new File("E:\\Programming\\Advent Of Code\\2024\\Day02\\input.txt");
        String line;
        String[] tokens;
        int counterAsc = 0;
        int counterDesc = 0;
        int safeCount = 0;
        int counterDamp = 0;

        Scanner in = new Scanner(fd);

        while (in.hasNextLine()) {
            line = in.nextLine();
            tokens = line.split("\\s+");

            for (int i = 1; i < tokens.length ; i++) {
                if (Integer.parseInt(tokens[i]) < Integer.parseInt(tokens[i-1]) && Integer.parseInt(tokens[i-1]) - Integer.parseInt(tokens[i]) <= 3) {
                counterAsc++; }
                else if (Integer.parseInt(tokens[i])>Integer.parseInt(tokens[i-1]) && Integer.parseInt(tokens[i]) - Integer.parseInt(tokens[i-1]) <= 3) {
                counterDesc++; }
                else
                counterDamp++;

            }
            if (counterAsc == tokens.length - 1 || counterDesc == tokens.length - 1) {
                    safeCount++; };
            counterAsc = 0;
            counterDesc = 0;


        }
        System.out.println(safeCount);
        }

    }

