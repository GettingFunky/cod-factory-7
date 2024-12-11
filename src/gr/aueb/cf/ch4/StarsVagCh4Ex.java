package gr.aueb.cf.ch4;

import java.util.Scanner;

public class StarsVagCh4Ex {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please give a number of stars to begin the procedure");
        int starsInput = in.nextInt();

        for (int i = 1; i <= starsInput; i++) {
            System.out.print("*");
        }

        System.out.println();
        System.out.println();

        for (int i = 1; i <= starsInput; i++) {
            System.out.println("*");
        }

        System.out.println();
        System.out.println();

        for (int i = 1; i <= starsInput; i++) {
            for (int j = 1; j <= starsInput; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println();
        System.out.println();

        for (int i = 1; i <= starsInput; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println();
        System.out.println();

        for (int i = 1; i <= starsInput; i++) {
            for (int j = starsInput; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
