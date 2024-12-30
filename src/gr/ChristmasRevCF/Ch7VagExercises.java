package gr.ChristmasRevCF;

import java.util.Scanner;

public class Ch7VagExercises {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String testString = "Brother";


        for (int i = 0; i < testString.length(); i++ ) {
            int asciiChange = testString.charAt(i) + 1 % 26 ;

            System.out.print(Character.toString ((char) asciiChange));
        }

        System.out.println();

        String testStringDec = "Cspuifs";

        for (int i = 0; i < testStringDec.length(); i++ ) {
            int asciiChange = testStringDec.charAt(i) - 1 % 26 ;

            System.out.print(Character.toString ((char) asciiChange));
        }

    }
}
