package gr.advent.challenges;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day02b {

    public static void main(String[] args) throws FileNotFoundException {
        File fd = new File("E:\\Programming\\Advent Of Code\\2024\\Day02\\input.txt");
        String line;
        String[] tokens;
        int counterAsc = 0;
        int counterDesc = 0;
        int counterRest = 0;
        int safeCount = 0;
        Scanner in = new Scanner(fd);
        while (in.hasNextLine()) {
            line = in.nextLine();
            tokens = line.split("\\s+");
            for (int i = 1; i < tokens.length ; i++) {
                if (Integer.parseInt(tokens[i]) < Integer.parseInt(tokens[i-1]) && Integer.parseInt(tokens[i-1]) - Integer.parseInt(tokens[i]) <= 3 && Integer.parseInt(tokens[i-1]) - Integer.parseInt(tokens[i]) >= 1) {
                    counterAsc++ ; }
                    //  counterDesc--} ;
                else if (Integer.parseInt(tokens[i])>Integer.parseInt(tokens[i-1]) && Integer.parseInt(tokens[i]) - Integer.parseInt(tokens[i-1]) <= 3 && Integer.parseInt(tokens[i]) - Integer.parseInt(tokens[i-1]) >= 1) {
                        counterDesc++ ; }
                        // counterAsc--} ; }
                else counterRest++;

                }

                    if (counterAsc == tokens.length - 1 || counterDesc == tokens.length - 1) {
                        safeCount++;
                    }
                    else if ((counterAsc == tokens.length - 2 && counterDesc == 1 && counterRest == 0) || (counterDesc == tokens.length - 2 && counterAsc == 1 && counterRest == 0)) {
                        safeCount++; }
                    else if ((counterAsc == tokens.length - 2 && counterRest == 1 && counterDesc == 0) || (counterDesc == tokens.length - 2 && counterRest == 1 && counterAsc == 0)) {
                        safeCount++; }

                    counterAsc = 0;
                    counterDesc = 0;
                    counterRest = 0;
                }
                System.out.println(safeCount);
            }

    }
