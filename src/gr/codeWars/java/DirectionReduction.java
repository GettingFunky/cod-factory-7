package gr.codeWars.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class DirectionReduction {

    public static String[] dirReduc(String[] arr) {
        List<String> result = new ArrayList<>();

        for (String direction : arr) {
            if (!result.isEmpty() && isOpposite(result.get(result.size() - 1), direction)) {
                // Αν η τρέχουσα κατεύθυνση αναιρεί την τελευταία στην λίστα, αφαιρούμε την τελευταία
                result.remove(result.size() - 1);
            } else {
                // Διαφορετικά, προσθέτουμε την κατεύθυνση στη λίστα
                result.add(direction);
            }
        }

        // Μετατρέπουμε τη λίστα σε πίνακα και την επιστρέφουμε
        return result.toArray(new String[0]);
    }

    // Βοηθητική μέθοδος για να ελέγξουμε αν δύο κατευθύνσεις είναι αντίθετες
    private static boolean isOpposite(String dir1, String dir2) {
        return (Objects.equals(dir1, "NORTH") && Objects.equals(dir2, "SOUTH")) ||
                (Objects.equals(dir1, "SOUTH") && Objects.equals(dir2, "NORTH")) ||
                (Objects.equals(dir1, "EAST") && Objects.equals(dir2, "WEST")) ||
                (Objects.equals(dir1, "WEST") && Objects.equals(dir2, "EAST"));
    }

    public static void main(String[] args) {
        String[] directions = {"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"};
        String[] reduced = dirReduc(directions);
        System.out.println(Arrays.toString(reduced)); // ["WEST"]

        directions = new String[]{"NORTH", "SOUTH", "EAST", "WEST"};
        reduced = dirReduc(directions);
        System.out.println(Arrays.toString(reduced)); // []

        directions = new String[]{"NORTH", "EAST", "WEST", "SOUTH", "WEST", "WEST"};
        reduced = dirReduc(directions);
        System.out.println(Arrays.toString(reduced)); // ["WEST", "WEST"]
    }
}