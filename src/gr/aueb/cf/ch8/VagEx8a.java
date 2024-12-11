package gr.aueb.cf.ch8;

import java.util.Scanner;

public class VagEx8a {

    public static void main(String[] args) {
        try {
            printMenu();
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public static void printMenu() {
        System.out.println("Please select one of the following:");
        System.out.println("        Option 1");
        System.out.println("        Option 2");
        System.out.println("        Option 3");
        System.out.println("        Option 4");
        System.out.println("        Exit");

        int userChoice = getChoice(); // Καλούμε τη μέθοδο για να πάρουμε επιλογή

        // Εκτύπωση αποτελέσματος
        System.out.println("You selected option: " + userChoice);
    }

    public static int getChoice() {
        Scanner sc = new Scanner(System.in);
        int userChoice = -1;

        while (true) {
            System.out.println("Enter your choice (1-5):");
            if (sc.hasNextInt()) {
                userChoice = sc.nextInt();
                if (userChoice >= 1 && userChoice <= 5) {
                    // Αν η επιλογή είναι σωστή, επιστρέφουμε
                    return userChoice;
                } else {
                    // Ρίχνουμε IllegalArgumentException αν είναι εκτός 1-5
                    throw new IllegalArgumentException("Choice must be between 1 and 5.");
                }
            } else {
                // Καθαρισμός buffer για λάθος είσοδο
                System.out.println("Invalid input. Please enter an integer.");
                sc.next();
            }
        }
    }
}
