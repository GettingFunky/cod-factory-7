package gr.aueb.cf.ch7;

import java.util.Scanner;

public class VagStringsEx2 {

    public static void main(String[] args) {
        int keyInput = 0;
        String initialdecWord;
        String initialWord;
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a word to be encrypted");
        initialWord = sc.nextLine();


        System.out.println("Please provide a key");
        keyInput = sc.nextInt();
        sc.nextLine();

        encryption(initialWord, keyInput);

        System.out.println();
        System.out.println("Please enter a word to be decrypted");
        initialdecWord = sc.nextLine();

        decryption(initialdecWord, keyInput);

        }

    public static void encryption (String initialWord, int keyInput) {
        for (int i = 0; i < initialWord.length(); i++) {
            int encryptedValue = initialWord.charAt(i) + keyInput;
            char encryptedLetter = (char) encryptedValue;
            System.out.print(encryptedLetter);

        }
    }

    public static void decryption (String initialdecWord, int keyInput) {
        for (int i = 0; i < initialdecWord.length(); i++) {
            int decryptedValue = initialdecWord.charAt(i) - keyInput;
            char decryptedLetter = (char) decryptedValue;
            System.out.print(decryptedLetter);

    }
    }
}

