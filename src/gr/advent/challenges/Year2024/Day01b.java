package gr.advent.challenges.Year2024;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Day01b {

    public static void main(String[] args) {
        // Initialize ArrayLists for dynamic storage
        ArrayList<Integer> column1 = new ArrayList<>();
        ArrayList<Integer> column2 = new ArrayList<>();
        int similarity = 0;
        int similarityTotal = 0;
        int similarityTest = 0;
        int similarityTotalTest = 0;

        // Path to your text file
        String filePath = "E:\\Programming\\Advent Of Code\\2024\\Day01\\input.txt"; // Ensure this path points to your file

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            // Read file line by line
            while ((line = br.readLine()) != null) {
                // Split the line into two numbers
                String[] numbers = line.trim().split("\\s+"); // Split on spaces or tabs
                if (numbers.length == 2) { // Ensure there are exactly 2 columns
                    column1.add(Integer.parseInt(numbers[0])); // Add first number to column1
                    column2.add(Integer.parseInt(numbers[1])); // Add second number to column2
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + filePath);
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }

        // Convert ArrayLists to arrays
        int[] array1 = column1.stream().mapToInt(Integer::intValue).toArray();
        int[] array2 = column2.stream().mapToInt(Integer::intValue).toArray();

        // Print the arrays to verify
        System.out.println("Column 1 Array: ");
        for (int num : array1) {
            System.out.print(num + " ");
        }

        System.out.println("\nColumn 2 Array: ");
        for (int num : array2) {
            System.out.print(num + " ");
        }

        System.out.println();

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    similarity++;
                }
            }
            similarityTotal = similarityTotal + (array1[i] * similarity);
            similarity = 0;
        }

        System.out.println(similarityTotal);

        int[] test1 = {3, 4, 2, 1, 3, 3};
        int[] test2 = {4, 3, 5, 3, 9, 3};

        for (int i = 0; i < test1.length; i++) {
            for (int j = 0; j < test2.length; j++) {
                if (test1[i] == test2[j]) {
                    similarityTest++;
                }
            }
            similarityTotalTest = similarityTotalTest + (test1[i]*similarityTest);
            System.out.print(similarityTotalTest + " ");
            similarityTest = 0;
        }

        System.out.println(similarityTotalTest
        );


        }
    }