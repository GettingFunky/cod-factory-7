package gr.codeWars.java;

/**
 * The `WhoLikesIt` class implements a method that generates a string
 * describing who likes an item based on a given array of names.
 *
 * Examples:
 * []                                -->  "no one likes this"
 * ["Peter"]                         -->  "Peter likes this"
 * ["Jacob", "Alex"]                 -->  "Jacob and Alex like this"
 * ["Max", "John", "Mark"]           -->  "Max, John and Mark like this"
 * ["Alex", "Jacob", "Mark", "Max"]  -->  "Alex, Jacob and 2 others like this"
 */
public class WhoLikesIt {

    /**
     * Returns a display text based on the number of people who like an item.
     *
     * @param names an array of strings containing the names of people who like an item
     * @return a string describing who likes the item
     */
    public static String whoLikesIt(String... names) {
        // Use a switch statement to handle different cases based on the length of the names array
        switch (names.length) {
            case 0:
                return "no one likes this"; // No names provided
            case 1:
                return names[0] + " likes this"; // Only one name provided
            case 2:
                return names[0] + " and " + names[1] + " like this"; // Two names provided
            case 3:
                return names[0] + ", " + names[1] + " and " + names[2] + " like this"; // Three names provided
            default:
                // More than three names: show the first two names and the count of others
                return names[0] + ", " + names[1] + " and " + (names.length - 2) + " others like this";
        }
    }

    public static void main(String[] args) {
        // Test cases to demonstrate functionality
        System.out.println(whoLikesIt()); // Output: "no one likes this"
        System.out.println(whoLikesIt("Peter")); // Output: "Peter likes this"
        System.out.println(whoLikesIt("Jacob", "Alex")); // Output: "Jacob and Alex like this"
        System.out.println(whoLikesIt("Max", "John", "Mark")); // Output: "Max, John and Mark like this"
        System.out.println(whoLikesIt("Alex", "Jacob", "Mark", "Max")); // Output: "Alex, Jacob and 2 others like this"

        // Additional test with more names
        String[] names = {"Peter", "Jacob", "Alex", "Max", "John", "Mark"};
        System.out.println(whoLikesIt(names)); // Output: "Peter, Jacob and 4 others like this"
    }
}
