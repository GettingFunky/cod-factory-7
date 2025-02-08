package gr.advent.challenges.Year2015;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Day09TooHard {
    public static void main(String[] args) throws Exception {
        // Read the input file
        Scanner in = new Scanner(new File("E:\\Programming\\Advent Of Code\\2015\\Day09TooHard\\input.txt"), StandardCharsets.UTF_8);

        // Map to store distances between locations
        Map<String, Map<String, Integer>> distances = new HashMap<>();

        // Parse the input
        while (in.hasNextLine()) {
            String line = in.nextLine();
            String[] parts = line.split(" = ");
            String[] cities = parts[0].split(" to ");
            int distance = Integer.parseInt(parts[1]);

            // Add the distance in both directions
            distances.putIfAbsent(cities[0], new HashMap<>());
            distances.putIfAbsent(cities[1], new HashMap<>());
            distances.get(cities[0]).put(cities[1], distance);
            distances.get(cities[1]).put(cities[0], distance);
        }
        in.close();

        // Extract all unique locations
        Set<String> locations = distances.keySet();

        // Generate all permutations of the locations
        List<List<String>> permutations = generatePermutations(new ArrayList<>(locations));

        // Find the longest route distance
        int longestDistance = Integer.MIN_VALUE;

        for (List<String> route : permutations) {
            int distance = calculateRouteDistance(route, distances);
            longestDistance = Math.max(longestDistance, distance);
        }

        // Print the longest distance
        System.out.println("Longest route distance: " + longestDistance);
    }

    // Function to calculate the distance of a given route
    private static int calculateRouteDistance(List<String> route, Map<String, Map<String, Integer>> distances) {
        int totalDistance = 0;
        for (int i = 0; i < route.size() - 1; i++) {
            String from = route.get(i);
            String to = route.get(i + 1);
            totalDistance += distances.get(from).get(to);
        }
        return totalDistance;
    }

    // Function to generate all permutations of a list
    private static List<List<String>> generatePermutations(List<String> items) {
        List<List<String>> permutations = new ArrayList<>();
        permute(items, 0, permutations);
        return permutations;
    }

    // Helper function for generating permutations
    private static void permute(List<String> items, int start, List<List<String>> permutations) {
        if (start == items.size() - 1) {
            permutations.add(new ArrayList<>(items));
            return;
        }
        for (int i = start; i < items.size(); i++) {
            Collections.swap(items, i, start);
            permute(items, start + 1, permutations);
            Collections.swap(items, i, start); // Backtrack
        }
    }
}