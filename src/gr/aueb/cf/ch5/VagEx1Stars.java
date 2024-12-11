package gr.aueb.cf.ch4;

import java.util.Scanner;

public class VagEx1Stars {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choiceInput = 0;
        int starsInput = 0;
do {


        printMenu1();
        choiceInput = in.nextInt();

        if (choiceInput == 6) {
            System.out.println("Ευχαριστούμε που επιλέξατε το πρόγραμμα! Τερματισμός...");
            System.exit(0);
        }
        printMenu2();
        starsInput = in.nextInt();

        switch (choiceInput) {
            case 1:
                choice1(starsInput);
                break;
            case 2:
                choice2(starsInput);
                break;
            case 3:
                choice3(starsInput);
                break;
            case 4:
                choice4(starsInput);
                break;
            case 5:
                choice5(starsInput);
                break;
            default:
                System.out.println("Σφάλμα στην επιλογή");
                break;
        }
    }
    while (choiceInput != 6) ;
    }

    public static void printMenu1() {
        System.out.println("1. Εμφάνισε n αστεράκια οριζόντια");
        System.out.println("2. Εμφάνισε n αστεράκια κάθετα");
        System.out.println("3. Εμφάνισε n γραμμές με n αστεράκια");
        System.out.println("4. Εμφάνισε n γραμμές με αστεράκια 1 έως n");
        System.out.println("5. Εμφάνισε n γραμμές με αστεράκια n έως 1");
        System.out.println("6. Έξοδος από το πρόγραμμα");
        System.out.println("Δώσε επιλογή: ");
    }
    public static void printMenu2() {
        System.out.println("Παρακαλώ ορίστε αριθμό αστεριών (αριθμός n): ");
    }
    public static void choice1(int starsInput) {
        for (int i = 1; i <= starsInput; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }
    public static void choice2(int starsInput) {
        for (int i = 1; i <= starsInput; i++) {
            System.out.println("*");
        }
        System.out.println("");
    }
    public static void choice3(int starsInput) {
        for (int i = 1; i <= starsInput; i++) {
            choice1(starsInput);
        }
    }
    public static void choice4(int starsInput) {
        for (int i = 1; i <= starsInput; i++) {
            choice1(i);
        }
    }
    public static void choice5(int starsInput) {
        for (int i = starsInput; i >= 1; i--) {
            choice1(i); // Χρήση της choice1 με i ως αριθμό αστεριών
        }
        System.out.println("");
    }
    }