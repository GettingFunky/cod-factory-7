package gr.codeWars.java;

import java.util.ArrayList;
import java.util.Arrays;

public class PokerFlush {
    public static void main(String[] args) {
        ArrayList<String> pokerHand1 = new ArrayList<>(Arrays.asList("AS", "3S", "9S", "KS", "4S"));
        ArrayList<String> pokerHand2 = new ArrayList<>(Arrays.asList("AD", "4S", "7H", "KS", "10S"));

        System.out.println(allSameSuitStream(pokerHand1)); // true
        System.out.println(allSameSuitStream(pokerHand2)); // false
    }

    public static boolean allSameSuitStream(ArrayList<String> hand) {
        if (hand.isEmpty()) return false; // Handle empty list case

        char suit = hand.get(0).charAt(hand.get(0).length() - 1);

        for (String card : hand) {
            if (card.charAt(card.length() - 1) != suit) {
                return false; // Αν βρούμε έστω και μία κάρτα που έχει διαφορετικό σύμβολο, επιστρέφουμε false
            }
        }
        return true; // Αν όλες οι κάρτες έχουν το ίδιο σύμβολο, επιστρέφουμε true
    }
}
