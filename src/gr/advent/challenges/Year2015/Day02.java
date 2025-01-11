package gr.advent.challenges.Year2015;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * 3x11x24
 *
 * 66
 * 528
 * 144
 * 33
 *
 * 771
 *
 *
 * 13x5x19
 *
 * 130
 * 190
 * 494
 * 65
 *
 * 879
 *
 * 1650
 */

public class Day02 {


    public static void main(String[] args) throws IOException {
        try (Scanner in = new Scanner(new File("E:\\Programming\\Advent Of Code\\2015\\Day02\\input.txt"), StandardCharsets.UTF_8);
        ) {
            String line;
            String[] tokens;
            int[] num = new int[3];
            int low = 0;
            int presentSingle = 0;
            int presentTotal = 0;
            int tempLow = 0;
            int max = 0;
            int ribbonSingle = 0;
            int ribbonTotal = 0;

            while (in.hasNextLine()) {
                line = in.nextLine();
                tokens = line.split("x");

                for (int i = 0; i < tokens.length; i++ ) {
                    num[i] = Integer.parseInt(tokens[i]);
                }
                low = Math.min(num[0], Math.min(num[1], num[2]));
                max = Math.max(num[0], Math.max(num[1], num[2]));
                tempLow = num[0] + num[1] + num[2] - low - max;
                presentSingle = (2 * num[0] * num[1]) + (2 * num[1] * num[2]) +(2 * num[2] * num[0]) + (low * tempLow);
                presentTotal += presentSingle;

                ribbonSingle = (low + low + tempLow +tempLow) + (low * tempLow * max);
                ribbonTotal += ribbonSingle;





                low = 20000000;
//                System.out.println(presentTotal);
//
//                System.out.println(ribbonTotal);
            }
            // 1441714 too low
            // 1448828 too low
            // 1548660 too low
            // 1596636 not right

            System.out.println(presentTotal);
            System.out.println(ribbonTotal);
        }catch (IOException e) {
            System.err.println("Error reading or writing files: " + e.getMessage());
        }
    }
}

