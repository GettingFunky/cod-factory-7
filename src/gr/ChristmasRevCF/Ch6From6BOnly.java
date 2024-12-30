package gr.ChristmasRevCF;

import java.util.Scanner;

public class Ch6From6BOnly {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userMenuChoice;

        int[] arrayUser = getSixUserIntegers(sc);

        System.out.println("Επιλέξατε τους εξής αριθμούς");
        for (int array : arrayUser) {
            System.out.print(array + " ");
        }
        System.out.println("\n Παρακαλώ επιλέξτε ένα από τα παρακάτω tests: ");

        do {
            System.out.println("****************************************************************");
            System.out.println("Έλεγχος για το κατά πόσο η συγκεκριμένη εξάδα:: ");
            System.out.println("(Επιλογή 1): Έχει πάνω από 3 άρτιους");
            System.out.println("(Επιλογή 2): Έχει πάνω από 3 περιττούς");
            System.out.println("(Επιλογή 3): Έχει πάνω από 3 συνεχόμενους αριθμούς");
            System.out.println("(Επιλογή 4): Έχει πάνω από 3 αριθμούς με τον ίδιο λήγοντα");
            System.out.println("(Επιλογή 5): Έχει πάνω από 3 αριθμούς στην ίδια δεκάδα");
            System.out.println("****************************************************************");
            System.out.println("Επιλέξτε οποιαδήποτε επιλογή από 1 έως και 5");
            System.out.println("Εναλλακτικά επιλέξτε 6 για έξοδο από το πρόγραμμα");
            userMenuChoice = sc.nextInt();
            switch (userMenuChoice) {
                case 1:
                    System.out.println("Επιλογή 1η: ");
                    System.out.println("Έχει πάνω από 3 άρτιους: " + moreThanThreeEvens(arrayUser));
                    break;
                case 2:
                    System.out.println("Επιλογή 2η: ");
                    System.out.println("Έχει πάνω από 3 περιττούς: " + moreThanThreeOdds(arrayUser));
                    break;
                case 3:
                    System.out.println("Επιλογή 3η: ");
                    System.out.println("Έχει πάνω από 3 συνεχόμενους: " + moreThanThreeConsecutive(arrayUser));
                    break;
                case 4:
                    System.out.println("Επιλογή 4η: ");
                    System.out.println("Έχει πάνω από 3 αριθμούς με τον ίδιο λήγοντα: " + moreThanThreeEndings(arrayUser));
                    break;
                case 5:
                    System.out.println("Επιλογή 5η: ");
                    System.out.println("Έχει πάνω από 3 αριθμούς στην ίδια δεκάδα: " + moreThanThreeStartings(arrayUser));
                    break;
                case 6:
                    System.out.println("Τερματισμός προγράμματος...");
                    break;
                default:
                    System.out.println("Λάθος επιλογή, προσπαθήστε ξανά");
                    break;
            }

        } while (userMenuChoice != 6);
    }

    public static int[] getSixUserIntegers(Scanner sc) {
        int[] sixIntegers = new int[6];
        System.out.println("Παρακαλώ εισάγετε 6 ακέραιους, από το 1 έως το 49");
        for (int i = 0; i < sixIntegers.length; i++) {
            System.out.printf("Integer N.%d: ", i + 1);
            sixIntegers[i] = sc.nextInt();
        }
        return sixIntegers;
    }

    public static boolean moreThanThreeEvens(int[] arrayUser) {
        int evenCount = 0;
        for (int array : arrayUser) {
            if (array % 2 == 0) {
                evenCount++;
            }
        }
        return evenCount > 3;
    }

    public static boolean moreThanThreeOdds(int[] arrayUser) {
        int oddCount = 0;
        for (int array : arrayUser) {
            if (array % 2 != 0) {
                oddCount++;
            }
        }
        return oddCount > 3;
    }

    public static boolean moreThanThreeConsecutive(int[] arrayUser) {
        boolean consThree = false;
        for (int i = 0; i < arrayUser.length - 2; i++) {
            if (arrayUser[i] == (arrayUser[i + 1] - 1) && arrayUser[i + 1] == (arrayUser[i + 2] - 1)) {
                consThree = true;
                break;
            }
        }
        return consThree;
    }

    public static boolean moreThanThreeEndings(int[] arrayUser) {
        boolean endThree = false;
        int[] endings = new int[10];

        for (int i = 0; i < arrayUser.length; i++) {
            endings[i % 10]++;
            }
        for (int count : endings)
            if (count > 2) {
                endThree = true;
                break;
        }
        return endThree;
    }

    public static boolean moreThanThreeStartings(int[] arrayUser) {
        boolean startThree = false;
        int[] startings = new int[10];

        for (int i = 0; i < arrayUser.length; i++) {
            startings[i / 10]++;
        }
        for (int count : startings)
            if (count > 2) {
                startThree = true;
                break;
            }
        return startThree;
    }
}
