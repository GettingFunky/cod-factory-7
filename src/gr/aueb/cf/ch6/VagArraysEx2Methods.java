package gr.aueb.cf.ch6;

import java.util.Scanner;

/**
 * Gets user input for array length
 * and calculates methods such as
 * doubling the array values and
 * looking for specific values
 */
public class VagArraysEx2Methods {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrayLength = 0;
        int userChoice = 0;
        int userNumberPosition = 0;
        boolean isPositive = false;
        boolean isAllPositive = true;



        arrayLength = initializeArray(sc);

        int[] array = new int[arrayLength];

        array = randomizeArray(arrayLength);

        do {

            userChoice = printMenu(sc);

            switch (userChoice) {
                case 1:
                    userNumberPosition = findInteger(sc, array);
                    if (userNumberPosition == -1) {
                        System.out.println("Ο αριθμός δεν βρέθηκε.");
                    } else {
                        System.out.printf("Ο αριθμός βρέθηκε στη θέση %d", userNumberPosition + 1);
                    }
                    break;
                case 2:
                    printEven(array);
                    break;
                case 3:
                    int[] doubleArray = doubleIntegers(array);
                    System.out.println();
                    for (int i = 0; i < array.length; i++) {
                        System.out.print(doubleArray[i] + " ");
                    }
                    break;
                case 4:
                    isPositive = isPositive(array);
                    System.out.printf("Ύπαρξη θετικών αριθμών στον πίνακα: %b", isPositive);
                    break;
                case 5:
                    isAllPositive = isAllPositive(array);
                    System.out.printf("Ύπαρξη αποκλειστικά θετικών αριθμών στον πίνακα: %b", isAllPositive);
                    break;
                case 6:
                    System.out.println("Επιλέξατε έξοδο");
                    System.out.println("Τερματισμός προγράμματος...");
                    break;
                default:
                    System.out.println("Error in choice");
                    break;
            }
        } while (userChoice != 6);
    }

    /**
     * Gets user input and initializes
     * a new array based on choice
     */
    public static int initializeArray(Scanner sc) {
        System.out.println("Please enter the amount of random integers to fill the array with:");
        int arrayLength = sc.nextInt();
        return arrayLength;
    }

    /**
     * Randomizes the array and
     * prints the result
     */
    public static int[] randomizeArray(int arrayLength) {
    int[] array = new int[arrayLength];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        return array;
    }

    public static int printMenu(Scanner sc) {
        System.out.println();
        System.out.println("******************************************************************************");
        System.out.println("Επιλέξτε κάποια διεργασία:");
        System.out.println("1. Αναζήτηση ενός στοιχείου στον πίνακα");
        System.out.println("2. Φιλτράρισμα των ζυγών");
        System.out.println("3. Αντικατάσταση κάθε στοιχείου του πίνακα με το διπλάσιο");
        System.out.println("4. Έλεγχος αν υπάρχει έστω ένας θετικός αριθμός");
        System.out.println("5. Έλεγχος αν όλα τα στοιχεία του πίνακα είναι θετικοί");
        System.out.println("6. Έξοδος από το πρόγραμμα");
        System.out.println("******************************************************************************");
        int userChoice = sc.nextInt();
        return userChoice;
    }

    public static int findInteger(Scanner sc, int[] array) {
        System.out.println("Επιλέξατε αναζήτηση κάποιου αριθμού");
        System.out.println("Ποιον αριθμό θα θέλατε να αναζητήσετε;");
        int userNumber = sc.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == userNumber) {
                return i;
            }
        }
                return -1;
    }

    public static void printEven(int[] array) {
        System.out.println("Επιλέξατε φιλτράρισμα των ζυγών");
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
    }

    public static int[] doubleIntegers(int[] array) {
        int[] doubleArray = new int[array.length];
        System.out.println("Επιλέξατε αντικατάσταση κάθε στοιχείου του πίνακα με το διπλάσιο");
        for (int i = 0; i < array.length; i++) {
            doubleArray[i] = array[i] * 2;
        }
        return doubleArray;
    }

    public static boolean isPositive(int[] array) {
        System.out.println("Επιλέξατε έλεγχο για το κατά πόσο υπάρχει έστω ένας θετικός αριθμός");
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean isAllPositive(int[] array) {
        System.out.println("Επιλέξατε έλεγχο για το κατά πόσο όλοι οι αριθμοί του πίνακα είναι θετικοί");
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= 0) {
                return false;
            }
        }
        return true;
    }
}


