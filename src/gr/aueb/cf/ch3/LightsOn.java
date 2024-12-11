package gr.aueb.cf.ch3;

import java.util.Scanner;

public class LightsOn {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isItRaining, isItDark = false;
        boolean lightsOn = false;
        int inputSpeed = 0;
        final int MAX_SPEED = 100;

        System.out.println("Αν βρέχει και είναι σκοτάδι, ή βρέχει και τρέχεις πολύ, θα ανάψω τα φώτα");

        System.out.println("Βρέχει; Απαντήστε με ένα απλό true ή false");
        isItRaining = in.nextBoolean();

        System.out.println("Είναι σκοτάδι; Απαντήστε με ένα απλό true ή false");
        isItDark = in.nextBoolean();

        System.out.println("Με πόσα χλμ/ώρα ταξιδεύει το αυτοκίνητο");
        inputSpeed = in.nextInt();

        lightsOn = isItRaining && (isItDark || inputSpeed > MAX_SPEED);

        System.out.printf("Τα φώτα ανάβουν:, %b", lightsOn);





    }
}
