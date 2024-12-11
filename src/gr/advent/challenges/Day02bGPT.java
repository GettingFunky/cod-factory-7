package gr.advent.challenges;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Day02bGPT {

    public static void main(String[] args) throws FileNotFoundException {

        ArrayList<Integer[]> list1 = new ArrayList<>();
        try {
            Scanner scanner  = new Scanner(new File("E:\\Programming\\Advent Of Code\\2024\\Day02\\input.txt"));
            while (scanner.hasNextLine()) {
                list1.add(Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).toArray(Integer[]::new));
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found. Please check the path.");
        }

        // Count the reports that are safe without removing any level
        long safeReports = list1.stream()
                .filter(x ->
                        x.length - 1 == IntStream.range(0, x.length - 1)
                                .filter(i -> Math.abs(x[i] - x[i + 1]) <= 3)
                                .filter(n ->
                                        IntStream.range(0, x.length - 1).allMatch(i -> x[i] < x[i + 1]) ||
                                                IntStream.range(0, x.length - 1).allMatch(i -> x[i] > x[i + 1])
                                ).count()
                ).count();

        // Count the reports that can be made safe by removing one level
        long safeWithDampener = list1.stream()
                .filter(levels ->
                        IntStream.range(0, levels.length)
                                .anyMatch(i -> {
                                    Integer[] modifiedLevels = IntStream.range(0, levels.length)
                                            .filter(j -> j != i)
                                            .mapToObj(j -> levels[j])
                                            .toArray(Integer[]::new);

                                    return IntStream.range(0, modifiedLevels.length - 1)
                                            .filter(j -> Math.abs(modifiedLevels[j] - modifiedLevels[j + 1]) <= 3)
                                            .count() == modifiedLevels.length - 1 &&
                                            (IntStream.range(0, modifiedLevels.length - 1)
                                                    .allMatch(j -> modifiedLevels[j] < modifiedLevels[j + 1]) ||
                                                    IntStream.range(0, modifiedLevels.length - 1)
                                                            .allMatch(j -> modifiedLevels[j] > modifiedLevels[j + 1]));
                                })
                ).count();

        // Print results
        System.out.println("Number of safe reports: " + safeReports);
        System.out.println("Number of safe reports with Problem Dampener: " + safeWithDampener);
    }
}
