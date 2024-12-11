package gr.aueb.cf.ch6;

import java.util.Scanner;

/**
 * Gets user input for array length
 * and calculates methods such as
 * doubling the array values and
 * looking for specific values
 */
public class VagArraysEx2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrayLength = 0;
        int userChoice = 0;
        int userNumber = 0;
        int timesFound = 0;
        int evenCount = 0;
        boolean isPositive = false;
        boolean isAllPositive = true;

        System.out.println("Please enter the amount of random integers to fill the array with:");
        arrayLength = sc.nextInt();

        int[] array = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("******************************************************************************");
        System.out.println("Επιλέξτε κάποια διεργασία:");
        System.out.println("1. Αναζήτηση ενός στοιχείου στον πίνακα");
        System.out.println("2. Φιλτράρισμα των ζυγών");
        System.out.println("3. Mapping κάθε στοιχείου του πίνακα με το διπλάσιο");
        System.out.println("4. Έλεγχος αν υπάρχει έστω ένας θετικός αριθμός");
        System.out.println("5. Έλεγχος αν όλα τα στοιχεία του πίνακα είναι θετικοί");
        System.out.println("6. Έξοδος από το πρόγραμμα");
        System.out.println("******************************************************************************");

        userChoice = sc.nextInt();

        switch (userChoice) {
            case 1:
                System.out.println("Επιλέξατε αναζήτηση κάποιου αριθμού");
                System.out.println("Ποιον αριθμό θα θέλατε να αναζητήσω;");
                userNumber = sc.nextInt();

                for (int i = 0; i < arrayLength; i++) {
                    if (array[i] == userNumber) {
                        timesFound++;
                    }
                }
                System.out.printf("Ο αριθμός %d βρέθηκε %d φορές", userNumber, timesFound);
                break;
            case 2:
                System.out.println("Επιλέξατε φιλτράρισμα των ζυγών");
                System.out.println();
                for (int i = 0; i < arrayLength; i++) {
                    if (array[i] % 2 == 0) {
                        evenCount++;
                        System.out.print(array[i] + " ");
                    }
                }
                System.out.println();
                System.out.printf("Η διαδικασία ολοκληρώθηκε. Βρέθηκαν %d ζυγοί αριθμοί.", evenCount);
                break;
            case 3:
                System.out.println("Επιλέξατε mapping κάθε στοιχείου του πίνακα με το διπλάσιο");
                System.out.println();
                int [] arrayDouble = new int[arrayLength];
                for (int i = 0; i < arrayLength; i++) {
                    arrayDouble[i] = array[i] * 2;
                    System.out.print(arrayDouble[i] + " ");
                }
                System.out.println();
                System.out.println("Η διαδικασία ολοκληρώθηκε");
                break;
            case 4:
                System.out.println("Επιλέξατε έλεγχο για το κατά πόσο υπάρχει έστω ένας θετικός αριθμός");
                for (int i = 0; i < arrayLength; i++) {
                    if (array[i] > 0) {
                        isPositive = true;
                        break;
                    }
                }
                System.out.printf("Ύπαρξη θετικών αριθμών στον πίνακα: %b", isPositive);
                break;
            case 5:
                System.out.println("Επιλέξατε έλεγχο για το κατά πόσο όλοι οι αριθμοί του πίνακα είναι θετικοί");
                for (int i = 0; i < arrayLength; i++) {
                    if ( array[i] <= 0) {
                        isAllPositive = false;
                        break;
                    }
                }
                System.out.printf("Ύπαρξη αποκλειστικά θετικών αριθμών στον πίνακα: %b", isAllPositive);

            case 6:
                System.out.println("Επιλέξατε έξοδο");
                System.out.println("Τερματισμός προγράμματος...");
                break;
            default:
                System.out.println("Error in choice");
                break;
        }


    }
}
