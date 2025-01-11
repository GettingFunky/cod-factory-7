package gr.advent.challenges.Year2024;

import java.io.*;
import java.util.ArrayList;
import java.lang.Math;

public class Day01 {

    public static void main(String[] args) {
        // Initialize ArrayLists for dynamic storage
        ArrayList<Integer> column1 = new ArrayList<>();
        ArrayList<Integer> column2 = new ArrayList<>();
        int differNumAbsolute = 0;

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

        for (int i = array1.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array1[j] > array1[j + 1]) {
                    swap(array1, j, j + 1);
                }
            }
        }

        for (int i = array2.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array2[j] > array2[j + 1]) {
                    swap(array2, j, j + 1);
                }
            }
        }

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
            differNumAbsolute = differNumAbsolute + Math.abs(array1[i] - array2[i]);
            System.out.print( differNumAbsolute + " ");
        }
        System.out.println();
        System.out.printf("Difference is %d", differNumAbsolute);

        int similarity = 0;
        int similarityTotal = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    similarity++;
                }
            }
            similarityTotal = similarityTotal + (similarity*similarity);
            similarity = 0;
        }

        System.out.println(similarityTotal);

    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
