package gr.ChristmasRevCF;

import java.util.Scanner;

public class Ch8VagExercises {

    // Κοινός Scanner για όλο το πρόγραμμα
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            try {
                printMenu(); // Εμφάνιση μενού
                int userChoice = getChoice(); // Λήψη επιλογής χρήστη
                System.out.println("You selected: " + userChoice);
                if (userChoice == 5) { // Έξοδος αν επιλεγεί η επιλογή 5
                    break;
                }
            } catch (IllegalArgumentException e) {
                // Ενημέρωση χρήστη για το σφάλμα
                System.err.println("Invalid choice. Please try again.");
            }
        }
        System.out.println("Goodbye!"); // Μήνυμα εξόδου
    }

    /**
     * Εμφανίζει το μενού επιλογών.
     */
    public static void printMenu() {
        System.out.println("Select one of the following options:");
        System.out.println("1. Option 1");
        System.out.println("2. Option 2");
        System.out.println("3. Option 3");
        System.out.println("4. Option 4");
        System.out.println("5. Exit");
    }

    /**
     * Λαμβάνει και επαληθεύει την επιλογή του χρήστη.
     * @return Την επιλογή του χρήστη.
     * @throws IllegalArgumentException Αν η επιλογή είναι εκτός ορίων.
     */
    public static int getChoice() throws IllegalArgumentException {
        int userChoice;

        // Έλεγχος για ακέραιο
        while (!sc.hasNextInt()) {
            System.out.println("Please enter a valid integer between 1 and 5.");
            sc.nextLine(); // Καθαρισμός μη έγκυρης εισόδου
        }
        userChoice = sc.nextInt(); // Ανάγνωση της επιλογής

        // Έλεγχος εγκυρότητας
        if (userChoice < 1 || userChoice > 5) {
            throw new IllegalArgumentException("Invalid choice: " + userChoice + ". Must be between 1 and 5.");
        }
        return userChoice; // Επιστροφή έγκυρης επιλογής
    }
}
