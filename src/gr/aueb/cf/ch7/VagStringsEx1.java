package gr.aueb.cf.ch7;

import java.util.Scanner;

public class VagStringsEx1 {

    public static void main(String[] args) {
        System.out.println("Please enter a word to be encrypted");
        Scanner sc = new Scanner(System.in);
        String initialWord = sc.nextLine();


        System.out.printf("%s\n", initialWord);

        for (int i = 0; i < initialWord.length(); i++) {
            int encryptedValue = initialWord.charAt(i) + 1;
            char encryptedLetter = (char) encryptedValue;
            System.out.print(encryptedLetter);
        }
        System.out.println();
        System.out.println("Please enter a word to be decrypted");

        String initialdecWord = sc.nextLine();

        for (int i = 0; i < initialdecWord.length(); i++) {
            int decryptedValue = initialdecWord.charAt(i) - 1;
            char decryptedLetter = (char) decryptedValue;
            System.out.print(decryptedLetter);
        }
    }
}
